package utils;

import java.util.HashMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;

/**
 * Created by dinkark on 13-Oct-2016
 */
public class SwipeAndFindElement {
	public static MobileElement find(HashMap<String, String> params, AppiumDriver<MobileElement> driver) {
		int noOfTimes = Integer.parseInt(params.get(Constants.NO_OF_TIMES));
		MobileElement element = null;
		HashMap<String, String> searchElementParams = new HashMap<>();
		searchElementParams.put(Constants.ID, params.get(Constants.SEARCHING_ELEMENT_ID));
		searchElementParams.put(Constants.ID_TYPE, params.get(Constants.SEARCHING_ELEMENT_ID_TYPE));
		searchElementParams.put(Constants.APP_TYPE, params.get(Constants.SEARCHING_ELEMENT_APP_TYPE));
		MobileElement swipeElement = Elements.find(params, driver);
		for (int i = 0; i < noOfTimes; i++) {
			switch (params.get(Constants.DIRECTION)) {
			case Constants.UP:

				if (params.get(Constants.APP_TYPE).equals(Constants.ANDROID)) {
					swipeElement.swipe(SwipeElementDirection.UP, (int) (0.25 * swipeElement.getSize().getHeight()),
							(int) (0.25 * swipeElement.getSize().getHeight()), 500);
				} else {
					SwipeElement.swipeUpSlow(swipeElement, driver);
				}
				break;
			case Constants.DOWN:
				if (params.get(Constants.APP_TYPE).equals(Constants.ANDROID)) {
					swipeElement.swipe(SwipeElementDirection.DOWN, (int) (0.25 * swipeElement.getSize().getHeight()),
							(int) (0.25 * swipeElement.getSize().getHeight()), 500);
				} else {
					SwipeElement.swipeDownSlow(swipeElement, driver);
				}
				break;
			case Constants.RIGHT:
				if (params.get(Constants.APP_TYPE).equals(Constants.ANDROID)) {
					swipeElement.swipe(SwipeElementDirection.RIGHT, (int) (0.25 * swipeElement.getSize().getWidth()),
							(int) (0.25 * swipeElement.getSize().getWidth()), 500);
				} else {
					SwipeElement.swipeRightSlow(swipeElement, driver);
				}
				break;
			case Constants.LEFT:
				if (params.get(Constants.APP_TYPE).equals(Constants.ANDROID)) {
					swipeElement.swipe(SwipeElementDirection.LEFT, (int) (0.25 * swipeElement.getSize().getWidth()),
							(int) (0.25 * swipeElement.getSize().getWidth()), 500);
				} else {
					SwipeElement.swipeLeftSlow(swipeElement, driver);
				}
				break;

			default:

				if (params.get(Constants.APP_TYPE).equals(Constants.ANDROID)) {
					swipeElement.swipe(SwipeElementDirection.UP, (int) (0.25 * swipeElement.getSize().getHeight()),
							(int) (0.25 * swipeElement.getSize().getHeight()), 500);
				} else {
					SwipeElement.swipeUpSlow(swipeElement, driver);
				}
				break;
			}

			if (isElementPresent(searchElementParams, driver)) {
				if (Elements.find(searchElementParams, driver).isDisplayed()) {
					element = Elements.find(searchElementParams, driver);
					break;
				}
			}
		}
		return element;

	}

	public static boolean isElementPresent(HashMap<String, String> searchElementParams,
			AppiumDriver<MobileElement> driver) {
		boolean size = Elements.findAll(searchElementParams, driver).size() > 0;
		return size;
	}
}
