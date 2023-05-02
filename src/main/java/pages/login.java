package pages;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.TestBase;

public class login extends TestBase {
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	@FindBy(css=".oxd-topbar-header-title")
	WebElement headertitle;
	
	@FindBy(linkText="Logout")
	WebElement logout;
	
	@FindBy(className="oxd-userdropdown-name")
	WebElement name;
	
	public login() throws IOException {
		PageFactory.initElements(driver, this);
	}

	public void title()
	{
		String title = driver.getTitle();
		Assert.assertEquals("OrangeHRM", title);
	}
	
	public void inputDetails()
	{
		username.sendKeys(prop.getProperty("username"));	
		password.sendKeys(prop.getProperty("password"));	
	}
	
	public void clickLogin()
	{
		submit.click();
	}
	
	public void verifyLogin()
	{
		Assert.assertEquals(true, headertitle.isDisplayed());
	}
	
	public void logout() throws InterruptedException
	{
	
		name.click();
		logout.click();
	}
	
	public void login_wrongCredentials(String arg1, String arg2)
	{
		username.sendKeys(arg1);
		password.sendKeys(arg2);
	}
}
