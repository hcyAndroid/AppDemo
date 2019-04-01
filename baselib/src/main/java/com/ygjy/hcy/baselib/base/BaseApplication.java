package com.ygjy.hcy.baselib.base;

import android.app.Application;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;
import com.ygjy.hcy.baselib.constant.BaseConstant;

/**
 * @创建人：hcy
 * @创建时间：2019/4/1
 * @作用描述：Function
 * @email:384317693@qq.com
 **/
public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initLogger();
    }

    private void initLogger() {
        //可选每个日志的全局标记。 默认PRETTY_LOGGER
        //https://github.com/orhanobut/logger
        PrettyFormatStrategy strategy = PrettyFormatStrategy.newBuilder().tag(BaseConstant.LOGGER_GLOBAL_TAG).build();
        Logger.addLogAdapter(new AndroidLogAdapter(strategy));
    }
}
