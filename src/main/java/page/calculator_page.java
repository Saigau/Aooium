package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class calculator_page {

private WebDriver driver;
	
@FindBy(xpath = "//android.widget.Button[@resource-id='com.android.calculator2:id/digit_1']")
private WebElement one;

@FindBy(xpath="//android.widget.Button[@resource-id='com.android.calculator2:id/digit_2']")
private WebElement two;
	
@FindBy(xpath="//android.widget.Button[@resource-id='com.android.calculator2:id/digit_3']")
private WebElement three;
	
@FindBy(xpath="//android.widget.Button[@resource-id='com.android.calculator2:id/digit_4']")
private WebElement four;
	
@FindBy(xpath="//android.widget.Button[@resource-id='com.android.calculator2:id/digit_5']")
private WebElement five;
	
@FindBy(xpath="//android.widget.Button[@resource-id='com.android.calculator2:id/digit_6']")
private WebElement six;

@FindBy(xpath="//android.widget.Button[@resource-id='com.android.calculator2:id/digit_7']")
private WebElement seven;

@FindBy(xpath="//android.widget.Button[@resource-id='com.android.calculator2:id/digit_8']")
private WebElement eight;

@FindBy(xpath="//android.widget.Button[@resource-id='com.android.calculator2:id/digit_9']")
private WebElement nine;

@FindBy(xpath="//android.widget.Button[@resource-id='com.android.calculator2:id/digit_0']")
private WebElement zero;

@FindBy(xpath="//*[@content-desc='plus']")
private WebElement plus;

@FindBy(xpath="//*[@content-desc='minus']")
private WebElement minuns;

@FindBy(xpath="//*[@content-desc='multiply']")
private WebElement mul;

@FindBy(xpath="//*[@content-desc='divide']")
private WebElement divide;
	
@FindBy(xpath="//android.widget.Button[@resource-id='com.android.calculator2:id/eq']")
private WebElement equal;

@FindBy(xpath="//android.widget.Button[@resource-id='com.android.calculator2:id/dec_point']")
private WebElement point;

@FindBy(xpath="//android.widget.Button[@resource-id='com.android.calculator2:id/del']")
private WebElement delete;

@FindBy(xpath="//*[@resource-id='com.android.calculator2:id/formula']")
private WebElement Answer;

public calculator_page(WebDriver driver)
{
	this.driver = driver;

	PageFactory.initElements(driver,  this);
}


public void calculation()
{
	
	 one.click();
	
	five.click();
	
	mul.click();

	three.click();

	equal.click();
		
	
	 String result = Answer.getText();
	 
	 System.out.println(result);
	  if (result=="45") { System.out.println("test pass");
	  
	  } 
	  else { System.out.println("test fail"); }
	 
		 
}
}
