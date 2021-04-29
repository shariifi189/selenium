package selenuim.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LapSession {

	public static void main(String[] args) {

		// To open chrome browser we need to setup system.setProperty to open chrome
		// driver files
		// syntax is System.setProperty("webdriver.chrome.driver", < path to file>
		// window user will add .exe at the end for man no need.

		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +  ".\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		driver.get("http://tek-school.com/hotel/");
		driver.get("https://www.facebook.com/");
		
		
//		WebDriverWait wait = new WebDriverWait(driver,5000);
//		driver.close();
		
		driver.findElement(By.name("login")).click();
		
		
	}

}
