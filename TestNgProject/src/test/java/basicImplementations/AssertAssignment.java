package basicImplementations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertAssignment {
	WebDriver driver;
	@BeforeMethod
	public void startBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		driver.manage().window().maximize();
	}
	@Test
	public void verifyName()
	{
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead//tr//th[1]"));
		System.out.println("The Name is displayed "+table.isDisplayed());
		String actualresult=table.getText();
		String expectedresult="Name";
		Assert.assertEquals(actualresult, expectedresult,"Test failed");
		
	}
	@Test
	public void verifyOffice()
	{
		WebElement table=driver.findElement(By.xpath("//tbody//tr[1]//td[3]"));
		String actualresult=table.getText();
		String expectedresult="Edinburgh";
		Assert.assertEquals(actualresult, expectedresult,"Test failed");
		
	}
	
	
}
