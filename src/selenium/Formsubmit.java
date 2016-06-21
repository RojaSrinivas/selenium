package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Formsubmit {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://spicejet.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")));
		//dropdown.selectByIndex(4);
		dropdown.selectByVisibleText("5 Adults");
		//Select dropdown1 = new Select (driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Child']")));
		//dropdown1.selectByVisibleText("1 Child");
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_StudentDiscount']")).click();
		boolean vallue = driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_StudentDiscount']")).isSelected();
		System.out.println(vallue);
		
		

	}

}
