package pages;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.TestBase;

public class about extends TestBase {
	login log_in;
	
	@FindBy(linkText = "About")
	WebElement aboutlink;
	
	@FindBy(xpath = "//div[@class='oxd-grid-2 orangehrm-about']//div[4]")
	WebElement version;
	
	@FindBy(xpath = "//div[@role='document']//button")
	WebElement closeButton;

	public about() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public void login() throws IOException
	{
		log_in = new login();
		log_in.inputDetails();
		log_in.clickLogin();
		log_in.verifyLogin();
	}

	public void click_name()
	{
		log_in.name.click();
	}
	
	public void click_about()
	{
		aboutlink.click();
	}
	
	public void see_details()
	{
		Assert.assertEquals("OrangeHRM OS 5.3", version.getText());
		closeButton.click(); 
	}
	
	public void log_out() throws InterruptedException
	{
		log_in.logout();
	}
}
