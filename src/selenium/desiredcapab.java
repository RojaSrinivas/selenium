import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;


public class desiredcapab {

	@Test
	public void test() throws MalformedURLException {
		File appDir = new File("src");
		File app = new File (appDir,"book-my-show.apk");
		DesiredCapabilities DC1 = new DesiredCapabilities();
		DC1.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		DC1.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		DC1.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		DC1.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),DC1 );
		//driver.findElementByName("Login").click();
		driver.findElementById("com.bt.bms:id/btnLogin").click();
		driver.findElementById("com.bt.bms:id/signUp").click();
		int s = driver.findElements(By.className("android.widget.EditText")).size();
		System.out.println(s);
		List<WebElement>a=driver.findElements(By.className("android.widget.EditText"));
		a.get(0).sendKeys("appium");
		a.get(1).sendKeys("training");
		a.get(2).sendKeys("appium@training.com");
		a.get(6).sendKeys("123456789");
		driver.findElementById("com.bt.bms:id/action_icon").click();
		
		
		
	}

}
