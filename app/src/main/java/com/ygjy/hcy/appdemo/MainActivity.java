package com.ygjy.hcy.appdemo;



import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ygjy.hcy.baselib.utils.FragmentUtils;

import butterknife.BindView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // startActivity(new Intent(MainActivity.this, TestActivty.class));
        Fragment[] fragments=new Fragment[]{new ModuleAFragment(),new ModuleBFragment(),new ModuleCFragment()};
        FragmentUtils.showFragmentByPosition(getSupportFragmentManager(),0,fragments,R.id.fragment_layout);

    }
}
