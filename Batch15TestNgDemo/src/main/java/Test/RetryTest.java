package Test;

import org.testng.annotations.Test;

public class RetryTest {
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void test1() {
		System.out.println("this is my test 1");
		int i=10/0;
	}
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void test2() {
		System.out.println("this is my test 2");
	}

	@Test
	public void test3() {
		System.out.println("this is my test 3");
		int i=10/0;
	}

	@Test
	public void test4() {
		System.out.println("this is my test 4");
	}

}
