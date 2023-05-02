/*
 * package stepDefinitions;
 * 
 * import java.io.IOException; import java.util.List;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebElement;
 * 
 * import cucumber.api.DataTable; import cucumber.api.java.After; import
 * cucumber.api.java.Before; import cucumber.api.java.en.Given; import
 * cucumber.api.java.en.Then; import pages.addEmployee; import
 * utilities.TestBase;
 * 
 * public class addEmployeeStepDefinition extends TestBase {
 * 
 * public addEmployeeStepDefinition() throws IOException { super(); }
 * 
 * addEmployee emp;
 * 
 * @Before(order = 0) public void openBrowser() throws IOException {
 * TestBase.initialization(); }
 * 
 * @Before(order = 1) public void Login() throws IOException { emp = new
 * addEmployee(); emp.login(); emp.verifyDashboard(); }
 * 
 * @Given("^user is on website$") public void user_is_on_website() throws
 * Throwable { System.out.println("We already logged in"); }
 * 
 * @Then("^user click on PIM$") public void user_click_on_PIM() throws Throwable
 * { emp.click_PIM(); }
 * 
 * @Then("^user click on Add Employee$") public void
 * user_click_on_Add_Employee() throws Throwable { emp.click_addEmp(); }
 * 
 * @Then("^user give details EmployeeFirstName,EmployeeMiddleName,EmployeeLastName,ID$"
 * ) public void
 * user_give_details_EmployeeFirstName_EmployeeMiddleName_EmployeeLastName_ID(
 * DataTable data)throws Throwable { emp.add_details(data); }
 * 
 * @Then("^add picture of employee$") public void add_picture_of_employee()
 * throws Throwable { emp.add_img(); }
 * 
 * 
 * @After(order = 0) public void click_on_Save() throws Throwable {
 * emp.click_save(); }
 * 
 * @After(order = 1) public void user_log_out() throws Throwable {
 * emp.log_out(); }
 * 
 * }
 */