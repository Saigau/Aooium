package appium_demonew.appium_demonew;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Calculator {




	@Test
	public void dialer() throws MalformedURLException, InterruptedException {


		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");



		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
		//cap.setCapability("appWaitActivity", "*");
		cap.setCapability("appPackage", "com.android.calculator2");
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");

		//	cap.setCapability(MobileCapabilityType.APP, "C:\\app\\simple-calculator-5-11-3.apk");
		WebDriver driver = new AppiumDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

		
		
		
Thread.sleep(2000);
		WebElement one= driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.calculator2:id/digit_1']")); 
		
		
		
		WebElement two= driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.calculator2:id/digit_2']"));
		
		WebElement three= driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.calculator2:id/digit_3']"))
				;
		
		WebElement four= driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.calculator2:id/digit_4']"));
		
		WebElement five= driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.calculator2:id/digit_5']"));
		
		WebElement six= driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.calculator2:id/digit_6']"));
		
		WebElement seven= driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.calculator2:id/digit_7']"));
		
		WebElement eight= driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.calculator2:id/digit_8']"));
		
		WebElement nine= driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.calculator2:id/digit_9']"));
		
		WebElement zero= driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.calculator2:id/digit_0']"));
		

		one.click();
		Thread.sleep(1000);
		five.click();
		Thread.sleep(1000);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement add= driver.findElement(By.xpath("//*[@content-desc='plus']"));
		WebElement sub= driver.findElement(By.xpath("//*[@content-desc='minus']"));
		WebElement mul= driver.findElement(By.xpath("//*[@content-desc='multiply']"));
		WebElement div= driver.findElement(By.xpath("//*[@content-desc='divide']"));
		
mul.click();

three.click();
WebElement equal= driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.calculator2:id/eq']"));
equal.click();
	

		
	/*
	 * if (result=="45") { System.out.println("test pass");
	 * 
	 * } else { System.out.println("teswt fail"); }
	 */
		 
	

		
	//	WebElement point= driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.calculator2:id/dec_point']"));
		//WebElement delete= driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.calculator2:id/del']"));

		/*
		 * add.click(); Thread.sleep(1000); four.click(); Thread.sleep(1000);
		 * equal.click();
		 */
	
	}




	


}
