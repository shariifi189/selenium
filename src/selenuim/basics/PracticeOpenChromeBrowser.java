package selenuim.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeOpenChromeBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// we need to define the pageLoad timeout so webdriver should not throw an
		// exception for this issue.
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		// Global wait or implicit wait 
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		
		// Delete Cookies with Selenium
		//      driver.manage().deleteAllCookies();
		
		
		// this will open this url.
		
		driver.get("https://tekschool.us/");
		// i want to print the page title or website title
		String  ActualPageTitle = driver.getTitle();
		System.out.println(" this is curret page Title" + ActualPageTitle);
		
		String currentUrl =  driver.getCurrentUrl();
		System.out.println(" this is the current page url:" +  currentUrl);
		
		// to close an opened browser with webdriver we can use two method
		// .close() -- this method will close the only tab opened in browser
		// .quite() -- this method will close the all opened browser
		
		driver.close();
		
		
	}

}
