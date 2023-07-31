package appium_demonew.appium_demonew;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import page.calculator_page;

public class Appium_Basefile {

	public static WebDriver driver;
	
	@BeforeSuite
	public void initapp() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");



		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
		//cap.setCapability("appWaitActivity", "*");
		cap.setCapability("appPackage", "com.android.calculator2");
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");

		
	driver = new AppiumDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

	}
	
	
	 public calculator_page Calci;
	@BeforeClass
	public void launchclass() {
		
		Calci = new calculator_page(driver);
	}

	
	
}
