package Test;

import org.testng.annotations.Test;

public class Priorities {
	@Test(priority =-1)
	public void  abc() {
		System.out.println("test1");
		
	}
	@Test(priority = 1)
	public void  xyz() {
		System.out.println("test2");
		
	}
	@Test(priority = 1)
	public void  nms() {
		System.out.println("test3");
		
	}
	@Test()
	public void  lnt() {
		System.out.println("test4");
		
	}
		@Test(priority =0)
	public void  bcd() {
		System.out.println("test5");
		
	}


}
