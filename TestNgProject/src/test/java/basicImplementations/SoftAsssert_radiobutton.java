package basicImplementations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class SoftAsssert_radiobutton {
	WebDriver driver;
	SoftAssert softassert;
	@BeforeMethod
	public void startBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.manage().window().maximize();
	}
	@Test
public void softassertCheckbox()
	{
		softassert=new SoftAssert();
	WebElement male=driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
	male.click();
	softassert.assertEquals(true, male.isSelected());
	WebElement female=driver.findElement(By.xpath("//label[contains (text()='First Name'}]"));
	female.click();
	softassert.assertEquals(true, female.isSelected());
	softassert.assertAll();
	}
}
