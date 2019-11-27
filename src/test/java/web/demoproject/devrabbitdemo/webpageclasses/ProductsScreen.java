package web.demoproject.devrabbitdemo.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class ProductsScreen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"executed_user_id\":29,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://devrabbit.com\",\"report_upload_url\":\"https://smartqe.io:443/UploadReportFile\",\"project_name\":\"DemoProject\",\"project_description\":\"This is for Demo\",\"project_id\":453,\"module_name\":\"DevrabbitDemo\",\"module_description\":\"\",\"sub_module_id\":0,\"module_id\":773,\"testcase_name\":\"TC_TC_DevRabbit_ContactDemo\",\"testcase_id\":652,\"testset_id\":0,\"executed_timestamp\":-1423745452,\"browser_type\":\"chrome\",\"testcase_overwrite\":false,\"client_timezone_id\":\"Asia/Calcutta\"}";

	public static String projectName = "demoproject";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public ProductsScreen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Talk to our experts')]")	
	private WebElement	TalkToOurExperts_428627a;
	public String clkaTalkToOurExperts_428627() {
		waitForExpectedElement(driver, TalkToOurExperts_428627a);		
		String text = TalkToOurExperts_428627a.getText();
		TalkToOurExperts_428627a.click();
		return text;
	}

}