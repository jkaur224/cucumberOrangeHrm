package stepDefinitions;
/*
 * package stepDefinition;
 * 
 * import java.util.List; import java.util.Map; import
 * java.util.concurrent.TimeUnit;
 * 
 * import org.junit.Assert; import org.openqa.selenium.By; import
 * org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.chrome.ChromeOptions;
 * 
 * import cucumber.api.DataTable; import cucumber.api.java.en.Given; import
 * cucumber.api.java.en.Then; import cucumber.api.java.en.When;
 * 
 * public class addEmployeemapStepDefinition {
 * 
 * WebDriver driver;
 * 
 * @Given("^user is on website$") public void user_is_on_website() throws
 * Throwable { System.setProperty("webdriver.chrome.driver",
 * "C:\\QA\\SeleniumWorkSpace\\chromedriver.exe"); ChromeOptions options = new
 * ChromeOptions(); options.setExperimentalOption("excludeSwitches", new
 * String[] { "enable-automation" }); driver = new ChromeDriver(options);
 * driver.get(
 * "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //
 * implicitly wait driver.manage().timeouts().implicitlyWait(10,
 * TimeUnit.SECONDS); driver.manage().window().maximize(); }
 * 
 * @When("^title of page is$") public void title_of_page_is() throws Throwable {
 * Assert.assertEquals("OrangeHRM", driver.getTitle()); }
 * 
 * @Then("^user input username and password$") public void
 * user_input_username_and_password(DataTable data){ List<List<String>>table =
 * data.asLists(String.class);
 * driver.findElement(By.name("username")).sendKeys(table.get(0).get(0));
 * driver.findElement(By.name("password")).sendKeys(table.get(0).get(1)); }
 * 
 * @Then("^user click on login$") public void user_click_on_login() throws
 * Throwable { driver.findElement(By.xpath("//button[@type='submit']")).click();
 * }
 * 
 * @Then("^user not able to login$") public void user_not_able_to_login() throws
 * Throwable { Assert.assertEquals("OrangeHRM", driver.getTitle()); }
 * 
 * @Then("^user click on PIM$") public void user_click_on_PIM() throws Throwable
 * { driver.findElement(By.linkText("PIM")).click(); }
 * 
 * @Then("^user click on Add Employee$") public void
 * user_click_on_Add_Employee() throws Throwable {
 * driver.findElement(By.xpath("//button[text()=' Add ']")).click(); }
 * 
 * @Then("^user give details EmployeeFirstName,EmployeeMiddleName,EmployeeLastName,ID$"
 * ) public void
 * user_give_details_EmployeeFirstName_EmployeeMiddleName_EmployeeLastName_ID(
 * DataTable data)throws Throwable { List<Map<String,String>> table =
 * data.asMaps(String.class, String.class); for(Map<String,String> e : table ) {
 * driver.findElement(By.name("firstName")).sendKeys(e.get("EmployeeFirstName"))
 * ;
 * driver.findElement(By.name("middleName")).sendKeys(e.get("EmployeeMiddleName"
 * ));
 * driver.findElement(By.name("lastName")).sendKeys(e.get("EmployeeLastName"));
 * driver.findElement(By.name("lastName")).sendKeys(e.get("EmployeeLastName"));
 * add_picture_of_employee(); click_on_Save(); } }
 * 
 * @Then("^add picture of employee$") public void add_picture_of_employee()
 * throws Throwable {
 * driver.findElement(By.cssSelector(".oxd-icon-button.employee-image-action")).
 * click(); Runtime.getRuntime().exec(
 * "C:\\QA\\SeleniumWorkSpace\\OrangeHRM\\au3photo.exe"); //
 * "C:\QA\SeleniumWorkSpace\OrangeHRM\au3photo.exe" Thread.sleep(8000); }
 * 
 * @Then("^click on Save$") public void click_on_Save() throws Throwable {
 * driver.findElement(By.xpath("//button[@type='submit']")).click(); }
 * 
 * }
 */
