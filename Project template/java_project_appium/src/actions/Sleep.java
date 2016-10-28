package actions;

import java.util.HashMap;

/**
 * Created by dinkark on 01-Oct-2016
 */
public class Sleep {
	public void run(HashMap<String, String> params) throws InterruptedException {
		Thread.sleep(Integer.parseInt(params.get("millis")));

	}
}
