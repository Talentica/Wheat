package actions;

/**
 * Created by dinkark on 03-Oct-2016
 */
import java.util.HashMap;

import io.appium.java_client.MobileElement;
import utils.Elements;

class GetText {
	public String run(HashMap<String, String> params) {
		MobileElement element = Elements.find(params, Driver.driver);
		return element.getText();
	}
}