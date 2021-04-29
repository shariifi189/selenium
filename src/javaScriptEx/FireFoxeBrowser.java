package javaScriptEx;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FireFoxeBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\SHARI\\Desktop\\WORK WS\\Selenium.Lectures.falcons\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 7);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

		driver.get("http://tek-school.com/");

		
		WebElement contact = driver.findElement(By.xpath("//button[@id='menu-icon']"));
		wait.until(ExpectedConditions.elementToBeClickable(contact));
		contact.click();

	}

}
