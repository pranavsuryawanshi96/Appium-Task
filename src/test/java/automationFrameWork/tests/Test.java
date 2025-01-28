package automationFrameWork.tests;

import java.awt.Desktop.Action;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import automationFrameWork.utility.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.TapOptions;

public class Test {
	// Test class for the automation framework

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		// ser the requird capabilities
		dc.setCapability("deviceName", "Pixel 9");
		dc.setCapability("udid", "emulator-5554");
		dc.setCapability("platformVersion", "14");
		dc.setCapability("platformName", "Android");
		dc.setCapability("automationName", "uiAutomator2");
		dc.setCapability("appPackage", "com.mxtech.videoplayer.ad");
		dc.setCapability("appActivity", "com.mxtech.videoplayer.ad.ActivityWelcomeMX");
		URL url = new URL("http://127.0.0.1:4723");
		AndroidDriver driver = new AndroidDriver(url, dc);
		System.out.println("app is start");
		TouchAction action = new TouchAction(driver);

		// Perform the actions on the app on MX Player
//		// click on privacy
		Thread.sleep(2000);
		action.tap(driver.findElement(By.xpath(
				"//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.mxtech.videoplayer.ad:id/tiles_list\"]/androidx.appcompat.widget.LinearLayoutCompat[1]/android.widget.FrameLayout")));
		// click on upload
		Thread.sleep(4000);
		action.tap(driver.findElement(
				By.xpath("//android.widget.ImageButton[@resource-id=\"com.mxtech.videoplayer.ad:id/fab_add\"]")));
		// click on select file // file will not uploaded
		// go to back
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
//		 clcik on search
		WebElement searcElement = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Search\"]"));
		action.tap(searcElement);
		Thread.sleep(4000);
		searcElement.sendKeys("aa");

		// perform the scroll
		new TouchAction(driver).scroll();
		// click on music
		action.tap(driver.findElement(By.xpath(
				"//android.widget.LinearLayout[@resource-id=\"com.mxtech.videoplayer.ad:id/music_tab\"]/android.widget.ImageView")));

	}

}
