package selenuim.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CanonAddToCart {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\SHARI\\Desktop\\projectWorkSpace\\selenuim\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://tek-school.com/retail/");
		
		WebElement eos5D = driver.findElement(By.linkText("Canon EOS 5D"));
		eos5D.click();
		
		Select availableOption = new Select(driver.findElement(By.id("input-option226")));
		availableOption.selectByIndex(2);
		
		WebElement quantity = driver.findElement(By.id("input-quantity"));
		quantity.clear();
		quantity.sendKeys("9");
		
		WebElement addToCart = driver.findElement(By.id("button-cart"));
		addToCart.click();
		
		WebElement cart = driver.findElement(By.id("cart-total"));
		cart.click();
		
	
		WebElement crossCarBtn = driver.findElement(By.xpath("//button[@title='Remove']")); 
		crossCarBtn.click();
		
		
		
		
		
		
	
	}

}
