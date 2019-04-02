package com.ygjy.hcy.appdemo.dagger2;

import dagger.Component;


/**
 * @创建人：hcy
 * @创建时间：2019/4/2
 * @作用描述：Function
 * @email:384317693@qq.com
 **/
@Component(modules = {UserModule.class})
public interface UserComponet {
    void inject(Dagger2TestActivity activity);
}
