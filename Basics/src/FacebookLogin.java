import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver", "src\\driver\\chromedriver.exe");
	   	 //System.setProperty("webdriver.gecko.driver", "src\\driver\\geckodriver.exe");
	   	 
	   	 // open the browser
	     	//WebDriver driver = new FirefoxDriver();
	     	WebDriver driver = new ChromeDriver();
	     	
	     	//Script for Facebook Login
	     	
	     	driver.get("https://www.facebook.com");
	     	
	    	driver.manage().window().maximize();
	     	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     	
	     	WebElement textbox1 =   driver.findElement(By.id("email"));
	     	textbox1.sendKeys("urjr001@gmail.com");
	     	
	     	WebElement textbox2 =   driver.findElement(By.id("pass"));
	     	textbox2.sendKeys("Pune1234");
	     	
	     	driver.findElement(By.className("uiButton")).submit();   
	     	
	    	// close
	     	driver.quit();
	     	

	}

}
