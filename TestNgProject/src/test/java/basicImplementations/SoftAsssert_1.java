package basicImplementations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAsssert_1 {
	WebDriver driver;
	SoftAssert softassert;
	@BeforeMethod
	public void startBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().window().maximize();
	}
	@Test
	
	public void softassertCheckbox()
	{
		softassert=new SoftAssert();
	WebElement checkboxtext=driver.findElement(By.xpath("//label[@for='gridCheck']"));
	String actualresult=checkboxtext.getText();
	String expectedresult="Click on this check box";
	softassert.assertEquals(actualresult, expectedresult);
	WebElement checkboxone=driver.findElement(By.xpath("//label[@for='check-box-one']"));
	String actualresultone=checkboxone.getText();
	String expectedresultone="Check Box One";
	softassert.assertEquals(actualresultone, expectedresultone);
	WebElement checkboxtwo=driver.findElement(By.xpath("//label[@for='check-box-two']"));
	String actualresulttwo=checkboxtwo.getText();
	String expectedresulttwo="Check Box Two";
	softassert.assertEquals(actualresulttwo, expectedresulttwo);
	WebElement checkboxthree=driver.findElement(By.xpath("//label[@for='check-box-two']"));
	String actualresultthree=checkboxthree.getText();
	String expectedresultthree="Check Box Three";
	softassert.assertEquals(actualresultthree, expectedresultthree);
	WebElement checkboxfour=driver.findElement(By.xpath("//label[@for='check-box-four']"));
	String actualresultfour=checkboxfour.getText();
	String expectedresultfour="Check Box Four";
	softassert.assertEquals(actualresultfour, expectedresultfour);
	}
}
