/*
 * 
 * package stepDefinitions;
 * 
 * import java.io.IOException;
 * 
 * import cucumber.api.java.After; import cucumber.api.java.Before; import
 * cucumber.api.java.en.And; import cucumber.api.java.en.Given; import
 * cucumber.api.java.en.Then; import cucumber.api.java.en.When; import
 * pages.addUser; import utilities.TestBase;
 * 
 * public class addUserStepDefinition extends TestBase { public
 * addUserStepDefinition() throws IOException { super(); }
 * 
 * addUser user;
 * 
 * @Before(order = 0) public void openBrowser() throws IOException {
 * TestBase.initialization(); }
 * 
 * @Before(order = 1) public void Login() throws IOException { user = new
 * addUser(); user.login(); }
 * 
 * @Given("^user is on website$") public void user_is_on_website() throws
 * Throwable { System.out.println("We already logged in"); }
 * 
 * @When("^user click on Admin$") public void user_click_on_Admin() throws
 * Throwable { user.click_admin(); Thread.sleep(2000);}
 * 
 * @Then("^user click on Add$") public void user_click_on_Add() throws Throwable
 * { user.click_add(); }
 * 
 * @And("^user add details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$"
 * ) public void user_add_details(String UserRole, String Status, String
 * EmpName, String UserName, String Pass, String ConfirmPass) throws Throwable {
 * 
 * user.add_details(UserRole,Status,EmpName,UserName,Pass,ConfirmPass); }
 * 
 * 
 * 
 * @After(order = 0) public void user_log_out() throws Throwable {
 * user.log_out(); }
 * 
 * 
 * 
 * }
 * 
 */