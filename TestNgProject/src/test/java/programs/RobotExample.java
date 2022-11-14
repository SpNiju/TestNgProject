package programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//Robot is a class 
//cannot pass webelement
//keyboard interection by java


public class RobotExample {
	WebDriver driver;
	@BeforeMethod
	public void startBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	}
	@Test
	public void robotExample() throws AWTException
	{
		Robot robot=new Robot();
		driver.get("https://www.amazon.in/");
		WebElement searchopt=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchopt.sendKeys("mobile");
		searchopt.click();
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
}
	@Test
	public void robotexampleevent() throws AWTException
	{
		Robot robot=new Robot();
		driver.get("https://www.amazon.in/");
		robot.keyPress(KeyEvent.VK_DOWN);   // scroll option
	}
	}
