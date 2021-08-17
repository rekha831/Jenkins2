package Test;

import org.testng.annotations.Test;

public class EnableTestt {
	
	@Test
	public void test1() {
		System.out.println("test1");
	}
	@Test(enabled =true )
	public void test2() {
		System.out.println("test2");
	}
	@Test
	public void test3() {
		System.out.println("test3");
	}
	@Test
	public void test4() {
		System.out.println("test4");
	}

}
