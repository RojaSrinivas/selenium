package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Formsubmit {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://spicejet.com/");
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.quit();

	}

}
