package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
		
	@Test
	public void testCaseOne()
	{
	System.out.println("testcaseone");	
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod");	
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass");	
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("beforeTest");	
	}
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("beforeSuite");	
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("AfterSuite");	
	} 
	@AfterTest
	public void afterTest()
	{
		System.out.println("Aftertest");	
	} 
	@AfterClass
	public void afterClass()
	{
		System.out.println("AfterClass");	
	} 
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AfterMethod");	
	} 
	@Test
	public void testCaseTwo()
	{
	System.out.println("Test case two");
	}
	@BeforeMethod
	public void beforeMethodTwo()
	{
		System.out.println("beforeMethodtwo");	
	}
}