package selenuim.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MacAddToCart {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("http://tek-school.com/retail/");

		WebElement MacBook = driver.findElement(By.linkText("MacBook"));
		MacBook.click();

		WebElement quantity = driver.findElement(By.id("input-quantity"));
		quantity.clear();

		quantity.sendKeys("5");

		WebElement addToCart = driver.findElement(By.id("button-cart"));
		addToCart.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();

		WebElement iPhone = driver.findElement(By.linkText("iPhone"));
		iPhone.click();

		WebElement quantity1 = driver.findElement(By.id("input-quantity"));
		quantity1.clear();
		quantity1.sendKeys("8");

		WebElement addToCart1 = driver.findElement(By.id("button-cart"));
		addToCart1.click();

		WebElement cartt = driver.findElement(By.id("cart-total"));
		cartt.click();
//		WebElement cross = driver.findElement(By.xpath("//button[@title='Remove']"));
//		cross.click();
	}

}
