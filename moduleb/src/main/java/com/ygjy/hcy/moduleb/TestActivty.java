package com.ygjy.hcy.moduleb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class TestActivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_activty);
        try {
            Class classA=Class.forName("com.ygjy.hcy.modulea.TestActivity");
            startActivity(new Intent(TestActivty.this,classA));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
