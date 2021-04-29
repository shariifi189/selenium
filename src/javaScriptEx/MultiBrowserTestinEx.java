package javaScriptEx;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultiBrowserTestinEx {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");

		String driver_to_use = "chrome";
		
		WebDriver  driver;
		
		if (driver_to_use.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if (driver_to_use.equalsIgnoreCase("ie")) {
			driver = new InternetExplorerDriver();
		}else if ( driver_to_use.equalsIgnoreCase("ff")) {
			driver = new FirefoxDriver();
		}else {
			driver = new ChromeDriver();
		}
		
		
//		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		String baseUrl ="https://tekschool.us/contact/";
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get(baseUrl);
		
		Actions action = new Actions(driver);
		
		
		
	}

}
