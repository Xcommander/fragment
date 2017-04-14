package com.example.xulinchao.fragmenttest;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

/**
 * Created by xulinchao on 2017/4/13.
 */

public class LinearLayoutTest  extends LinearLayout {

    public LinearLayoutTest(Context context, @Nullable AttributeSet attrs) {

        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.linearlayout_test,this);

    }


}
