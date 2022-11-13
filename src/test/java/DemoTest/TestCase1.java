package DemoTest;
// TestNg Annotation
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;


public class TestCase1 {
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite..");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite..");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test...");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test...");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class...");
	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("After class...");
	}
	@BeforeMethod
	public void beforeMethod() 
	{
		System.out.println("Before method...");
	}
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("After Method....\n");
	}
	@Test
	public void test1() 
	{
		System.out.println("This is test1...");
	}
	@Test
	public void test2() 
	{
		System.out.println("This is test2...");
	}

}
