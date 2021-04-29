package selenuim.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wendsday {

	public static void main(String[] args) {

	
	System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	 driver.get("https://canvas.instructure.com/login/canvas");
	 
	 WebElement email = driver.findElement(By.id("pseudonym_session_unique_id"));
	 email.sendKeys("shariifi189@gmaail.com");
	 WebElement pass = driver.findElement(By.xpath("//input[@name = 'pseudonym_session[password]']"));
	 pass.sendKeys("dffjoidufjd");
	 
	 WebElement longin = driver.findElement(By.xpath("//button[@class='Button Button--login']"));
	 longin.click();
	 
//	 WebElement
	
	
	
	
	
	}

}
