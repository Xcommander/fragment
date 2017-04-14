package com.example.xulinchao.fragmenttest;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static int x = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar toolbar = getSupportActionBar();
        if (toolbar != null) {
            toolbar.hide();
        }
        setContentView(R.layout.activity_main);
        //getFragmentManager().findFragmentById(R.id.right_fragement);
        replaceFramegemt(new RightFragement());
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (x % 2 == 0) {
//                    replaceFramegemt(new RightFragement());
//                } else {
//                    replaceFramegemt(new Another_left_linearlayout());
//                }
                Intent intent=new Intent(MainActivity.this,NewsActivity.class);
                startActivity(intent);


            }
        });

    }

    public void replaceFramegemt(Fragment fragment) {
        //获取manager，开始Transaction，取代replace，接下来就是commit完成
        x += 1;
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentTransaction replace;
        replace = fragmentTransaction.replace(R.id.right_fragement, fragment);
        replace.addToBackStack(null);
        replace.commit();

    }
}
