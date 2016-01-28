package yakush_mentoring;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Base {

	protected AppiumDriver driver;

	protected WebElement oneButton;
	protected WebElement twoButton;
	protected WebElement addButton;
	protected WebElement eqButton;
	protected WebElement resultField;

	@Before
	public void SetUp() throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "YakushS");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1.1");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
//		capabilities.setCapability("app", "calculator");
		capabilities.setCapability("appPackage", "com.android.calculator2");
		capabilities.setCapability("appActivity", "Calculator");
//		capabilities.setCapability("noSign", true);

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		oneButton = driver.findElement(By.id("com.android.calculator2:id/digit_1"));
		twoButton = driver.findElement(By.id("com.android.calculator2:id/digit_2"));
		addButton = driver.findElement(By.id("com.android.calculator2:id/op_add"));
		eqButton = driver.findElement(By.id("com.android.calculator2:id/eq"));
		resultField = driver.findElement(By.id("com.android.calculator2:id/formula"));

	}

	@After
	public void tearDown() {

		driver.quit();

	}

}
