package Test;

import org.testng.annotations.Test;

public class ExpectedExceptionTest {
	@Test
	public void exceptionTest1() {
		System.out.println("test1");
	}
	@Test(expectedExceptions = ArithmeticException.class)
	public void exceptionTest2() {
		System.out.println("test2");
		int i =1/0;
	}
	@Test
	public void exceptionTest3() {
		System.out.println("test3");
	}

}
