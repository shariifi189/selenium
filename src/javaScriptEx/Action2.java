package javaScriptEx;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action2 {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		String baseUrl ="https://tekschool.us/contact/";
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get(baseUrl);
		
		Actions action = new Actions(driver);
		
		WebElement textbox = driver.findElement(By.xpath("//textarea[@name='umessage']"));
		
		action.sendKeys(textbox, "this is the test ").perform();
		Thread.sleep(1000);
		action.sendKeys(textbox, "\n\n this is the test ").perform();

//		wait.until(ExpectedConditions.elementToBeClickable(textbox));
		Thread.sleep(3000);
		action.keyDown(Keys.CONTROL).sendKeys("z").build().perform();
		Thread.sleep(3000);
		action.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		Thread.sleep(3000);
//		action.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
//		Thread.sleep(3000);
		action.keyDown(Keys.CONTROL).sendKeys("c").sendKeys("v").build().perform();
		
	}

}
