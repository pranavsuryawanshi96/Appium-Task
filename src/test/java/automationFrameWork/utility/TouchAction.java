package automationFrameWork.utility;

import java.awt.Dimension;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import io.appium.java_client.android.AndroidDriver;

public class TouchAction {
	AndroidDriver driver;

	public TouchAction(AndroidDriver driver) {
		super();
		this.driver = driver;
	}

	// createing method for clicking/tap
	public void tap(WebElement ele) {
		PointerInput touch = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence tap = new Sequence(touch, 0);
		tap.addAction(touch.createPointerMove(Duration.ZERO, PointerInput.Origin.fromElement(ele), 0, 0));
		tap.addAction(touch.createPointerDown(0));
		tap.addAction(touch.createPointerUp(0));
		driver.perform(Arrays.asList(tap));
	}

	// createing method for scrolling
	public void scroll() {
		org.openqa.selenium.Dimension Dimension = driver.manage().window().getSize();
     int x= Dimension.width/2;
     int y=Dimension.height/2;
     int starty= (int)(Dimension.height*0.8);
     int endy= (int)(Dimension.height*0.2);
     
	}

}
