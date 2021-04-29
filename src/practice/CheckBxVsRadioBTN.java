package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBxVsRadioBTN {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("http://tek-school.com/retail/");
		WebElement appleCinama =  driver.findElement(By.xpath("//a[contains(text(), 'Apple Cinema 30\"')]"));
		
		appleCinama.click();
		// select a c radia button
		WebElement  mediumSize = driver.findElement(By.xpath("//input[@value='6']"));
		mediumSize.click();
		// to select all the checkboxes create a list store webelement in it 
		
		List<WebElement>  checkBox = driver.findElements(By.xpath("//div[@id='input-option223']//div//label//input"));
		System.out.println(checkBox.size());
		
//		// use for loop through it to select all.
//		for (WebElement element : checkBox) {
//			element.click();
//		}
		
		// to select randome number of check boxes use this
		
		checkBox.get(0).click();
		checkBox.get(3).click();
		
		WebElement text = driver.findElement(By.xpath("//input[@id='input-option208']"));
		text.clear();
		text.sendKeys("need 4 sets");
		
		Select selectOption = new Select(driver.findElement(By.xpath("//select[@id='input-option217']")));
		selectOption.selectByIndex(2);
		
		WebElement date = driver.findElement(By.xpath("//input[@name = 'option[219]']"));
		date.clear();
		date.sendKeys("01/02/2020");
		
		WebElement time = driver.findElement(By.xpath("//input[@id='input-option221']"));
		time.clear();
		time.sendKeys("01:20 am");
	}

}
