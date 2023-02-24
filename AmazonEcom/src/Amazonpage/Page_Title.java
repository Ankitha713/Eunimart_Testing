package Amazonpage;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Page_Title {

	public static void main(String[] args) throws Exception {
		 
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");    
		 WebDriver driver = new ChromeDriver();  
		 driver.get("https://www.amazon.in");

		 
		 driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		 driver.manage().window().maximize();
	  
	 

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
		 driver.quit();
	}
}