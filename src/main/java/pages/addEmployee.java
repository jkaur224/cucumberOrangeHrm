
  package pages;
  
  import java.io.IOException; import java.util.List;
  
  import org.junit.Assert; import org.openqa.selenium.By; import
  org.openqa.selenium.WebElement; import org.openqa.selenium.support.FindBy;
  import org.openqa.selenium.support.PageFactory; import
  org.openqa.selenium.support.ui.ExpectedConditions; import
  org.openqa.selenium.support.ui.WebDriverWait;
  
  import cucumber.api.DataTable; import utilities.TestBase;
  
  public class addEmployee extends TestBase {
  
  login log_in;
  
  @FindBy(css = ".oxd-topbar-header-title") WebElement dashboard;
  
  @FindBy(linkText = "PIM") WebElement pim;
  
  @FindBy(xpath = "//button[text()=' Add ']") WebElement addEmp;
  
  @FindBy(name = "firstName") WebElement firstName;
  
  @FindBy(name = "middleName") WebElement middleName;
  
  @FindBy(name = "lastName") WebElement lastName;
  
  @FindBy(xpath =
  "(//div[@class='oxd-input-group__label-wrapper'])[6]//following-sibling::div//input")
  WebElement id;
  
  @FindBy(css = ".oxd-icon-button.employee-image-action") WebElement image;
  
  @FindBy(xpath = "//button[@type='submit']") WebElement save;
  
  public addEmployee() throws IOException { PageFactory.initElements(driver,
  this); }
  
  public void login() throws IOException { log_in = new login();
  log_in.inputDetails(); log_in.clickLogin(); log_in.verifyLogin(); }
  
  public void click_PIM() { pim.click(); }
  
  public void verifyDashboard() { Assert.assertEquals(true,
  dashboard.isDisplayed()); }
  
  public void click_addEmp() { addEmp.click(); }
  
  public void add_details(DataTable data) throws InterruptedException {
  List<List<String>> table = data.raw();
  firstName.sendKeys(table.get(0).get(0));
  middleName.sendKeys(table.get(0).get(1));
  lastName.sendKeys(table.get(0).get(2)); Thread.sleep(4000);
  id.sendKeys(table.get(0).get(3)); Thread.sleep(4000); }
  
  public void add_img() throws IOException { image.click(); 
  //WebDriverWait wait = new WebDriverWait(driver, 20);
  Runtime.getRuntime().exec(
  "C:\\QA\\SeleniumWorkSpace\\CucumberPomOrangeHRM\\au3photo.exe");
  save.click(); }
  
  public void click_save() { save.click(); }
  
  public void log_out() throws InterruptedException { log_in.logout(); }
  
  }
 