package programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import switchto.DataProviders;

public class DataProviderRun {
	WebDriver driver;
	@BeforeMethod
	public void startBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	}
	@Test(dataProvider = "amazonProduct",dataProviderClass = DataProviders.class) // to get the dataprovider from another pakage
public void verifyAmazonProductSearching(String products)
{
		driver.get("https://www.amazon.in/");
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys(products);
		WebElement searchbutton=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchbutton.click();
		String producttname;
		WebElement product=driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		producttname=product.getText();
		System.out.println(producttname);
		}
@Test(dataProvider = "facebookLogin",dataProviderClass = DataProviders.class)
public void faceBookLogin(String username,String pass)
{
	driver.get("https://www.facebook.com/");
	WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	email.sendKeys(username);
	WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
	password.sendKeys(pass);
	WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
	login.click();	
}
@Test(dataProvider = "facebookVerify",dataProviderClass = DataProviders.class)
public void faceBookVerify(String username,String pass,String expected)
{
	driver.get("https://www.facebook.com/");
	WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	email.sendKeys(username);
	WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
	password.sendKeys(pass);
	WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
	login.click();
	System.out.println(expected);
}
	
}
