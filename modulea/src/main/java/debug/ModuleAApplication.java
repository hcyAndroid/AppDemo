package debug;

import android.app.Application;
import android.util.Log;

/**
 * @创建人：hcy
 * @创建时间：2019/4/1
 * @作用描述：Function
 * @email:384317693@qq.com
 **/
public class ModuleAApplication extends Application {
    private String TAG="ModuleAApplication::";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: ");
    }
}
