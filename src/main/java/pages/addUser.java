package pages;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.TestBase;

public class addUser extends TestBase {
	
	
	login log_in;
	
	
	@FindBy(xpath = "//span[text()='Admin']")
	WebElement admin;
	
	@FindBy(xpath = "(//button[@type='button'])[4]")
	WebElement add;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement save;
	
	@FindBy(xpath = "//div[@class='oxd-form-row']//div[1]//div[1]//div[1]//div[2]//div//div[1]//div[1]")
	WebElement userRole;
	
	@FindBy(xpath = "//div[@role='listbox']")
	List<WebElement> Options;
	
	@FindBy(xpath = "//div[@class='oxd-form-row']//div[1]//div[3]//div[1]//div[2]//div//div[1]//div[1]")
	WebElement status;
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	WebElement empName;
	
	@FindBy(xpath = "//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[4]//div//div[2]//input")
	WebElement userName;
	
	@FindBy(xpath = "//div[@class='oxd-form-actions']//preceding-sibling::div[1]//div//div[1]//div//div[2]//input")
	WebElement pass;
	
	@FindBy(xpath = "//div[@class='oxd-form-actions']//preceding-sibling::div[1]//div//div[2]//div//div[2]//input")
	WebElement confirmPass;
	
	@FindBy(xpath = "//div[@class='orangehrm-container']//div//div[contains(text(),'Jasmine singh')]")
	WebElement user;
	
	public addUser() throws IOException 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login() throws IOException
	{
		log_in = new login();
		log_in.inputDetails();
		log_in.clickLogin();
		log_in.verifyLogin();
	}
	
	public void click_admin()
	{
		admin.click();
	}

	public void click_add() throws InterruptedException
	{
		Thread.sleep(2000);
		add.click();
	}
	
	public void add_details(String UserRole, String Status, String
			  EmpName, String UserName, String Pass, String ConfirmPass) throws InterruptedException
	{
		userRole.click(); 
		System.out.println("***********"); 
		System.out.println(Options.size()); 
		for(int i = 0; i < Options.size(); i++) 
		{
			System.out.println(Options.get(i).getText()); 
			if(Options.get(i).getText().contains(UserRole))
			{ 
				Options.get(i).click();
				System.out.println("clicked"); 
				break;
			} 
		}
		 
		status.click(); 
		System.out.println("***********"); 
		System.out.println(Options.size()); 
		for(int i = 0; i < Options.size(); i++) 
		{
		  System.out.println(Options.get(i).getText()); 
		  if(Options.get(i).getText().contains(Status)) 
		  { Options.get(i).click();
		  System.out.println("clicked"); break; 
		  } 
		}
		
		
		empName.sendKeys("Jasmine singh"); 
		Thread.sleep(5000);
		 
		// Explicitly wait 
		WebDriverWait wait = new WebDriverWait(driver, 20);
		  
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath(
		  "//div[@role='listbox']"), 0)); 
		
		System.out.println("***********");
		System.out.println(Options.size()); 
		for (int i = 0; i < Options.size();i++) 
		{ 
			System.out.println(Options.get(i).getText()); 
			if(Options.get(i).getText().contains(EmpName))
			{   
				Options.get(i).click();
				System.out.println("clicked");
				break;
			} 
		}
		  
		userName.sendKeys(UserName); Thread.sleep(2000);
		  
		pass.sendKeys(Pass);
		  
		confirmPass.sendKeys(ConfirmPass);
		
		click_save();
		Thread.sleep(2000);		  
		// To check whether user is added or not //Go back to Admin
	click_admin();
	Assert.assertTrue(user.isDisplayed());
		  
		  }
	
	public void click_save()
	{
		save.click();
	}
	
	public void log_out() throws InterruptedException
	{
		log_in.logout();
	}

}


