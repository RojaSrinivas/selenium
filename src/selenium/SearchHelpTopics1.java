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
		//Launch firefox browser
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 	//Implicit wait
		
	}
	
	@Test
	public void searchHelpTopics1Test() {
		
		//Go to google.com
		driver.get("https://www.google.com");
		
		//Enter the term "google" and click the search button
		driver.findElement(By.id("lst-ib")).clear();
		driver.findElement(By.id("lst-ib")).sendKeys("google");
		driver.findElement(By.name("btnG")).click();
		
		//Close the pop-up
		driver.findElement(By.linkText("×")).click();
		
		//Click on options
		WebDriverWait wait = new WebDriverWait(driver, 2);
		wait.until(ExpectedConditions.elementToBeClickable(By.className("ab_button"))).click();
		//driver.findElement(By.className("ab_button")).click();
		
		//Click "search help" link
		driver.findElement(By.linkText("Search help")).click();
		
		//Verify the first help topic is expanded by default
		String attributeValueOfFirstHelpTopicBefore = driver.findElement(By.xpath("//article/nav[@class='accordion-homepage']/section[h2[text()='Popular articles']]/div/div")).getAttribute("style");
		Assert.assertTrue(attributeValueOfFirstHelpTopicBefore.equals("margin-top: 0px"));

		//System.out.println("Attribute Value Of First Help Topic - before: " + attributeValueOfFirstHelpTopicBefore);
		
		//Expand the last help topic
		driver.findElement(By.cssSelector("article>nav[data-tracking-cat='accordion-homepage']>section:last-child")).click();
		
		//Verify the first help topic has collapsed
		String attributeValueOfFirstHelpTopicAfter = driver.findElement(By.xpath("//article/nav[@class='accordion-homepage']/section[h2[text()='Popular articles']]/div/div")).getAttribute("style");
		Assert.assertFalse(attributeValueOfFirstHelpTopicAfter.equals("margin-top: 0px"));
		//System.out.println("Attribute Value Of First Help Topic - after: " + attributeValueOfFirstHelpTopicAfter);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
