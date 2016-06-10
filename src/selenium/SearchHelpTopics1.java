package selenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchHelpTopics1 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 	//Implicit wait
		
	}
	
	@Test
	public void searchHelpTopics1Test() {
		
		
		driver.get("https://www.google.com");
		driver.findElement(By.id("lst-ib")).clear();
		driver.findElement(By.id("lst-ib")).sendKeys("google");
		driver.findElement(By.name("btnG")).click();
		driver.findElement(By.linkText("×")).click();
		WebDriverWait wait = new WebDriverWait(driver, 2);
		wait.until(ExpectedConditions.elementToBeClickable(By.className("ab_button"))).click();
		driver.findElement(By.linkText("Search help")).click();
		String attributeValueOfFirstHelpTopicBefore = driver.findElement(By.xpath("//article/nav[@class='accordion-homepage']/section[h2[text()='Popular articles']]/div/div")).getAttribute("style");
		Assert.assertTrue(attributeValueOfFirstHelpTopicBefore.equals("margin-top: 0px"));
		driver.findElement(By.cssSelector("article>nav[data-tracking-cat='accordion-homepage']>section:last-child")).click();
		String attributeValueOfFirstHelpTopicAfter = driver.findElement(By.xpath("//article/nav[@class='accordion-homepage']/section[h2[text()='Popular articles']]/div/div")).getAttribute("style");
		Assert.assertFalse(attributeValueOfFirstHelpTopicAfter.equals("margin-top: 0px"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
