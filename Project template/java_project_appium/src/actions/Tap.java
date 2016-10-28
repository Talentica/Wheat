package actions;

/**
 * Created by dinkark on 13-Oct-2016
 */
import java.util.HashMap;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import utils.Elements;

class Tap {
	public void run(HashMap<String, String> params) {
		TouchAction action = new TouchAction(Driver.driver);
		MobileElement element = Elements.find(params, Driver.driver);
		action.tap(element).perform();
	}
}
