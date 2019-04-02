package com.ygjy.hcy.appdemo.dagger2;

import dagger.Module;
import dagger.Provides;

/**
 * @创建人：hcy
 * @创建时间：2019/4/2
 * @作用描述：Function
 * @email:384317693@qq.com
 **/
@Module
public class UserModule {
    @Provides
    public User providesUser() {
        return new User();
    }
}
