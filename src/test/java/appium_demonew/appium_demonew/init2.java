package appium_demonew.appium_demonew;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class init2 {WebDriver driver;

@Test
public void launch2() throws MalformedURLException 
{

	DesiredCapabilities cap = new DesiredCapabilities();

	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "MB45K7L74PCQLVYP");
	
cap.setCapability(MobileCapabilityType.NO_RESET,true);
	
	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
	cap.setCapability("appWaitActivity", "*");
cap.setCapability(MobileCapabilityType.UDID, "MB45K7L74PCQLVYP");


	cap.setCapability("appPackage", "com.android.chrome");


	cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");



	//AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new
	//	URL("http://127.0.0.1:4723/wd/hub"), cap);

	WebDriver driver = new AppiumDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	driver.findElement(By.xpath("//android.widget.Button[@index='0']")).click();
	//driver.get("https://www.amazon.com");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//android.widget.Button[@index='0']")).click();

	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//android.widget.Button[@index='0']")).click();
	driver.get("https://www.amazon.in/");
	
	


}
}