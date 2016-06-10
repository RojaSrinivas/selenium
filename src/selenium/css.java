package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class css {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com");
		driver.findElement(By.cssSelector("[class='identity first']")).sendKeys("roja");
		driver.findElement(By.cssSelector("input[id='password']")).click();
		driver.findElement(By.xpath("//button[@id='Login']")).click();
		
		

	}

}
