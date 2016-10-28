package actions;

/**
 * Created by dinkark on 03-Oct-2016
 */
import java.util.HashMap;

import utils.Constants;

class InstallApp {
	public void run(HashMap<String, String> params) {
		if (Driver.driver != null) {
			Driver.driver.installApp(params.get(Constants.APP_PATH));
		}
	}
}