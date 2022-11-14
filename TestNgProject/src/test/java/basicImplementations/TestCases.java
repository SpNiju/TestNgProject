package basicImplementations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCases {	
	WebDriver driver;
	@BeforeMethod
	public void startBrowser()
	{
		WebDriverManager.chromedriver().setup(); // this helps to update the chrome driver automatically
		driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		
	}
	@Test(priority = 0,dependsOnMethods = "currentUrl")
	public void verifyMessageEditable()
	{
		WebElement message=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		message.sendKeys("Hi");
		WebElement showmessage=driver.findElement(By.xpath("//div//button[@id='button-one']"));
		showmessage.click();
		WebElement messageenter=driver.findElement(By.xpath("//div[@id='message-one']"));
		System.out.println(messageenter.getText());
		String actualresult=messageenter.getText();
		String expectedresult="Your Message : Hi Nijeesh";
		Assert.assertEquals(actualresult, expectedresult,"Test failed");
		
	}
	@Test(priority = 1)
	public void currentUrl()
	
	{
		driver.getCurrentUrl();
		String actualurl=driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		String expectedurl="https://selenium.obsqurazone.com/simple-form-demo.php";
		Assert.assertEquals(actualurl, expectedurl);
	}
	@Test(priority = 2,enabled=false)  //enabled=false means this test case wont execute
	public void tiltleView()
	{
	driver.getTitle();
	String actualtiltle=driver.getTitle();
	System.out.println(driver.getTitle());
	String expectedtitle="Obsqura Testing";
	Assert.assertEquals(actualtiltle, expectedtitle);
	}
	@Test(invocationCount = 2)
	public void verifyButtonDisplayed()
	{
		WebElement showmessage=driver.findElement(By.xpath("//div//button[@id='button-one']"));
		Assert.assertTrue(showmessage.isDisplayed());
	}
	@AfterMethod
	public void browserClose()
	{
		driver.close();
	}
}
