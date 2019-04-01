package com.ygjy.hcy.appdemo;


import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.orhanobut.logger.Logger;
import com.ygjy.hcy.baselib.base.BaseActivity;
import com.ygjy.hcy.baselib.utils.FragmentUtils;

import butterknife.BindView;


public class MainActivity extends BaseActivity {
    @BindView(R.id.fragment_layout)
    FrameLayout fragment_layout;

    @Override
    protected int setLayoutId() {
        return R.layout.activity_main;

    }

    @Override
    protected void init() {
        Fragment[] fragments = new Fragment[]{new ModuleAFragment(), new ModuleBFragment(), new ModuleCFragment()};
        FragmentUtils.showFragmentByPosition(getSupportFragmentManager(), 0, fragments, R.id.fragment_layout);

    }

}
