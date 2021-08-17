package Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgTest1 {


	@BeforeSuite
	public void beforeSuit() {
		System.out.println("this is my before suit");
	}
	
	@BeforeTest
	public void beforeTestAnnotation() {
		System.out.println("this is my before test");
	}
	

	@BeforeClass
	public void beforeclassTest() {
		System.out.println("this is my before class");
	}
	@BeforeMethod
	public void b() {
		System.out.println("this is my before method");
	}
	
	
	@Test()
	public void testcase1() {
		System.out.println("this is 1st test case");
	}
	@Test()
	public void testcase2() {
		System.out.println("this is 2nd test case");
	}
	

	@AfterMethod
	public void afterMethodWxample() {
		System.out.println("this is my after method");
	}
	@AfterClass
	public void afterclassTest() {
		System.out.println("this is my after class");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("this is my after Test");
	}
	

	@AfterSuite
	public void afterSuit() {
		System.out.println("this is my after suit");
	}
}
