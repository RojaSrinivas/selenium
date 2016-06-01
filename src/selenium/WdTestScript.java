package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WdTestScript {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
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
		Thread.sleep(3000);
		driver.quit();
		

	}

}
