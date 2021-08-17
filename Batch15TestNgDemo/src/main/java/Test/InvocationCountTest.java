package Test;

import org.testng.annotations.Test;

public class InvocationCountTest {
	@Test
	public void ivocationMethod() {
		System.out.println("this is my test");
	}
	@Test(invocationCount = 5)
	public void ivocationMethod2() {
		System.out.println("this is my test2");
	}

}
