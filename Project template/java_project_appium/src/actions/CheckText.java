package actions;

import java.util.HashMap;

import org.junit.Assert;

import io.appium.java_client.MobileElement;
import utils.Constants;
import utils.Elements;

/**
 * Created by dinkark on 13-Oct-2016
 */
class CheckText {
	public void run(HashMap<String, String> params) {
		MobileElement element = Elements.find(params, Driver.driver);
		Assert.assertEquals(params.get(Constants.TEXT), element.getText());
	}
}
