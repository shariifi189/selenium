package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WendsdayJ {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait =  WebDriverWait(driver, 10);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.get("https://www.aa.com/homePage.do");
		WebElement originOption = driver.findElement(By.xpath("//input[@id = 'reservationFlightSearchForm.originAirport']"));
		originOption.clear();
		originOption.sendKeys("wash");
		
		List<WebElement>  option = driver.findElements(By.xpath("//ul[@id= 'ui-id-1']//li//a"));
		
		for ( WebElement e : option ) {
			if(e.getText().contains("SEA"));{
			System.out.println(e.getText());
			js.executeScript("arguments [0].click()", e);
		}
		}
				
		
		
	}

	private static WebDriverWait WebDriverWait(WebDriver driver, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
