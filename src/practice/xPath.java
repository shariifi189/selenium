package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver" , ".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		driver.get("http://tek-school.com/retail/index.php?route=common/home");
		
		WebElement email = driver.findElement(By.xpath(""));

		email.sendKeys("sharifi");
		
		
		
		
	}

}
