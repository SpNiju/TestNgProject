package tagrail;

import org.testng.annotations.Test;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingOne {
	WebDriver driver;

	@BeforeMethod
	public void startBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Test
	public void personalMobilityinc()
	{
		driver.get("http://www.personalmobilityinc.com/il-wheelchair-vans-for-sale");
		WebElement button = driver.findElement(By.xpath("(//img[@title='Shop From Home'])[1]"));
		button.click();
		List<WebElement> sizebutton = driver.findElements(By.xpath("//img[@title='Shop From Home']"));
		System.out.println("total no of button is "+sizebutton.size());
		/*for (int i = 0; i < sizebutton.size(); i++) 
		{
           System.out.println("total no of button is "+sizebutton.get(i));
		}*/
		

		// driver.close();
	}

	@Test
	public void bussaniMobility() {
		driver.get("https://www.bussanimobility.com/cars-for-sale-new-york-ny");
		WebElement button = driver.findElement(By.xpath("//img[@title='Start my purchase']"));
		button.click();
		List<WebElement> sizebutton = driver.findElements(By.xpath("//img[@title='Start my purchase']"));
		System.out.println("total no of button is "+sizebutton.size());
		driver.close();
	}

	@Test
	public void aandjMobility() {
		driver.get("https://www.aandjmobility.com/wheelchair-vans-for-sale/new");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement button = driver.findElement(By.xpath("//div[@data-vin='2C4RC1CG2NR103883']"));
		button.click();
		driver.close();
	}

	@Test
	public void infinitiOfElpaso() {
		driver.get("https://www.infinitiofelpaso.com/inventory/new/");
		WebElement button = driver.findElement(By.xpath("//div[@class='tagrail__cta-primary']"));
		button.click();
		List<WebElement> sizebutton = driver.findElements(By.xpath("//div[@class='tagrail__cta-primary']"));
		System.out.println("total no of button is "+sizebutton.size());
		driver.close();
	}

	@Test
	public void sierraChevrolet() {
		driver.get("https://www.sierrachevrolet.com/inventory/new/");
		WebElement button = driver.findElement(By.xpath("//div[@class='tagrail__cta-primary']"));
		button.click();
		List<WebElement> sizebutton = driver.findElements(By.xpath("//div[@class='tagrail__cta-primary']"));
		System.out.println("total no of button is "+sizebutton.size());
		driver.close();
	}

	@Test
	public void creativeMobilityGroup() {
		driver.get("https://www.creativemobilitygroup.com/inventory/wheelchair-vans-for-sale-michigan/?dx_newused=New");
		WebElement button = driver.findElement(By.xpath("//div[@class='tgbtn']"));
		button.click();
		List<WebElement> sizebutton = driver.findElements(By.xpath("//div[@class='tgbtn']"));
		System.out.println("total no of button is "+sizebutton.size());
		driver.close();
	}

	@Test
	public void nissanThousandoaks() {
		driver.get("https://www.nissanthousandoaks.com/inventory/New/");
		WebElement button = driver.findElement(By.xpath("//div[@class='tagrail__cta-primary']"));
		button.click();
		List<WebElement> sizebutton = driver.findElements(By.xpath("//div[@class='tagrail__cta-primary']"));
		System.out.println("total no of button is "+sizebutton.size());
		driver.close();
	}

	@Test
	public void premierToyota() {
		driver.get("https://www.premiertoyota.com/inventory/new/");
		WebElement button = driver.findElement(By.xpath("//div[@class='tagrail__cta-primary']"));
		button.click();
		List<WebElement> sizebutton = driver.findElements(By.xpath("//div[@class='tagrail__cta-primary']"));
		System.out.println("total no of button is "+sizebutton.size());
		driver.close();
	}

	@Test
	public void infinitiOfVannuys() {
		driver.get("https://www.infinitiofvannuys.com/inventory/new/");
		WebElement button = driver.findElement(By.xpath("//div[@class='tagrail__cta-primary']"));
		button.click();
		List<WebElement> sizebutton = driver.findElements(By.xpath("//div[@class='tagrail__cta-primary']"));
		System.out.println("total no of button is "+sizebutton.size());
		driver.close();
	}

	@Test
	public void mobilityTransport() {
		driver.get("http://www.mobilitytransport.com/florida-wheelchair-vans-for-sale/new");
		WebElement button = driver.findElement(By.xpath("//div[@class='tgbtn']"));
		button.click();
		List<WebElement> sizebutton = driver.findElements(By.xpath("//div[@class='tgbtn']"));
		System.out.println("total no of button is "+sizebutton.size());
		driver.close();
	}

	@Test
	public void clockMobility() {
		driver.get("https://clockmobility.com/vehicle-inventory/?condition=new");
		//WebElement closepopup = driver.findElement(By.xpath("//div[@class='mc-closeModal']"));
		//closepopup.click();
		WebElement button = driver.findElement(By.xpath("//div[@class='meta-btn']"));
		button.click();
		List<WebElement> sizebutton = driver.findElements(By.xpath("//div[@class='meta-btn']"));
		System.out.println("total no of button is "+sizebutton.size());
		driver.close();
	}

	@Test
	public void harperInfiniti() {
		driver.get("https://www.harperinfiniti.com/searchnew.aspx");
		WebElement closepopup = driver.findElement(By.xpath("//a[@class='cnpk5__x']"));
		closepopup.click();
		WebElement button = driver.findElement(By.xpath("//div[@class='tganimated tgpulse']"));
		button.click();
		//WebElement formone=driver.findElement(By.cssSelector("input.ng-pristine.ng-invalid.ng-touched"));
		//formone.sendKeys("test");
		List<WebElement> sizebutton = driver.findElements(By.xpath("//div[@class='tganimated tgpulse']"));
		System.out.println("total no of button is "+sizebutton.size());
		driver.close();
	}

	@Test
	public void infinitiofHuntsVille() {
		driver.get("https://www.infinitiofhuntsville.com/searchnew.aspx");
		/*WebElement closepopup = driver.findElement(By.xpath("//a[@class='cnpk5__x']"));
		closepopup.isDisplayed();
		if(closepopup.isDisplayed()==true)
		{
		closepopup.click();
		}*/
		WebElement button = driver.findElement(By.xpath("//div[@class='tganimated tgpulse']"));
		button.click();
		List<WebElement> sizebutton = driver.findElements(By.xpath("//div[@class='tganimated tgpulse']"));
		System.out.println("total no of button is "+sizebutton.size());
		driver.close();
	}
}
