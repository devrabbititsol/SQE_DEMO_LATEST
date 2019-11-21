package web.demoproject.devrabbitdemo.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.support.ui.Select;

@SuppressWarnings("unused")
public class ContactUsScreen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"executed_user_id\":29,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://devrabbit.com\",\"report_upload_url\":\"https://smartqe.io:443/UploadReportFile\",\"project_name\":\"DemoProject\",\"project_description\":\"This is for Demo\",\"project_id\":453,\"module_name\":\"DevrabbitDemo\",\"module_description\":\"\",\"sub_module_id\":0,\"module_id\":773,\"testcase_name\":\"TC_TC_DevRabbit_ContactDemo\",\"testcase_id\":652,\"testset_id\":0,\"executed_timestamp\":-1927875237,\"browser_type\":\"chrome\",\"testcase_overwrite\":true,\"client_timezone_id\":\"Asia/Calcutta\"}";

	public static String projectName = "demoproject";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public ContactUsScreen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//li[@id='menu-item-1476']/a")	
	private WebElement	Contact_428853a;
	public String clkaContact_428853() {
		waitForExpectedElement(driver, Contact_428853a);		
		String text = Contact_428853a.getText();
		Contact_428853a.click();
		return text;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='ninja_forms_field_19']")	
	private WebElement	Name_428796input;
	public String fillinputName_428796(String varInputValue) {
		waitForExpectedElement(driver, Name_428796input);
		Name_428796input.sendKeys(varInputValue);
		return text;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='ninja_forms_field_20']")	
	private WebElement	Email_428844input;
	public String fillinputEmail_428844(String varInputValue) {
		waitForExpectedElement(driver, Email_428844input);
		Email_428844input.sendKeys(varInputValue);
		return text;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='ninja_forms_field_23']")	
	private WebElement	Phone_428791input;
	public String fillinputPhone_428791(String varInputValue) {
		waitForExpectedElement(driver, Phone_428791input);
		Phone_428791input.sendKeys(varInputValue);
		return text;
	}

	@FindBy(how = How.XPATH, using = "//select[@id='ninja_forms_field_24']")	
	private WebElement	AreaOfInterest_428877select;
	public String clkselectAreaOfInterest_428877() {
		waitForExpectedElement(driver, AreaOfInterest_428877select);		
		Select selectOption = new Select(AreaOfInterest_428877select);
		selectOption.selectByVisibleText("Products");
		String text = selectOption.getFirstSelectedOption().getText();
		return text;
	}

	@FindBy(how = How.XPATH, using = "//textarea[@id='ninja_forms_field_26']")	
	private WebElement	Message_428804textarea;
	public String filltextareaMessage_428804(String varInputValue) {
		waitForExpectedElement(driver, Message_428804textarea);
		Message_428804textarea.sendKeys(varInputValue);
		return text;
	}

}