package actions;

/**
 * Created by dinkark on 03-Oct-2016
 */
import java.util.HashMap;

class ReLaunchApp {
	public void run(HashMap<String, String> params) {
		if (Driver.driver != null) {
			Driver.driver.launchApp();
		}
	}
}