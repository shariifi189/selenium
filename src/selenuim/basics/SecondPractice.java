package selenuim.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SecondPractice {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/maps");
		
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		String url = driver.getCurrentUrl();
		System.out.println("Current Url: " + url);
		
		driver.close();
		
		
	}

}
