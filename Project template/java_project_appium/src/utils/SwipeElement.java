package utils;

/**
 * Created by dinkark on 12-Oct-2016
 */
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.TouchAction;

public class SwipeElement {
	public static void swipe(int startX, int startY, int endX, int endY, AppiumDriver<MobileElement> driver) {

		TouchAction touchAction = new TouchAction(driver);
		touchAction.press(startX, startY).moveTo(endX, endY).release();
		touchAction.perform();

	}

	public static void swipeLeft(MobileElement element, AppiumDriver<MobileElement> driver) {
		Dimension dimension = element.getSize();
		Point center = element.getCenter();
		int startX = center.getX() + (int) (0.2 * dimension.getWidth());
		int startY = element.getLocation().getY();
		int endX = -(int) (0.7 * dimension.getWidth());
		int endY = 0;
		swipe(startX, startY, endX, endY, driver);

	}

	public static void swipeLeftSlow(MobileElement element, AppiumDriver<MobileElement> driver) {
		Point center = element.getCenter();
		int startX = center.getX();
		int startY = element.getLocation().getY();
		int endX = (int) -(0.4 * element.getSize().getWidth());
		int endY = 0;

		swipe(startX, startY, endX, endY, driver);
	}

	public static void swipeRight(MobileElement element, AppiumDriver<MobileElement> driver) {
		Dimension dimension = element.getSize();
		Point center = element.getCenter();
		int startX = center.getX() - (int) (0.2 * dimension.getWidth());
		int startY = element.getLocation().getY();
		int endX = (int) (0.69 * dimension.getWidth());
		int endY = 0;
		swipe(startX, startY, endX, endY, driver);
		
	}

	public static void swipeRightSlow(MobileElement element, AppiumDriver<MobileElement> driver) {
		Point center = element.getCenter();
		int startX = center.getX();
		int startY = element.getLocation().getY();
		int endX = (int) (0.4 * element.getSize().getWidth());
		int endY = 0;
		swipe(startX, startY, endX, endY, driver);
	}

	public static void swipeDownSlow(MobileElement element, AppiumDriver<MobileElement> driver) {
		Point center = element.getCenter();
		int startX = element.getLocation().getX();
		int startY = center.getY();
		int endX = 0;
		int endY = (int) (0.35 * element.getSize().getHeight());
		swipe(startX, startY, endX, endY, driver);
	}

	public static void swipeDown(MobileElement element, AppiumDriver<MobileElement> driver) {
		Dimension dimension = element.getSize();
		Point center = element.getCenter();
		int startX = element.getLocation().getX();
		int startY = center.getY();
		int endX = 0;
		int endY = dimension.getHeight() / 2;

		swipe(startX, startY, endX, endY, driver);
	}

	public static void swipeUpSlow(MobileElement element, AppiumDriver<MobileElement> driver) {
		Point center = element.getCenter();
		int startX = element.getLocation().getX();
		int startY = center.getY();
		int endX = 0;
		int endY = (int) -(0.35 * element.getSize().getHeight());
		swipe(startX, startY, endX, endY, driver);
	}

	public static void swipeUp(MobileElement element, AppiumDriver<MobileElement> driver) {
		Dimension dimension = element.getSize();
		Point center = element.getCenter();
		int startX = element.getLocation().getX();
		int startY = center.getY();
		int endX = 0;
		int endY = -dimension.getHeight() / 2;

		swipe(startX, startY, endX, endY, driver);
	}
}
	