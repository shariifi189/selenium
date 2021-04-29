package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wendsday {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.yahoo.com/");
		
		WebElement singIn = driver.findElement(By.xpath("//a[@class='_yb_17gho']"));
		singIn.click();
		WebElement checkBx = driver.findElement(By.xpath("//input[@id='persistent']"));
		checkBx.click();
		System.out.println(checkBx.isDisplayed());
		System.out.println(checkBx.isEnabled());
		System.out.println(checkBx.isSelected());
		
		
	}

}
