package Amazonpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchsite {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");    
		WebDriver driver = new ChromeDriver();  
		 driver.get("https://www.amazon.in");
		 Thread.sleep(1000);
		 driver.quit();
	}
}