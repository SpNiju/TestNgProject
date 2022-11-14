package programs;

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
import switchto.GoogleDataprovider;

public class GoogleDataProviderRum {
	WebDriver driver;
	@BeforeMethod
	public void startBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	}
	@Test (dataProvider = "searchProduct",dataProviderClass = GoogleDataprovider.class)
	
	public void verifyAmazonProductSearching(String products)
	{
		    Actions action=new Actions(driver);
		    driver.get("https://www.google.com/?hl=en-US");
			WebElement search=driver.findElement(By.xpath("//input[@aria-label='Search']"));
			search.sendKeys(products);
			action.keyDown(Keys.ENTER).build().perform();
			WebElement product=driver.findElement(By.xpath("//h3"));
			products=product.getText();
			System.out.println(products);
	}}
