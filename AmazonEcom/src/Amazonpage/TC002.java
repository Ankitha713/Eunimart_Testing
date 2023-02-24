package Amazonpage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TC002 {

	public static void main(String[] args) throws Exception {
 
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");    
		WebDriver driver = new ChromeDriver();  
		driver.get("https://www.amazon.in");

	 
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
  
		Thread.sleep(500);
		WebElement signin= driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		if(signin.isDisplayed())
		{
			System.out.println("Sign IN is displayed");
		}
		else 
		{
			System.out.println("Sign in is not  displayed");
		}
		signin.click();
     
		WebElement id= driver.findElement(By.xpath("//*[@id=\"ap_email\"]")); 
		if(id.isDisplayed())
		{
			System.out.println("Email ID is displayed");
    	 
		}
		else 
		{
			System.out.println("Email ID is not  displayed");
    	}
		id.sendKeys("ankithakrisha10@gmail.com");
		WebElement cont= driver.findElement(By.xpath("//*[@id=\"continue\"]"));  
		cont.click();
		WebElement pass= driver.findElement(By.xpath("//*[@id=\"ap_password\"]")); 
		if(pass.isDisplayed())
		{
			System.out.println("Password is displayed");
    	 
		}
		else 
		{
			System.out.println("Password is not  displayed");
    	}
		pass.sendKeys("ankitha/2002.2003");
		WebElement sign1= driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")); 
		sign1.click();
		System.out.println("OTP is asked to Login");
		driver.quit();
	}
}