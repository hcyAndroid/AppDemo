package com.ygjy.hcy.appdemo.dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.ygjy.hcy.appdemo.R;

import javax.inject.Inject;

import butterknife.BindView;

public class Dagger2TestActivity extends AppCompatActivity {
    @BindView(R.id.tv)
    TextView tv;

    @Inject
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger2_test);


        UserComponet userComponet = DaggerUserComponet.create();
        userComponet.inject(Dagger2TestActivity.this);

        user.say();


    }
}
