package selenuim.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddItemToCard {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String tekUrl = "http://tek-school.com/retail/";

		driver.manage().window().maximize();

		driver.get(tekUrl);

		addItemToCard(driver, "MacBook", 9);
		addItemToCard(driver, "iPhone", 3);
		addItemToCard(driver, "MacBook", 2);
//	String rawTotal =	driver.findElement(By.id("cart-total")).getText();
//		
//		System.out.println(rawTotal);
//		
//		String cleanTotal = rawTotal.substring(rawTotal.indexOf("$")).replace("$", "").replace(",", "");
//		System.out.println(cleanTotal);
//		float total = Float.valueOf(cleanTotal);
//		
//		System.out.println(" your  total is " + total + " your tax is " + (total * 0.1));
	
		String rawTotal = driver.findElement(By.id("cart-total")).getText();
		System.out.println(rawTotal);
		
		String cleanTotal = rawTotal.substring(rawTotal.indexOf("$")).replace("$", "").replace(",", "");
		
		System.out.println(cleanTotal);
		
		double total = Double.valueOf(cleanTotal);
		
		System.out.println(total);
		
		System.out.println("your total is\t " + total + "your tax is" + "\t" + ( total * 0.1));
		
	}

	public static void addItemToCard(WebDriver driver, String item, int quantity) {

		if (driver.findElement(By.linkText(item)).isDisplayed()) {

			driver.findElement(By.linkText(item)).click();
			driver.findElement(By.id("input-quantity")).clear();
			driver.findElement(By.id("input-quantity")).sendKeys(String.valueOf(quantity));
			driver.findElement(By.id("button-cart")).click();

			driver.navigate().back();
			driver.findElement(By.linkText("TEST ENVIRONMENT")).click();

		}else {
			System.out.println("item not found");
		}

	}

}
