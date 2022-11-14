package basicImplementations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseMethod {
	WebDriver driver;
	@BeforeMethod
	public void startBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	}
	@Test
	public void mouseClick()
	{
		// action class is used for mouse actions in selenium
		Actions action=new Actions(driver); //creating object for class
		action.click().build().perform();
		
	}
	@Test
	public void mouseRightClick()
	{
		Actions action=new Actions(driver); 
		action.contextClick().build().perform();
	}
	
	@Test
	public void mouseClickonSpecificElement()
	{
		Actions action=new Actions(driver);
		WebElement selenium=driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
		action.click(selenium).build().perform();
	}
	@Test
	public void mouseRightClickonSpecificElement()
	{
		Actions action=new Actions(driver);
		WebElement right=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		action.contextClick(right).build().perform();
	}
	@Test
	public void mouseDoubleClick()
	{
		Actions action=new Actions(driver);
		action.doubleClick().build().perform();
	}
	@Test
	public void mouseDoubleClickSpecificElement()
	{
		Actions action=new Actions(driver);
		WebElement doubleclick=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		action.doubleClick(doubleclick).build().perform();
		driver.switchTo().alert().accept();
	}
	@Test
	public void mouseRightClickonSpecificElementoption()
	{
		Actions action=new Actions(driver);
		WebElement right=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		action.contextClick(right).build().perform();
	}
		@Test
		public void mouseRightEidt()
		{
			Actions action=new Actions(driver);
			WebElement right=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
			action.contextClick(right).build().perform();
            WebElement elemnt=driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-edit']"));
            action.click(elemnt).build().perform();
            driver.switchTo().alert().accept();
}
		@Test
		public void mouseRightCut()
		{
			Actions action=new Actions(driver);
			WebElement right=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
			action.contextClick(right).build().perform();
            WebElement cut=driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-cut']"));
            action.click(cut).build().perform();
            driver.switchTo().alert().accept();
}
		@Test
		
		public void mouseMove() // method to move the mouse and to show the tool tip
		{
			driver.get("https://www.amazon.in/");
			WebElement all=driver.findElement(By.xpath("//select"));
			Actions action=new Actions(driver);
			action.moveToElement(all).build().perform();
			WebElement signin=driver.findElement(By.xpath("//div[@class='nav-line-1-container']"));
			action.moveToElement(signin).build().perform(); // action to perform move
		}
		
		
}