package assigmnt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickUsingMouse {
	WebDriver driver;
	@BeforeMethod
	public void startBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	}
	@Test
	public void inputValue()
	{
		Actions action=new Actions(driver);
		WebElement input=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		input.sendKeys("Hi");	
		WebElement button=driver.findElement(By.xpath("//button[@id='button-one']"));
		action.doubleClick(button).build().perform();
	}
	
	@Test
	public void enterValue()
	{
		Actions action=new Actions(driver);
		WebElement entervalue=driver.findElement(By.xpath("//input[@id='value-a']"));
		action.click(entervalue).build().perform();
	}
}
