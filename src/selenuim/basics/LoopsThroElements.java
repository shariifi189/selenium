package selenuim.basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoopsThroElements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://tekschool.us/");
		
	    List<WebElement> featurelist =	driver.findElements(By.xpath("//ul[@class='features-list']"));
		
		for(int i = 0; i < featurelist.size(); i++) {
			if(featurelist.get(i).getText().trim().toLowerCase().contains("java")) {
				featurelist.get(i).click();
			}
			System.out.println(featurelist.get(i).getText());
		}

	
	}

}
