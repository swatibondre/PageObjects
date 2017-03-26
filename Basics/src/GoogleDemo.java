import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class GoogleDemo {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "src\\driver\\chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "src\\driver\\geckodriver.exe");

		// open the browser
		// WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();

		// hit the url
		driver.get("https://www.google.co.in");

		// maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// search in the textbox
		WebElement search_bar = driver.findElement(By.id("lst-ib"));
		search_bar.sendKeys("Selenium");

		driver.findElement(By.id("_fZl")).click();

		// verify if the results are present
		String content = driver.findElement(By.id("rso")).getText();
		System.out.println(content);

	//	Assert.assertTrue(content.contains("www.seleniumhq.org"));

	//	Thread.sleep(2000);

		// close
		driver.quit();

	}

}
