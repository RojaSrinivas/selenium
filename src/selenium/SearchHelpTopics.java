
package selenium;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SearchHelpTopics {
	WebDriver driver;
	@BeforeMethod
	public void setup(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
    @Test
	public void searchHelpTopicsTest() {

		
		
		driver.get("https://www.google.com");
		driver.findElement(By.id("lst-ib")).clear();
		driver.findElement(By.id("lst-ib")).sendKeys("google");
		driver.findElement(By.name("btnG")).click();
		driver.findElement(By.linkText("×")).click();
		driver.findElement(By.className("ab_button")).click();
		driver.findElement(By.linkText("Search help")).click();
		String str = driver.findElement(By.xpath("//article/nav[@class='accordion-homepage']/section[h2[text()='Popular articles']]/div/div")).getAttribute("style");
		System.out.println("the style attribute has a value of" + str +"-before");
		driver.findElement(By.cssSelector("article>nav[data-tracking-cat='accordion-homepage']>section:last-child")).click();
		String str1 = driver.findElement(By.xpath("//article/nav[@class='accordion-homepage']/section[h2[text()='Popular articles']]/div/div")).getAttribute("style");
		System.out.println("the style attribute has a value of" + str1 + "-after");
		
		
		

	}
    @AfterMethod
    public void tearDown(){
    	driver.quit();
    	
    }
    

}
