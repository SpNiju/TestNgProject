package basicImplementations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertExample_1 {
	WebDriver driver;
	@BeforeMethod
	public void startBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void greenButton()
	{
		WebElement green=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		green.click();
	   driver.switchTo().alert().getText();
	   String actualresult=driver.switchTo().alert().getText();
	   System.out.println(actualresult);
	   driver.switchTo().alert().accept();
	}
	
	@Test
	public void yellowButton()
	{
	driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
	driver.navigate().refresh();
	WebElement yellow=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
	yellow.click();
   driver.switchTo().alert().getText();
   String actualresult=driver.switchTo().alert().getText();
   System.out.println(actualresult);
   driver.switchTo().alert().dismiss();
	}
	@Test
	public void redButton()
	{
	driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
	driver.navigate().refresh();
	WebElement red=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
	red.click();
   driver.switchTo().alert().getText();
   String actualresult=driver.switchTo().alert().getText();
   System.out.println(actualresult);
   driver.switchTo().alert().sendKeys("Hello world");
   driver.switchTo().alert().accept();
	}
	}
