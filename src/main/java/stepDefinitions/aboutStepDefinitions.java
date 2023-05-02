/*
 * package stepDefinitions;
 * 
 * import java.io.IOException;
 * 
 * import org.junit.Assert; import org.openqa.selenium.By; import
 * org.openqa.selenium.WebElement;
 * 
 * import cucumber.api.java.en.Given; import cucumber.api.java.en.Then; import
 * pages.about; import utilities.TestBase;
 * 
 * public class aboutStepDefinitions extends TestBase{
 * 
 * public aboutStepDefinitions() throws IOException { super(); } about details;
 * 
 * @Given("^user succesfully login to the website$") public void
 * user_succesfully_login_to_the_website() throws Throwable {
 * TestBase.initialization(); details = new about(); details.login(); }
 * 
 * @Then("^user log out$") public void user_log_out() throws Throwable {
 * details.log_out(); }
 * 
 * @Then("^user click on name displayed$") public void
 * user_click_on_name_displayed() throws Throwable { details.click_name(); }
 * 
 * @Then("^user click on about$") public void user_click_on_about() throws
 * Throwable { details.click_about(); }
 * 
 * @Then("^user see details$") public void user_see_details() throws Throwable {
 * details.see_details(); }
 * 
 * 
 * }
 * 
 */