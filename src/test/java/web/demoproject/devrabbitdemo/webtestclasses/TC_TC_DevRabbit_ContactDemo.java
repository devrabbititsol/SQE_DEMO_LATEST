package web.demoproject.devrabbitdemo.webtestclasses;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.configurations.Constants;
import com.configurations.ExtentConfigurations;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import web.demoproject.devrabbitdemo.webpageclasses.HomeScreen;
import web.demoproject.devrabbitdemo.webpageclasses.ProductsScreen;
import web.demoproject.devrabbitdemo.webpageclasses.ContactUsScreen;
import com.utilities.BaseClass;
import com.utilities.ConfigFilesUtility;
import com.utilities.Utilities;
import org.json.JSONObject;

@SuppressWarnings("unused")
public class TC_TC_DevRabbit_ContactDemo extends BaseClass {
	ExtentReports reports;
	ExtentTest test;
	ITestResult result;
	private Logger logger;
	private ConfigFilesUtility configFileObj;
	private String browserName = "chrome";
	public boolean isElementDispalyed = false;
	public static final int datasetsLength = 1;
	String[] datasetNames = new String[] {"Dataset"};

	public TC_TC_DevRabbit_ContactDemo() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		logger = Logger.getLogger(TC_TC_DevRabbit_ContactDemo.class);
		configFileObj = new ConfigFilesUtility();
		configFileObj.loadPropertyFile("tc_tc_devrabbit_contactdemo.properties");
	}

	@BeforeTest
	@Parameters("browser")
	public void browserName(String browser) throws Exception {
		browserName = browser;
		reports = ExtentConfigurations.getExtentInstance(reportsPath, projectPath, HomeScreen.projectName);
		test = reports.startTest(setTestcaseName(browserName,"TC_TC_DevRabbit_ContactDemo - " + datasetNames[0]));
	}

	
	public void setUP() throws Exception {
		String primaryInfo = HomeScreen.primaryInfo;
		Constants.PRIMARY_INFO = primaryInfo;
		driver = launchBrowser(browserName, configFileObj);
	}

	public void HomeScreenTest(int i) throws Exception {

	 try{
		int datasetScreencount = 1;
		HomeScreen objHomeScreen = PageFactory.initElements(driver, HomeScreen.class);
		testLogHeader(test, "Verify HomeScreen page");
		objHomeScreen.clkaProducts_428489();
		printSuccessLogAndReport(test, logger,  "Text is displayed as : ProductsLink");

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	

	public void ProductsScreenTest(int i) throws Exception {

	 try{
		int datasetScreencount = 2;
		ProductsScreen objProductsScreen = PageFactory.initElements(driver, ProductsScreen.class);
		testLogHeader(test, "Verify ProductsScreen page");
		objProductsScreen.clkaTalkToOurExperts_428627();
		printSuccessLogAndReport(test, logger,  "Text is displayed as : TalkToOurExpertsLink");

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	

	public void ContactUsScreenTest(int i) throws Exception {

	 try{
		int datasetScreencount = 3;
		ContactUsScreen objContactUsScreen = PageFactory.initElements(driver, ContactUsScreen.class);
		testLogHeader(test, "Verify ContactUsScreen page");
		objContactUsScreen.clkaContact_428853();
		printSuccessLogAndReport(test, logger,  "Text is displayed as : ContactLink");
		objContactUsScreen.fillinputName_428796(configFileObj.getProperty("Name"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered Name : " + configFileObj.getProperty("Name"+ i + datasetScreencount));
		objContactUsScreen.fillinputEmail_428844(configFileObj.getProperty("Email"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered Email : " + configFileObj.getProperty("Email"+ i + datasetScreencount));
		objContactUsScreen.fillinputPhone_428791(configFileObj.getProperty("Phone"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered Phone : " + configFileObj.getProperty("Phone"+ i + datasetScreencount));
		objContactUsScreen.clkselectAreaOfInterest_428877();
		printInfoLogAndReport(test, logger, "Clicked on AreaOfInterest dropdown and selected Products");
				objContactUsScreen.filltextareaMessage_428804(configFileObj.getProperty("Message"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered Message : " + configFileObj.getProperty("Message"+ i + datasetScreencount));

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	
	@Test
	public void screensTest() throws Exception {
		for(int datasets = 1; datasets <= ContactUsScreen.datasetsLength; datasets++) {
			isElementDispalyed = true;			
			setUP();			
			if(datasets > 1) { test = reports.startTest(setTestcaseName(browserName,"TC_TC_DevRabbit_ContactDemo - " + datasetNames[datasets-1]));}
			if(isElementDispalyed) { HomeScreenTest(datasets);}
			if(isElementDispalyed) { ProductsScreenTest(datasets);}
			if(isElementDispalyed) { ContactUsScreenTest(datasets);}
			tearDown();
		}	}

	
	public void tearDown() throws Exception {
		reports.endTest(test);
		reports.flush();
		driver.quit();
	}
}