package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParameterBatch15Test {
	@Test
	@Parameters({"userid","pwd"})
	public void login(String userid,String pwd) {
		System.out.println("the user id is:"+userid);
		System.out.println("pwd is:"+pwd);
	}

}
