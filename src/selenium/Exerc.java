package selenium;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Exerc {

	public static void main(String[] args) {
	

		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.ebay.com/");
	WebElement footer = driver.findElement(By.xpath(".//*[@id='glbfooter']"));
	WebElement col=driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
	String Beforeclicking = null;
	String Afterclicking;
	for(int i=0;i<col.findElements(By.tagName("a")).size();i++)
	{
	
		
		if(col.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
		{
			Beforeclicking = driver.getTitle();
		
			col.findElements(By.tagName("a")).get(i).click();
			break;
			}
	}
	Afterclicking =driver.getTitle();
	if(Beforeclicking!=Afterclicking)
	{
		if(driver.getPageSource().contains("sitemap"))
	
			System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");
	}
		
}
	                   
	}


