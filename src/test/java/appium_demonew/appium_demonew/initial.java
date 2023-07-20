package appium_demonew.appium_demonew;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class initial {
  
	  @Test
		  public void init () throws MalformedURLException {
		  
				/*
				  DesiredCapabilities cap =new DesiredCapabilities();
				/ * 
				 * cap.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
				 * cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator ");
				 * cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
				 * cap.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
				 * cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
				 * 
				 * 
				 * //cap.setCapability(MobileCapabilityType.APP,
				 * "C:\\Users\\saigaurav\\Downloads\\com.intelloware.apkinfo.apk"); //
				 * cap.setCapability("APP_PACKAGE", "com.android.chrome"); //
				 * cap.setCapability("APP_ACTIVITY", "com.google.android.apps.chrome.Main");
				 * cap.setCapability("chromedriverExecutable",
				 * "C:\\Users\\saigaurav\\Downloads\\chromedriver_win32\\chromedriver.exe"); //
				 * AndroidDriver<MobileElement> driver = new AndroidDriver(cap);
				 * 
				 * 
				 * 
				 * 
				 * AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new
				 * URL("http://127.0.0.1:4723/wd/hub"),cap);
				 * driver.get("https://www.amazon.com");
				 */
		  DesiredCapabilities caps =new DesiredCapabilities();
		  caps.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);

	        //caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome"); // if mobile-Browser execution

	        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"MB45K7L74PCQLVYP"); //caps.setCapability("deviceName", "Android Emulator");

	        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
	        

	     //   caps.setCapability("adbExecTimeout", 50000);

	        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");

	        caps.setCapability(MobileCapabilityType.NO_RESET, true);

	        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 50000);

	        

	        ChromeOptions options = new ChromeOptions();

	        options.setExperimentalOption("androidKeepAppDataDir", true);

	        caps.setCapability(ChromeOptions.CAPABILITY, options);
	   //  caps.setCapability(MobileCapabilityType.APP,"C:\\Users\\saigaurav\\Downloads\\com.android.calculator2 (1).apk");
	        
	        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new
	   	  URL("http://127.0.0.1:4723/wd/hub"), caps); //AppiumURL
	   			 
	     caps.setCapability("chromedriverExecutable",
	   			  "C:\\Users\\saigaurav\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        
	       caps.setCapability("appPackage","com.android.chrome");
	       caps.setCapability("apppActivity","com.google.android.apps.chrome.Main");
			/*
			 * caps.setCapability("chromedriverExecutable",
			 * "C:\\Users\\saigaurav\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 * 
			 * AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new
			 * URL("http://127.0.0.1:4723/wd/hub"), caps); //AppiumURL
			 * 
			 * driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			 * 
			 * driver.get("https://qa.banter.io/ucapps/login");
			 */
 }}
		 
