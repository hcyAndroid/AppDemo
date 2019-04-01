package com.ygjy.hcy.baselib.mvp;

import android.support.annotation.NonNull;

/**
 * @创建人：hcy
 * @创建时间：2019/4/1
 * @作用描述：Function
 * @email:384317693@qq.com
 **/
public interface IView {
    /**
     * 显示加载
     */
    void showLoading();

    /**
     * 隐藏加载
     */
    void hideLoading();

    /**
     * 显示信息
     *
     * @param message 消息内容, 不能为 {@code null}
     */
    void showMessage(int code, @NonNull String message);
}
