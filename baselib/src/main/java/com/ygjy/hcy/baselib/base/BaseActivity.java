package com.ygjy.hcy.baselib.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.ygjy.hcy.baselib.mvp.BasePresenter;
import com.ygjy.hcy.baselib.mvp.IPresenter;

import butterknife.ButterKnife;

/**
 * @创建人：hcy
 * @创建时间：2019/4/1
 * @作用描述：Function
 * @email:384317693@qq.com
 **/
public abstract class BaseActivity<P extends IPresenter> extends AppCompatActivity {
    protected P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayoutId());
        ButterKnife.bind(this);
        init();
    }

    /**
     * 设置布局资源id
     *
     * @return
     */
    protected abstract int setLayoutId();

    /**
     * 初始化数据的地方
     */
    protected abstract void init();
}
