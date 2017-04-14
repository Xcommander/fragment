package com.example.xulinchao.fragmenttest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by xulinchao on 2017/4/13.
 */
// findViewById()只有activity有，所以必须获得调用activity方法，必须先获得activity的实例
public class RightFragement extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.right_fragement,container,false);
        return view;
    }
}
