package il.ac.huji.parsedb;

/**
 * Created by Paz on 7/11/2015.
 */

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {
    public void onCreate() {
        // Parse generated values:
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "tlSBXlbDo127MbG97Ho7SmPT2lykEF5VQnhRV9np", "7CaFriBEOzaurDaJwtOtCn9vOxeB6iwsUsSUOE2F");
    }
}
