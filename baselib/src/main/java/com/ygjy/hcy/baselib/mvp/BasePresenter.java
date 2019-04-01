package com.ygjy.hcy.baselib.mvp;

/**
 * @创建人：hcy
 * @创建时间：2019/4/1
 * @作用描述：Function
 * @email:384317693@qq.com
 **/
public class BasePresenter<T extends IView> implements IPresenter {
    private T  rootView;

    public BasePresenter(T rootView) {
        this.rootView = rootView;
    }
}
