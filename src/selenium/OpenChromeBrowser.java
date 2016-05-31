package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "")
		ChromeDriver c1=new ChromeDriver();
		c1.get("http://facebook.com");
		c1.close();
		

	}

}
