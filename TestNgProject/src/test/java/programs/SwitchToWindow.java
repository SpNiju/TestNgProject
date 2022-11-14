package programs;

import java.time.Duration;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchToWindow {
	WebDriver driver;
	@BeforeMethod
	public void startBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	}
	@Test
	public void switchWindow()
	{
		WebElement clickhere=driver.findElement(By.linkText("Click Here"));
		clickhere.click();
		//WebElement text=driver.findElement(By.xpath("//h3[text()='New Window']"));
		//System.out.println(text.getText());
	}
	
	@Test
	public void switchWindo()
	{
		WebElement text=driver.findElement(By.linkText("Click Here"));
		text.click();
		text.click();
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		Set<String>windows=driver.getWindowHandles();
		System.out.println(windows.size()); // to get the count of no of windows opened
		Iterator<String> iterate=windows.iterator();
		while(iterate.hasNext())
		{
			String childWindow=iterate.next();
			if(!parentWindow.equals(childWindow))
			{
				driver.switchTo().window(childWindow);
				
			}
		}
	}
	
}