package Test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelTest {
	
	@Test(invocationCount = 6,threadPoolSize = 3,timeOut = 30)
	public void test1() {
		System.out.println("test1");
		System.out.println("the thread is:"+Thread.currentThread().getId());
		Reporter.log("this is the parallel test");
	}
	@Test
	public void test2() {
		System.out.println("test2");
		System.out.println("the thread is:"+Thread.currentThread().getId());
	}
	@Test
	public void test3() {
		System.out.println("test3");
		System.out.println("the thread is:"+Thread.currentThread().getId());
	}
	@Test
	public void test4() {
		System.out.println("test4");
		System.out.println("the thread is:"+Thread.currentThread().getId());
		Reporter.log("this is the parallel test");
	}

}
