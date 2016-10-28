package actions;

/**
 * Created by dinkark on 05-Oct-2016
 */
import java.util.HashMap;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import utils.Elements;

class LongPress {
	public void run(HashMap<String, String> params) {
		TouchAction action = new TouchAction(Driver.driver);
		MobileElement element = Elements.find(params, Driver.driver);
		action.longPress(element).perform();
	}
}