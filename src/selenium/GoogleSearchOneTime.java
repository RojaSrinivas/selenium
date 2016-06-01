package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchOneTime {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver(); // Launching the firefox Driver
		driver.get("https://www.google.com");//opening the google brwser
		driver.findElement(By.id("lst-ib")).clear();//ID of the search bar in firefox
		driver.findElement(By.id("lst-ib")).sendKeys("Saibersys");//entering the search term saibersys
		driver.findElement(By.name("btnG")).click();//clicking the search button
		Thread.sleep(2000);
		String pageTitle=driver.getTitle();
		System.out.println("pageTitle is " + pageTitle);
		boolean titleContainsTerm = pageTitle.contains("Saibersys");
		System.out.println(titleContainsTerm);
		driver.quit();
		

	}

}
