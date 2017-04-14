package com.example.xulinchao.fragmenttest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by xulinchao on 2017/4/13.
 */

public class NewsContentFragment extends Fragment {
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.news_content_fragment, container, false);
        return view;
    }

    public void reflash(String newsTilte, String newsContent) {
        RelativeLayout r = (RelativeLayout) view.findViewById(R.id.visibility_layout);
        r.setVisibility(View.VISIBLE);
        TextView title = (TextView) view.findViewById(R.id.newstitle);
        TextView content = (TextView) view.findViewById(R.id.newstitle);
        title.setText(newsTilte);
        content.setText(newsContent);


    }
}
