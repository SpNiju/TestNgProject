package basicImplementations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardInteraction {
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
	public void dragandDropExample()
	{
		Actions action=new Actions(driver);
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement source=driver.findElement(By.xpath("//li[@data-id='2']//a[@class='button button-orange'][1]"));
		WebElement destination=driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
		action.dragAndDrop(source, destination).build().perform();
	}
	@Test
	public void keyboardExample()
	{
		Actions action=new Actions(driver);
		driver.get("https://www.amazon.in/");
		WebElement searchopt=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//searchopt.sendKeys("Mobile"+Keys.ENTER);  //Keys.Enter is used enter the text
		searchopt.sendKeys("mobile");
		searchopt.sendKeys(Keys.BACK_SPACE);
	}
	@Test
	public void keyboardExample2()
	{
		driver.get("https://www.amazon.in/");
		WebElement searchopt=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchopt.sendKeys("laptop");
		searchopt.sendKeys(Keys.chord(Keys.CONTROL,"a")); // cnt+a
	}
	@Test
	public void mouseClickandHold()
	{
		Actions action=new Actions(driver);
		driver.get("https://www.amazon.in/");
		WebElement searchopt=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//searchopt.sendKeys("laptop");
		action.clickAndHold(searchopt).build().perform();// to click and hold mouse
		action.release(searchopt).build().perform(); // to release the hold
		action.sendKeys(searchopt, "mobile").build().perform();// another method for send keys using action class
	}
	@Test
	public void mouseKeyboardInteraction()
	{
		Actions action=new Actions(driver);
		driver.get("https://www.amazon.in/");
		WebElement searchopt=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchopt.sendKeys("laptop");
	   // action.keyDown(searchopt,Keys.BACK_SPACE).build().perform(); // to perform backspace
	    action.keyDown(Keys.BACK_SPACE).build().perform();
	}
	@Test
	public void mouseKeyboardInteractionflipkart()
	{
		Actions action=new Actions(driver);
		driver.get("https://www.flipkart.com/");
		action.click().build().perform();
		WebElement searchflip=driver.findElement(By.xpath("//input[@class='_3704LK']"));
		searchflip.sendKeys("laptop");
		searchflip.click();
		while(true)
		{
			action.keyDown(Keys.BACK_SPACE).build().perform();
			
			                                                              //.scrollToElement(iframe)
		                                                                 // .perform();

		}
			
		
	   // action.keyDown(searchopt,Keys.BACK_SPACE).build().perform(); // to perform backspace
	    //action.keyDown(Keys.BACK_SPACE).build().perform();
	}
	}
