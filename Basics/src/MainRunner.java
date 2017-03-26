
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import java.util.concurrent.TimeUnit;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class MainRunner {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "src\\driver\\chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "src\\driver\\geckodriver.exe");

		// open the browser
		// WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
     	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     	
		EdmodoLogin elogin = new EdmodoLogin(driver);

		elogin.login("inportiat2@gmail.com", "inportia123");
		//elogin.set_username(username);

	}

}
