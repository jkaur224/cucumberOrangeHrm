
  package stepDefinitions;
  
  
  import java.io.IOException; import java.util.List;
  
  import org.junit.Assert; import org.openqa.selenium.By; import
  org.openqa.selenium.WebElement; import
  org.openqa.selenium.support.ui.ExpectedConditions;
  
  import cucumber.api.DataTable; import cucumber.api.java.en.Given; import
  cucumber.api.java.en.Then; import cucumber.api.java.en.When; import
  pages.login; import utilities.TestBase;
  
  public class loginStepDefinition extends TestBase {
  
  public loginStepDefinition() throws IOException { super(); }
  
  login log_in;
  
  @Given("^user is on website$") public void user_is_on_website() throws
  Throwable { TestBase.initialization(); }
  
  @When("^title of page is$") public void title_of_page_is() throws Throwable {
  log_in = new login(); log_in.title(); }
  
  @Then("^user input username and password$") public void
  user_input_username_and_password() throws Throwable { log_in.inputDetails();
  }
  
  @Then("^user click on login$") public void user_click_on_login() throws
  Throwable { log_in.clickLogin(); }
  
  @Then("^user logged in$") public void user_logged_in() throws Throwable {
  log_in.verifyLogin(); }
  
  
  @Then("^user log out$") public void user_log_out() throws Throwable {
  log_in.logout(); }
  
  
  @Then("^user get error$") public void user_get_error() throws Throwable {
  WebElement error = driver .findElement(By.
  xpath("//div[@class='oxd-alert-content oxd-alert-content--error']//p"));
  Assert.assertEquals("Invalid credentials", error.getText()); }
  
  @Then("^user not able to login$") public void user_not_able_to_login() throws
  Throwable { Assert.assertEquals("OrangeHRM", driver.getTitle()); }
  
  @Then("^user input \"([^\"]*)\" and \"([^\"]*)\"$")
  public void user_input_and(String arg1, String arg2) throws Throwable {
      
	  log_in.login_wrongCredentials(arg1,arg2);
  
  }
  }

  
 
 