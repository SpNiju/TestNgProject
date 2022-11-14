package basicImplementations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assert_Equals {
	WebDriver driver;
	SoftAssert softassert;  // softasssert reference
	@BeforeMethod
	public void startBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().window().maximize();
	}
	@Test
	public void verifyTextBox()
	{
		WebElement messageenter=driver.findElement(By.xpath("//label[@class='form-check-label']"));
		System.out.println(messageenter.getText());
		String actualresult=messageenter.getText();
		String expectedresult="Click on this check box";
		Assert.assertEquals(actualresult, expectedresult,"Test failed");
	}
	@Test
	public void softasserexample()
	{
		softassert=new SoftAssert();
	WebElement checkboxtext=driver.findElement(By.xpath("//label[@for='gridCheck']"));
	String actualresult=checkboxtext.getText();
	String expectedresult="Click on this check box";
	softassert.assertEquals(actualresult, expectedresult); // softassert
	//Assert.assertEquals(actualresult,expectedresult,"test case failed");//hardaessert
	System.out.println("Verifying select all button");
	WebElement checkbox=driver.findElement(By.xpath("//input[@id='button-two']"));
	String actualresultone=checkbox.getAttribute("value");
	String expectedresultone="Select";
	softassert.assertEquals(actualresultone, expectedresultone);
	//Assert.assertEquals(actualresultone,expectedresultone,"test case failed");//hardassert
	softassert.assertAll(); // to throw execption 
	System.out.println("Print");
	}

	@AfterMethod
	public void browserClose()
	{
		driver.close();
	}
}
