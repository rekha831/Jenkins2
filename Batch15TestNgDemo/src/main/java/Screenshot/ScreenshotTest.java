package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\RekhaTutoNew\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://book.spicejet.com/Login.aspx");
		TakesScreenshot scs=(TakesScreenshot)driver;
		File file=scs.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file,  new File("./screenshot/screen2.png") );
		
		driver.close();
	

		
		
	}

}
