package actions;

/**
 * Created by dinkark on 01-Oct-2016
 */
import java.util.HashMap;

import io.appium.java_client.MobileElement;
import utils.Elements;

class ClickElement {
	public void run(HashMap<String, String> params) {
		MobileElement element = Elements.find(params, Driver.driver);
		element.click();
		return;
	}

}