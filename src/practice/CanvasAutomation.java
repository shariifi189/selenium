package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CanvasAutomation {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://canvas.instructure.com/login/canvas");
		

		WebElement email = driver.findElement(By.id("pseudonym_session_unique_id"));
		WebElement password = driver.findElement(By.id("pseudonym_session_password"));

	WebElement login = driver.findElement(By.xpath("//div[@class='ic-Form-control ic-Form-control--login']/button"));
		email.sendKeys("jdfkljsd");
		password.sendKeys("jdjfkjd");
		login.click();
		
		Thread.sleep(7000);
		
		WebElement errormassage = driver.findElement(By.xpath("//div[@class='cvphu_caGd']"));
		errormassage.getText();
		System.out.println(errormassage);
	}

}
