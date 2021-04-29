package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecuter {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://www.aa.com/homePage.do");
		
		WebElement orginTxet = driver.findElement(By.name("originAirport"));
		orginTxet.clear();
		orginTxet.sendKeys("wash");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		List<WebElement> option = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li//a"));
		for( WebElement e : option) {
			System.out.println(e.getText());
			if ( e.getText().contains("Washington Dulles Int, DC")) {
				e.click();
//				js.executeAsyncScript(arg0, arg1)
				
			}
		}
		
		
		
		
//		js.executeScript("alert('testing is fun')");
		
		
		
		
		
		
		
	}

}
