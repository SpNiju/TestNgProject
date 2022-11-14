package basicImplementations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assert_EqualsExample {
	WebDriver driver;
	@BeforeMethod
	public void startBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		driver.manage().window().maximize();
		
}
	@Test
	public void verifyColor()
	{
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		dropdown.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchdown=driver.findElement(By.xpath("//select[@class='form-control']/option[3]"));
		searchdown.click();
		WebElement messagedisp=driver.findElement(By.xpath("//div[@id='message-one']"));
		System.out.println(messagedisp.getText());
		String actualresult=messagedisp.getText();
		String expectedresult="Selected Color : Yellow";
		Assert.assertEquals(actualresult, expectedresult,"Test failed");
	}
	@AfterMethod
	public void browserClose()
	{
		driver.close();
	}
}