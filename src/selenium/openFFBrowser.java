package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class openFFBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver d1 = new FirefoxDriver();
		d1.get("http://google.com");
		d1.close();
		

	}

}
