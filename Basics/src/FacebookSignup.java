import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookSignup {
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "src\\driver\\chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver",
		// "src\\driver\\geckodriver.exe");

		// open the browser
		// WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();

		// Script for Facebook Signup

		driver.get("https://www.facebook.com");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String content = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div[1]/div[1]")).getText();
		System.out.println(content);

		WebElement first_name = driver.findElement(By.xpath(".//*[@id='u_0_1']"));
		first_name.sendKeys("Amitabh");

		WebElement surname = driver.findElement(By.xpath(".//*[@id='u_0_3']"));
		surname.sendKeys("Bachchan");

		WebElement email = driver.findElement(By.xpath(".//*[@id='u_0_6']"));
		email.sendKeys("9875654879");

		WebElement password = driver.findElement(By.xpath(".//*[@id='u_0_d']"));
		password.sendKeys("Bachchan");

		WebElement birthday_day = driver.findElement(By.xpath(".//*[@id='day']"));
		birthday_day.sendKeys("");

		WebElement birthday_month = driver.findElement(By.xpath(".//*[@id='month']"));
		birthday_month.sendKeys("");

		WebElement birthday_year = driver.findElement(By.xpath(".//*[@id='year']"));
		birthday_year.sendKeys("");

		driver.findElement(By.xpath(".//*[@id='u_0_l']")).submit();

		driver.quit();

	}

}
