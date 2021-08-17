package Test;

import org.testng.annotations.Test;

public class DependsOnTest {
	@Test
	public void test1() {
		
		int i=10/0;
		System.out.println("test1");
		
	}
	@Test(dependsOnMethods ="test1",alwaysRun = true )
	public void test2() {
		System.out.println("test2");
	}

	@Test(dependsOnMethods = {"test2","test1"})
	public void test3() {
		System.out.println("test3");
	}

	@Test( )
	public void test4() {
		System.out.println("test4");
	}


}
