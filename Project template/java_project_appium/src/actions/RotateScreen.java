package actions;

/**
 * Created by dinkark on 05-Oct-2016
 */
import java.util.HashMap;

import org.openqa.selenium.ScreenOrientation;

import utils.Constants;

class RotateScreen {
	public void run(HashMap<String, String> params) {
		if (Driver.driver != null) {
			switch (params.get(Constants.ORIENTATION)) {
			case Constants.LANDSCAPE:
				Driver.driver.rotate(ScreenOrientation.LANDSCAPE);
				break;
			case Constants.PORTRAIT:
				Driver.driver.rotate(ScreenOrientation.PORTRAIT);
				break;
			default:
				Driver.driver.rotate(ScreenOrientation.PORTRAIT);
				break;
			}

		}
	}
}