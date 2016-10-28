package actions;

/**
 * Created by dinkark on 03-Oct-2016
 */
import java.util.HashMap;

class ResetApp {
	public void run(HashMap<String, Object> params) {
		if (Driver.driver != null) {
			Driver.driver.resetApp();
		}
	}
}