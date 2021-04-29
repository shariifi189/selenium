package javaScriptEx;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://tekschool.us/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// alert , prompt and confirm
		Thread.sleep(2000);
		js.executeScript("Alert('this is the alert')");

//		Alert alert = driver.switchTo().alert();
		
//		alert.accept();

		Thread.sleep(2000);

//		js.executeScript("confirm ('try to work with alert ')");
		Alert alert2 = driver.switchTo().alert();
//		alert2.dismiss();

		Actions action = new Actions(driver);
		action.sendKeys("testing action class").perform();

	}

}
