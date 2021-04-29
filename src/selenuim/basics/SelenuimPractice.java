package selenuim.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelenuimPractice {

	public static void main(String[] args) {

	
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://tek-school.com/retail/");
		
		WebElement eos5D = driver.findElement(By.linkText("Canon EOS 5D"));
		eos5D.click();
		Select avialableOption = new Select( driver.findElement(By.id("input-option226")));
		avialableOption.selectByIndex(2);
		
		WebElement quantity = driver.findElement(By.id("input-quantity"));
		quantity.clear();
		quantity.sendKeys("5");
		
		WebElement addToCart = driver.findElement(By.id("button-cart"));
		addToCart.click();
		
		WebElement cart = driver.findElement(By.id("cart-total"));
		cart.click();
		
		
		
		WebElement clearCart = driver.findElement(By.xpath("//button[@title='Remove']"));
		

		try {
			Thread.sleep(6000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		wait.until(ExpectedConditions.elementToBeClickable(clearCart));
		clearCart.click();
		

	}

}
