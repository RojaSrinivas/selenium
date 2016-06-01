package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchFourTimes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver(); // Launching the firefox Driver
		driver.get("https://www.google.com");//opening the google brwser
		WebElement searchBox = driver.findElement(By.id("lst-ib"));
	
		
		WebElement searchButton = driver.findElement(By.name("btnG"));
		String searchTerms[]= {"Saibersys","Roja","Google"};
		String pageTitle = "";
		boolean titleContainsTerm = false;
		for (int i=0; i<searchTerms.length; i++){
			searchBox.clear();
			searchBox.sendKeys(searchTerms[i]);
			
			searchButton.click();
			Thread.sleep(2000);
			pageTitle=driver.getTitle();
			
			titleContainsTerm = pageTitle.contains(searchTerms[i]);
			
			if(pageTitle.contains(searchTerms[i])){
				System.out.println("pageTitle is " + pageTitle);
				System.out.println("searchTerm" + searchTerms[i]);
				
			}
			else{
				
				System.out.println("pageTitle is " + pageTitle);
				System.out.println("searchTerm" + searchTerms[i]);
				
			}
			
		}
		driver.quit();
		
		
		

	}

}
