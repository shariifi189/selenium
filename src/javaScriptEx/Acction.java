package javaScriptEx;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Acction {

	public static void main(String[] args) throws InterruptedException  {


		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl ="https://tekschool.us/contact/";
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get(baseUrl);
		
		Actions action = new Actions(driver);
//		driver.get("https://jqueryui.com/droppable/");
		
//		WebElement readbtn = driver.findElement(By.xpath("//a[@class='default-btn' and contains(text(),'Read')]"));

//		action.moveToElement(readbtn).perform();
//		action.doubleClick(readbtn);
		
		
		WebElement massageBox = driver.findElement(By.xpath("//textarea[@name='umessage']"));
		
		action.sendKeys(massageBox, "this is to test action class").perform();
		Thread.sleep(5000);
		action.sendKeys(massageBox, "\nthis is my second line").perform();

		action.keyDown(Keys.CONTROL).sendKeys("Z").build().perform();
		
		
//		Thread.sleep(6000);
//		WebElement submitbtn = driver.findElement(By.className("submit-btn"));
//		action.contextClick(submitbtn).perform();
		
//		WebElement drag1 = driver.findElement(By.id("draggable"));
//		Thread.sleep(3000);
//		WebElement drop2 = driver.findElement(By.xpath("//div[@id='droppable']"));
//		Thread.sleep(4000);
//		action.dragAndDrop(drag1, drop2).build().perform();
		
		
		
	}

}
