package Amazonpage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TC001 {

	public static void main(String[] args) throws Exception {
 
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");    
		WebDriver driver = new ChromeDriver();  
		driver.get("https://www.amazon.in");

	 
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
  
 

		WebElement searchbar = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		WebElement logo1 = driver.findElement(By.xpath("//*[@id=\"nav-logo-sprites\"]"));
		WebElement minitv = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[5]/div[2]/div/div/a[1]"));
		WebElement mobile= driver.findElement(By.xpath("/html/body/div[1]/header/div/div[5]/div[2]/div/div/a[4]"));
		WebElement cart= driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[4]/div[2]/span[2]"));
		if(searchbar.isDisplayed())
		{
			System.out.println("Amazon search bar is displayed");
	 
		}
		else 
		{
			System.out.println("Amazon search bar is not  displayed");
		}
 
		if(mobile.isDisplayed())
		{
			System.out.println("Mobiles is displayed");
		}
		else 
		{
			System.out.println("Mobiles is not  displayed");
		}
		if(minitv.isDisplayed())
		{
			System.out.println("Amazon MiniTV is displayed");
	 
		}
		else 
		{
			System.out.println("Amazon MiniTV is not  displayed");
		}
		if(cart.isDisplayed())
		{
			System.out.println("Amazon Cart is displayed");
			cart.click();
			Thread.sleep(500);
			System.out.println("User is navigated to Cart Page");
	 
		}
		else 
		{
			System.out.println("Amazon Cart is not  displayed");
		}
		driver.navigate().back();
		Thread.sleep(500);
		System.out.println("Navigated to Home page");
 
		driver.quit();
	}
}