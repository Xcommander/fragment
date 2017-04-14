package com.example.xulinchao.fragmenttest;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


/**
 * Created by xulinchao on 2017/4/13.
 */

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsHolder>{
    private List<News> newsList;
    public NewsAdapter(List<News> list) {
        newsList=list;
    }

    @Override
    public NewsHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.news_items
        ,parent,false);
        final NewsHolder newsHolder=new NewsHolder(view);
        view.setOnClickListener(new View.OnClickListener() {
            News news=newsList.get(newsHolder.getAdapterPosition());
            @Override
            public void onClick(View v) {
                NewsContentFragment newsContentFragment=(NewsContentFragment)((NewsActivity)parent.getContext()).getSupportFragmentManager().findFragmentById(R.id.news_content_fragment);
                newsContentFragment.reflash(news.getTitle(),news.getContent());

            }
        });

        return newsHolder;
    }

    @Override
    public void onBindViewHolder(NewsHolder holder, int position) {

        News news=newsList.get(position);
        holder.textView.setText(news.getTitle());

    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    static class NewsHolder extends RecyclerView.ViewHolder{
        TextView textView;

        public NewsHolder(View itemView) {
            super(itemView);
            textView=(TextView) itemView.findViewById(R.id.news_title);
        }
    }
}
