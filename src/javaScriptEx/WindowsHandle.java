package javaScriptEx;

import java.util.Set;
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

public class WindowsHandle {

	public static void main(String[] args) throws InterruptedException {



		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		String baseUrl ="https://tekschool.us/";
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get(baseUrl);
		
		Actions action = new Actions(driver);
		
		WebElement about = driver.findElement(By.id("menu-item-291"));
		action.keyDown(Keys.CONTROL).click(about).build().perform();
		Thread.sleep(5000);
		WebElement contact = driver.findElement(By.xpath("//a[@title='Contact']"));
		action.keyDown(Keys.CONTROL).click(contact).build().perform();
		
		String mainWindow = driver.getWindowHandle();
		System.out.println(mainWindow);
		Set<String> windowsKey = driver.getWindowHandles();
		
		String  title;
		Thread.sleep(4000);
		
		for (String key : windowsKey) {
			if (! key.equals(mainWindow)) {
				driver.switchTo().window(key);
				title = driver.getTitle();
				System.out.println(title + " " +  key);
				Thread.sleep(4000);
			}
			System.out.println(key);
			
		}
		
		driver.switchTo().window(mainWindow);
		
		
		
		
		
		
		
//		WebElement textbox = driver.findElement(By.xpath("//textarea[@name='umessage']"));
//		
//		action.sendKeys(textbox, "this is the test ").perform();
//		Thread.sleep(1000);
//		action.sendKeys(textbox, "\n\n this is the test ").perform();

		
		
	}

}
