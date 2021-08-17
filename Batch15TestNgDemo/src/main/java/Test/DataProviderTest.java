package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	@Test(dataProvider = "dpmethod",dataProviderClass = DataProvider.class)
	public void test1(String usrerid,String pwd) {
		System.out.println("user id is:"+usrerid);
		System.out.println("pwd is:"+pwd);
	}
	
	
//	@DataProvider(name="dpmethod")
//	public Object[][] dpmethod() {
//		return new Object[][] {{"rekhakathayat94@gmail.com","trekha@2345"},{"rekhablessing@gmail.com","Rekha@2407" },{"rekhakathayat94@gmail.comsdf","rekha@3456789"}  };
//	}

}
