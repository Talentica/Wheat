package actions;

import java.io.IOException;
import java.util.HashMap;

import utils.Constants;

/**
 * Created by dinkark on 26-Oct-2016
 */
class MakeAndroidInterruption {
	public void run(HashMap<String, String> params) throws IOException, InterruptedException {
		String udid = params.get(Constants.UDID);
		String ADB_PATH = params.get(Constants.ANDROID_HOME) + "/platform-tools/adb";
		String callScript = ADB_PATH + " -s " + udid + " shell am start -a android.settings.SETTINGS";
		Runtime.getRuntime().exec(callScript);
		Thread.sleep(3000);
		Runtime.getRuntime().exec(ADB_PATH + " -s " + udid + " shell input keyevent 4");
		return;
	}

}
