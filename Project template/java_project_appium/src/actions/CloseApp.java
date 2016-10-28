package actions;

/**
 * Created by dinkark on 01-Oct-2016
 */
import java.util.HashMap;

class CloseApp {
	public void run(HashMap<String, Object> params) {
		if (Driver.driver != null) {
			Driver.driver.closeApp();
		}
	}
}