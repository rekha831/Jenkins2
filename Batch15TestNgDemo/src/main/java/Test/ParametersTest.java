package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {
	@Test
	@Parameters({"userid","pwd"})
	
	public void login(String userid,String pwd ) {
		System.out.println("login");
		System.out.println("user id is:"+userid);
		System.out.println("pwd is:"+pwd);
	}

}
