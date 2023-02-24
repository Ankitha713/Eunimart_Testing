package Amazonpage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TC003 {

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
     
		WebElement acc= driver.findElement(By.xpath("//*[@id=\"createAccountSubmit\"]")); 
		if(acc.isDisplayed())
		{
			System.out.println("Create New Account displayed");
    	 
		}
		else 
		{
			System.out.println("Create New Acc is not  displayed");
    	}
		acc.click();
		Thread.sleep(300);
		WebElement name= driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")); 
		if(name.isDisplayed())
		{
			System.out.println("Name is displayed");
 	 
		}
		else 
		{
			System.out.println("Name is not  displayed");
		}
		name.sendKeys("Ankitha");
		Thread.sleep(500);
		WebElement num= driver.findElement(By.xpath("//*[@id=\"ap_phone_number\"]")); 
		if(num.isDisplayed())
		{
			System.out.println("Number is displayed");
 	 
		}
		else 
		{
			System.out.println("Number is not  displayed");
		}
		num.click();
		num.sendKeys("5874631452");
		WebElement pas= driver.findElement(By.xpath("//*[@id=\"ap_password\"]")); 
		if(pas.isDisplayed())
		{
			System.out.println("Password is displayed");
 	 
		}
		else 
		{
			System.out.println("Password is not  displayed");
		}
		pas.click();
		pas.sendKeys("ankitha123*");
		WebElement con= driver.findElement(By.xpath("//*[@id=\"continue\"]")); 
		con.click();
		Thread.sleep(500);
		driver.navigate().back();
		Thread.sleep(300);
		driver.navigate().back();
		driver.navigate().back();
  
		Thread.sleep(500);
		WebElement logo1 = driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]"));
		if(logo1.isDisplayed())
		{
			System.out.println("Amazon Logo is displayed");
		}
		else 
		{
			System.out.println("Amazon Logo is not  displayed");
		}
		Thread.sleep(500);
		System.out.println("User Navigated back to page");
		driver.quit();
	}
}