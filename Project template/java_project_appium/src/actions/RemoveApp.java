package actions;

/**
 * Created by dinkark on 03-Oct-2016
 */
import java.util.HashMap;

import utils.Constants;

class RemoveApp {
	public void run(HashMap<String, String> params) {
		if (Driver.driver != null) {
			Driver.driver.removeApp(params.get(Constants.BUNDLE_ID));
		}
	}
}