package actions;

/**
 * Created by dinkark on 30-Sep-2016
 */
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import utils.Constants;

class Driver {
	public static AppiumDriver<MobileElement> driver;
	String url;

	public void run(HashMap<String, String> params) throws MalformedURLException {
		if (driver != null) {
			return;
		}
		File classpathRoot = new File(System.getProperty(Constants.USER_HOME));
		File appDir = new File(classpathRoot, params.get(Constants.APP_DIR));
		File app = new File(appDir, params.get(Constants.APP_NAME));
		// Capabilities for driver
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, params.get(Constants.PLATFORM));
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, params.get(Constants.DEVICE_NAME));
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, params.get(Constants.VERSION));
		capabilities.setCapability(MobileCapabilityType.NO_RESET, params.get(Constants.NO_RESET));
		capabilities.setCapability(Constants.APP_PACKAGE, params.get(Constants.APP_PACKAGE));
		capabilities.setCapability(Constants.APP_ACTIVITY, params.get(Constants.LAUNCH_ACTIVITY));
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		capabilities.setCapability(MobileCapabilityType.UDID, params.get(Constants.UDID));
		url = params.get(Constants.APPIUM_NODE_URL);
		if (!url.startsWith(Constants.HTTP) && !url.startsWith(Constants.HTTPS)) {
			url = Constants.HTTP + url;
		}
		URL remoteAddress = new URL(url);
		switch (params.get(Constants.PLATFORM)) {
		case Constants.ANDROID:
			driver = new AndroidDriver<MobileElement>(remoteAddress, capabilities);
			break;
		case Constants.IOS:
			driver = new IOSDriver<MobileElement>(remoteAddress, capabilities);
			break;
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
}