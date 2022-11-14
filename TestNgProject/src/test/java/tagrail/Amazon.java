package tagrail;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	WebDriver driver;
	@BeforeMethod
	public void startBrowser()
	{
		WebDriverManager.chromedriver().setup(); // this helps to update the chrome driver automatically
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void login()
	{
		WebElement suggestion=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		suggestion.sendKeys("mob");
		List<WebElement> login =driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		System.out.println(login.size());
		for(WebElement i:login)
		{
			System.out.println(i.getText());
		}
		
	
	}
}
