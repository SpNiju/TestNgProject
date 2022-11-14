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

public class MouseClick {
	WebDriver driver;
	@BeforeMethod
	public void startBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	}
	@Test
	public void mouseClick()
	{
		Actions action=new Actions(driver);
		WebElement one=driver.findElement(By.xpath("//input[@id='gridCheck']"));
		action.click(one).build().perform();
		WebElement two=driver.findElement(By.xpath("//input[@id='check-box-one']"));
		action.click(two).build().perform();
		WebElement three=driver.findElement(By.xpath("//input[@id='check-box-two']"));
		action.click(three).build().perform();
		WebElement four=driver.findElement(By.xpath("//input[@id='check-box-three']"));
		action.click(four).build().perform();
		WebElement five=driver.findElement(By.xpath("//input[@id='check-box-four']"));
		action.click(five).build().perform();
	}


}
