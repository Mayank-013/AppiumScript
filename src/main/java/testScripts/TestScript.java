package testScripts;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TestScript {
	
	@Test
	public void setup() throws Exception {
AppiumDriver<MobileElement> driver ;
		
		DesiredCapabilities d = new DesiredCapabilities();
	
		d.setCapability("deviceName", "Emulator");
		d.setCapability("udid", "emulator-5554");
		d.setCapability("platformName", "Android");
		d.setCapability("platformVersion", "9.0");
		d.setCapability("autoGrantPermissions", "true");
		d.setCapability("appPackage", "com.nitara.serviceprovider");
		d.setCapability("appActivity", "com.nitara.serviceprovider.MainActivity");
		
		URL url  =new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,d);
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
		WebElement phno = driver.findElement(By.id("com.nitara.serviceprovider:id/phone_number"));
		WebElement pass = driver.findElement(By.id("com.nitara.serviceprovider:id/password"));
		WebElement login = driver.findElement(By.id("com.nitara.serviceprovider:id/login_button"));
		
		phno.sendKeys("8885468815");
		pass.sendKeys("12345678");
		login.click();
		
		
	}

}