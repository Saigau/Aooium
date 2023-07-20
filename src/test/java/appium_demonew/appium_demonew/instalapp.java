package appium_demonew.appium_demonew;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.common.XPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class instalapp {
	
	DesiredCapabilities cap = new DesiredCapabilities();
	WebDriver driver ;
	@Test
	public void install () throws MalformedURLException
	{

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		

		
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
		//cap.setCapability("appWaitActivity", "*");

		cap.setCapability("appPackage", "com.biforst.broonline.bigbazar");


		cap.setCapability("appActivity", "com.biforst.broonline.activity.LoginActivity");

		
		/*
		 * cap.setCapability(MobileCapabilityType.PLATFORM_NAME,
		 * MobilePlatform.ANDROID);
		 * cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
		 * cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		 * 
		 * 
		 * 
		 * cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
		 * cap.setCapability("appWaitActivity", "*");
		 * 
		 * cap.setCapability(MobileCapabilityType.APP,
		 * "C:\\app\\Demo Testing_1.0_apkcombo.com.apk");// one time
		 * 
		 * 
		 * cap.setCapability("appPackage", "com.biforst.broonline.bigbazar ");
		 * cap.setCapability("appActivity",
		 * "com.biforst.broonline.activity.LoginActivity");
		 * 
		 * 
		 * 
		 * //AndroidDriver<AndroidElement> driver = new
		 * AndroidDriver<AndroidElement>(new // URL("http://127.0.0.1:4723/wd/hub"),
		 * cap);
		 */
		WebDriver driver = new AppiumDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	
driver.findElement(By.xpath("// android.widget.Button[@index='2']")).click();


	
	
	
	
			
	}
	
	
	
	
}
