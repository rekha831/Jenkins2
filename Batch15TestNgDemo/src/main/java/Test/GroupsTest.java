package Test;

import org.testng.annotations.Test;

public class GroupsTest {

	@Test(groups = "sanity")
	public void add() {
		System.out.println("ïam adding");
	}
	@Test(groups = "sanity")
	public void sub() {
		System.out.println("ïam subtraction");
	}
	@Test(groups = "E2E")
	public void mul() {
		System.out.println("ïam multiplication");
	}
	@Test(groups = "sanity")
	public void div() {
		System.out.println("ïam divison");
	}
}

