package DemoTest;
//TestNg Annotation
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

public class TestNg_Annotation {
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
