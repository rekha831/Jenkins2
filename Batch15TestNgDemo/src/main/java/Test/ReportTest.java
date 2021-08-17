package Test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportTest {
	@Test
	
	public void report() {
		
		String expectedval="blessings";
		Assert.assertEquals("blessingautomation", expectedval);
		Reporter.log("tis test is failing pls check");
	}

}
