package actions;

/**
 * Created by dinkark on 05-Oct-2016
 */
import java.util.HashMap;

import io.appium.java_client.MobileElement;
import utils.Elements;

class SetText {

	public void run(HashMap<String, String> params) {
		MobileElement element = Elements.find(params, Driver.driver);
		try {
			Driver.driver.hideKeyboard();
			element.click();
		} catch (Exception e) {
			element.click();
		}
		element.sendKeys(params.get("Text"));

	}
}
