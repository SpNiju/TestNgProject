package basicImplementations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertExample {
	WebDriver driver;
	@BeforeMethod
	public void startBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
	}
	@Test
	public void jsAlert()
	{
		WebElement js=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		js.click();
	   driver.switchTo().alert().getText();
	   String actualresult=driver.switchTo().alert().getText();
	   System.out.println(actualresult);
	   driver.switchTo().alert().accept();
	}
	@Test
	public void jsConfirm()
	{
		WebElement jsc=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		jsc.click();
	   driver.switchTo().alert().getText();
	   String actualresult=driver.switchTo().alert().getText();
	   System.out.println(actualresult);
	   //driver.switchTo().alert().accept();
	   driver.switchTo().alert().dismiss();
	}
	@Test
	public void jsPrompt()
	{
		WebElement jsc=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		jsc.click();
	   driver.switchTo().alert().getText();
	   String actualresult=driver.switchTo().alert().getText();
	   System.out.println(actualresult);
	   driver.switchTo().alert().sendKeys("Hello world");
	   driver.switchTo().alert().accept();
	}
}
