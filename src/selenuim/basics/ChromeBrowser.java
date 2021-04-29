package selenuim.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {

		// step 1 . To open a Chrome browser we need to setup 
		// system.Setproperty to open chromedriver file
		// Syntax for system.setProperty("webdriver.chrome.driver", "<path to file>
		// for windows users we will add ".exe" extension for mac users we do not add
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		// step 2 we need to create a referencce to webdriver interface
		// then create obj of chromedreiver class
		
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.facebook.com/");
		
		
		// we need to open 
		// in order to open a website with selenuim webdriver. we need to use 
		// .get() method and pass url as parameter(url);
		// we can maximize the page
		
		driver.manage().window().maximize();
		
		
	}

}
