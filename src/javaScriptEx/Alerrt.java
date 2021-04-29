package javaScriptEx;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerrt {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/delete_customer.php ");
		
//		WebElement customerid = driver.findElement(By.xpath("//input[@name='cusid']"));
//		customerid.sendKeys("53920");
//		WebElement submitbtn = driver.findElement(By.xpath("//input[@name='submit']"));
//		submitbtn.submit();
		
//		Alert alert= driver.switchTo().alert();
//		String alertMassage = driver.switchTo().alert().getText();
//		System.out.println(alertMassage);
//		Thread.sleep(8000);
//		alert.accept();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
	Thread.sleep(7000);
//		js.executeScript("alert('this is a test')");
		js.executeScript("conform('conform your age')");
//		js.executeScript("prompt('accept this ')");
//		Alert alert = driver.switchTo().alert();
//	String alertMassage = driver.switchTo().alert().getText();
//	System.out.println(alertMassage);
//	Thread.sleep(5000);
//	alert.accept();
	
		
	}

}
