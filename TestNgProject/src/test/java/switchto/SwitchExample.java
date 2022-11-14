package switchto;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchExample {
	WebDriver driver;
	@BeforeMethod
	public void startBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.get("https://the-internet.herokuapp.com/nested_frames");
	}
@Test
public void verifyFrame()
{
	driver.switchTo().frame(0);  // frame using index
	driver.switchTo().frame("frame-left"); // using name
	WebElement button=driver.findElement(By.xpath("//body[1]"));
	System.out.println(button.getText());
	}
@Test
public void verifyFrameMiddleUsingIndex()
{
	driver.switchTo().frame(0);  // frame using index
	driver.switchTo().frame(1); // using index
	WebElement button=driver.findElement(By.xpath("//div[contains((text),MIDDLE)]"));
	System.out.println(button.getText());
	}
}
