package actions;

import java.util.HashMap;

import org.junit.Assert;

import io.appium.java_client.MobileElement;
import utils.SwipeAndFindElement;

/**
 * Created by dinkark on 13-Oct-2016
 */
class SwipeToFindElement {
	public void run(HashMap<String, String> params) {
		MobileElement element = SwipeAndFindElement.find(params, Driver.driver);
		Assert.assertNotNull(element);
		Assert.assertTrue(element.isDisplayed());
	}
}
