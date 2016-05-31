package selenium;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenIEBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "C:\\Users\\roja\\Downloads\\IEDriverServer.exe");
		InternetExplorerDriver i1=new InternetExplorerDriver();
		i1.get("http://facebook.com");
		i1.close();
		

	}

}