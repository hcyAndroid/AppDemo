package com.ygjy.hcy.appdemo.application;

import android.app.Application;
import android.util.Log;

import com.orhanobut.logger.Logger;
import com.ygjy.hcy.baselib.base.BaseApplication;

/**
 * @创建人：hcy
 * @创建时间：2019/4/1
 * @作用描述：Function
 * @email:384317693@qq.com
 **/
public class MainApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        Logger.t("小").d("MainApplication,%s","onCreate");
    }
}
