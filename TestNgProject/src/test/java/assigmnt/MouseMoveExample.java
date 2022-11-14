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

public class MouseMoveExample {
	WebDriver driver;
	@BeforeMethod
	public void startBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/window-popup.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	}
	@Test
	
	public void facebook()
	{
		WebElement face=driver.findElement(By.xpath("//a[@title='Follow @obsqurazone on Facebook']"));
		Actions action=new Actions(driver);
		action.moveToElement(face).build().perform();
		System.out.println(face.getText());
		WebElement follow=driver.findElement(By.xpath("//a[@id='windowMulti']"));
		action.moveToElement(follow).build().perform();
		System.out.println(follow.getText());
	}
}
