package actions;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;

import utils.Constants;

/**
 * Created by dinkark on 14-Oct-2016
 */
class Screenshot {
	public void run(HashMap<String, String> params) throws IOException {
		File srcFile = Driver.driver.getScreenshotAs(OutputType.FILE);
		String filename = params.get(Constants.SCREENSHOT_NAME);
		File targetFile = new File(System.getProperty(Constants.USER_HOME),
				params.get(Constants.PATH_FOR_SCREENSHOT) + filename + new Date().toString() + ".jpg");
		FileUtils.copyFile(srcFile, targetFile);
	}
}
