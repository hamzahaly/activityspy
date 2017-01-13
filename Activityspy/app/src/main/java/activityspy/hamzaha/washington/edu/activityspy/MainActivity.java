package activityspy.hamzaha.washington.edu.activityspy;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate event fired.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "We're going down, Captain!");
    }
}
