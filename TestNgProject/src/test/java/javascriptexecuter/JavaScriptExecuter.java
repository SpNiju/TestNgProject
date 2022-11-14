package javascriptexecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//javascript executer is an interface used to interact with ui with javacript cmd 
public class JavaScriptExecuter {
	WebDriver driver;
	JavascriptExecutor js;	
	@BeforeMethod
	public void startBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	}
	
	@Test
	public void scrollDownUsingJavaScript()
	{
		driver.get("https://www.amazon.in/");
		js=(JavascriptExecutor) driver; // explict type converstion
		js.executeScript("window.scrollBy(0,500)"); // scroll comd using javascript executer
		js.executeScript("alert('Nijeesh');");
	}
	@Test
	public void scrollintoVisibility()
	{
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		js=(JavascriptExecutor) driver;
		WebElement button=driver.findElement(By.xpath("//button[@id='button-two']"));
		js.executeScript("arguments[0].scrollIntoView();", button);  // using webelemt scroll down to the webelemnt
	}
	@Test
	public void clickUsingJavaScriptExecutor()
	{
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		js=(JavascriptExecutor) driver;
		WebElement button=driver.findElement(By.xpath("//button[@id='button-two']"));
		js.executeScript("arguments[0].scrollIntoView();", button); 
		js.executeScript("arguments[0].click();",button);  // click using javascript executer

	}

}
