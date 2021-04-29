package feberuary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://tek-school.com/retail/index.php?route=common/home");
		
		driver.findElement(By.xpath("//a[contains(text(),'MP3 Players')]//parent::li")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'test 11 (0)')]")).click();
	}
	
	// this is the  chagnes we made
	

}
