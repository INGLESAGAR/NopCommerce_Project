package DemoTest;

import org.testng.annotations.Test;

public class AnnotationAttributes {
	@Test(description="This testcase1")
	public void test1()
	{
		System.out.println("This is test1");
	}
	@Test(timeOut=200)
	public void test2()
	{
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("This is test2");
	}
	@Test(description="This testcase3")
	public void test3()
	{
		System.out.println("This is test3");
	}
}
