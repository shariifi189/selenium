package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WallgreenSignUp {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.walgreens.com/");
		
		String title ="https://www.walgreens.com/";
		String currentTitle = driver.getTitle();
		System.out.println(currentTitle);

		if( currentTitle.equals(title) ) {
			System.out.println(currentTitle);
		}else {
			System.out.println("you are on the wrong page terminate the test");
//			driver.close();
		}
		
		WebElement account = driver.findElement(By.xpath("//span[@class='inner-focus hide-on-mobile truncate']"));
		account.click();
		
		
		
		WebElement registry = driver.findElement(By.xpath("//a[@id='pf-dropdown-register']"));
		registry.click();
		
		WebElement termbtn = driver.findElement(By.id("wag-terms-checkbox"));
		termbtn.click();
		termbtn.isSelected();
		termbtn.isEnabled();
		termbtn.isDisplayed();
		
		WebElement btn = driver.findElement(By.id("wag-rxuser-continue-btm"));
		btn.isDisplayed();
		btn.isEnabled();
		btn.click();
		
		String fnWarning ="Please enter your first name.";
		String lnWarning = "Please enter your last name.";
		String email = "Please enter your email.";
		String passWarning = "Please enter your password.";
		

		  System.out.println("dose the page have warnings fo the following"); 
		  System.out.println("First name field:" +driver.getPageSource().contains(fnWarning));
		  System.out.println("Last name field:" +driver.getPageSource().contains(lnWarning));
		  System.out.println("Email field:" +driver.getPageSource().contains(email));
		  System.out.println("password field:" +driver.getPageSource().contains(passWarning));
		
		
	}

}
