package utils;

/**
 * Created by dinkark on 30-Sep-2016
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy.ByAndroidUIAutomator;
import io.appium.java_client.MobileBy.ByIosUIAutomation;
import io.appium.java_client.MobileElement;

public class Elements {

	public static MobileElement find(HashMap<String, String> params, AppiumDriver<MobileElement> Driver) {
		Assert.assertNotNull("Error Emulator is not opened.  Use Launch Emulator action.", Driver);
		MobileElement foundElement = null;
		if (params.get(Constants.APP_TYPE).equals(Constants.ANDROID)) {
			switch (params.get(Constants.ID_TYPE)) {
			case Constants.CLASS_NAME:
				foundElement = Driver.findElement(ByAndroidUIAutomator.className(params.get(Constants.ID)));
				break;
			case Constants.ID:
				foundElement = Driver.findElement(ByAndroidUIAutomator.id(params.get(Constants.ID)));
				break;
			case Constants.XPATH:
				foundElement = Driver.findElement(ByAndroidUIAutomator.xpath(params.get(Constants.ID)));
				break;
			case Constants.ANDROID_UI_AUTOMATOR:
				foundElement = Driver.findElement(ByAndroidUIAutomator.AndroidUIAutomator(params.get(Constants.ID)));
				break;
			case Constants.NAME:
				String xpath = ".//*[contains(@text,'" + params.get(Constants.ID) + "')]";
				foundElement = Driver.findElement(ByAndroidUIAutomator.xpath(xpath));
				break;
			default:
				foundElement = Driver.findElement(ByAndroidUIAutomator.id(params.get(Constants.ID)));
			}

			return foundElement;

		} else if (params.get(Constants.APP_TYPE).equals(Constants.IOS)) {
			switch (params.get(Constants.ID_TYPE)) {
			case Constants.CLASS_NAME:
				foundElement = Driver.findElement(ByIosUIAutomation.className(params.get(Constants.ID)));
				break;
			case Constants.ID:
				foundElement = Driver.findElement(ByIosUIAutomation.id(params.get(Constants.ID)));
				break;
			case Constants.XPATH:
				foundElement = Driver.findElement(ByIosUIAutomation.xpath(params.get(Constants.ID)));
				break;
			case Constants.IOS_UI_AUTOMATOR:
				foundElement = Driver.findElement(ByIosUIAutomation.IosUIAutomation(params.get(Constants.ID)));
				break;
			default:
				foundElement = Driver.findElement(ByIosUIAutomation.id(params.get(Constants.ID)));
			}

			return foundElement;
		} else {
			switch (params.get(Constants.ID_TYPE)) {
			case Constants.CLASS_NAME:
				foundElement = Driver.findElement(By.className(params.get(Constants.ID)));
				break;
			case Constants.CSS_SELECTOR:
				foundElement = Driver.findElement(By.cssSelector(params.get(Constants.ID)));
				break;
			case Constants.ID:
				foundElement = Driver.findElement(By.id(params.get(Constants.ID)));
				break;
			case Constants.LINK_TEXT:
				foundElement = Driver.findElement(By.linkText(params.get(Constants.ID)));
				break;
			case Constants.XPATH:
				foundElement = Driver.findElement(By.xpath(params.get(Constants.ID)));
				break;
			case Constants.NAME:
				foundElement = Driver.findElement(By.name(params.get(Constants.ID)));
				break;
			case Constants.PARTIAL_LINK_TEXT:
				foundElement = Driver.findElement(By.partialLinkText(params.get(Constants.ID)));
				break;
			case Constants.TAG_NAME:
				foundElement = Driver.findElement(By.tagName(params.get(Constants.ID)));
				break;
			default:
				foundElement = Driver.findElement(By.id(params.get(Constants.ID)));
			}

			return foundElement;
		}
	}

	public static List<MobileElement> findAll(HashMap<String, String> params, AppiumDriver<MobileElement> Driver) {
		Assert.assertNotNull("Error Emulator is not opened.  Use Launch Emulator action.", Driver);

		List<MobileElement> foundElements = new ArrayList<>();
		if (params.get(Constants.APP_TYPE).equals(Constants.ANDROID)) {
			switch (params.get(Constants.ID_TYPE)) {
			case Constants.CLASS_NAME:
				foundElements = Driver.findElements(ByAndroidUIAutomator.className(params.get(Constants.ID)));
				break;
			case Constants.ID:
				foundElements = Driver.findElements(ByAndroidUIAutomator.id(params.get(Constants.ID)));
				break;
			case Constants.XPATH:
				foundElements = Driver.findElements(ByAndroidUIAutomator.xpath(params.get(Constants.ID)));
				break;
			case Constants.ANDROID_UI_AUTOMATOR:
				foundElements = Driver.findElements(ByAndroidUIAutomator.AndroidUIAutomator(params.get(Constants.ID)));
				break;
			case Constants.NAME:
				String xpath = ".//*[contains(@text,'" + params.get(Constants.ID) + "')]";
				foundElements = Driver.findElements(ByAndroidUIAutomator.xpath(xpath));
				break;
			default:
				foundElements = Driver.findElements(ByAndroidUIAutomator.id(params.get(Constants.ID)));
			}

			return foundElements;
		} else if (params.get(Constants.APP_TYPE).equals(Constants.IOS)) {
			switch (params.get(Constants.ID_TYPE)) {
			case Constants.CLASS_NAME:
				foundElements = Driver.findElements(ByIosUIAutomation.className(params.get(Constants.ID)));
				break;
			case Constants.ID:
				foundElements = Driver.findElements(ByIosUIAutomation.id(params.get(Constants.ID)));
				break;
			case Constants.XPATH:
				foundElements = Driver.findElements(ByIosUIAutomation.xpath(params.get(Constants.ID)));
				break;
			case Constants.IOS_UI_AUTOMATOR:
				foundElements = Driver.findElements(ByIosUIAutomation.IosUIAutomation(params.get(Constants.ID)));
				break;
			default:
				foundElements = Driver.findElements(ByIosUIAutomation.id(params.get(Constants.ID)));
			}

			return foundElements;
		} else {
			switch (params.get(Constants.ID_TYPE)) {
			case Constants.CLASS_NAME:
				foundElements = Driver.findElements(By.className(params.get(Constants.ID)));
				break;
			case Constants.CSS_SELECTOR:
				foundElements = Driver.findElements(By.cssSelector(params.get(Constants.ID)));
				break;
			case Constants.ID:
				foundElements = Driver.findElements(By.id(params.get(Constants.ID)));
				break;
			case Constants.LINK_TEXT:
				foundElements = Driver.findElements(By.linkText(params.get(Constants.ID)));
				break;
			case Constants.XPATH:
				foundElements = Driver.findElements(By.xpath(params.get(Constants.ID)));
				break;
			case Constants.NAME:
				foundElements = Driver.findElements(By.name(params.get(Constants.ID)));
				break;
			case Constants.PARTIAL_LINK_TEXT:
				foundElements = Driver.findElements(By.partialLinkText(params.get(Constants.ID)));
				break;
			case Constants.TAG_NAME:
				foundElements = Driver.findElements(By.tagName(params.get(Constants.ID)));
				break;
			default:
				foundElements = Driver.findElements(By.id(params.get(Constants.ID)));
			}

			return foundElements;
		}
	}

}
