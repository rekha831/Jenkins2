package Test;

import org.testng.annotations.DataProvider;

public class DataPro {
	@DataProvider(name="dpmethod")
	public Object[][] dpmethod() {
		return new Object[][] {{"rekhakathayat94@gmail.com","trekha@2345"},{"rekhablessing@gmail.com","Rekha@2407" },{"rekhakathayat94@gmail.comsdf","rekha@3456789"}  };
	}

}
