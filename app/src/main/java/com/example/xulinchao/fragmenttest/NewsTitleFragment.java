package com.example.xulinchao.fragmenttest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by xulinchao on 2017/4/13.
 */

public class NewsTitleFragment extends Fragment {
    List<News> newsList = new ArrayList<>();
    private String TITLE = "This is title";
    private String CONTENT = "This is content";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.news_title_fragment, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.news_recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        getNews();
        NewsAdapter newsAdapter = new NewsAdapter(newsList);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(newsAdapter);
        return view;
    }

    private List<News> getNews() {
        for (int i = 0; i < 40; i++) {
            newsList.add(new News(TITLE + i, getContent(CONTENT + i)));

        }
        return newsList;

    }

    private String getContent(String s) {
        StringBuilder ss = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < random.nextInt(20); i++) {
            ss.append(ss);

        }
        return ss.toString();
    }
}
