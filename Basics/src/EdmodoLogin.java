
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EdmodoLogin
{
	
	By login_green_button = By.linkText("Login");
	By useremail_textbox = By.id("un");
	By password_textbox = By.id("pw");
	By login_submit = By.id("Lightbox-login");
	
	WebDriver driver;
	String url = "https://www.edmodo.com";
	
	EdmodoLogin(WebDriver d)
	{
		driver = d;
	}
	
	public void gotologinpage()
	{
		driver.get(url);
	}
	
	public void click_login_green_button()
	{
		driver.findElement(login_green_button).click();
	}
		
	public void set_username(String username)
	{
		driver.findElement(useremail_textbox).sendKeys(username);
	}
	
	public void set_password(String pswd)
	{
		driver.findElement(password_textbox).sendKeys(pswd);
	}
	
	public void click_submit_login()
	{
		driver.findElement(login_submit).click();
	}
	
	public void login(String usern, String pwd)
	{

		gotologinpage();
		click_login_green_button();
		set_username(usern);
		set_password(pwd);
		click_submit_login();
				
	}
	
	
	
	

}
