package com.example.android.newsapp;

import com.squareup.picasso.Picasso;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Paul on 01/07/2017.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context c, List<News> b) {
        super (c, 0, b);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        News currentNews = getItem(position);

        TextView titleView = (TextView) listItemView.findViewById(R.id.news_title);
        titleView.setText(currentNews.getmTitle());



        TextView dateView = (TextView) listItemView.findViewById(R.id.news_date);
        dateView.setText(currentNews.getmDate().substring(0, 10));

        TextView sectionView = (TextView) listItemView.findViewById(R.id.news_section);
        sectionView.setText(currentNews.getmSection());

        ImageView coverImage = (ImageView) listItemView.findViewById(R.id.cover_image);

        if (currentNews.getmUrlCover() != null && !currentNews.getmUrlCover().isEmpty()) {
            Log.v("IMAGE", "IMAGE" + currentNews.getmUrlCover());
            Picasso.with(getContext()).load(currentNews.getmUrlCover()).into(coverImage);
        }

        return listItemView;
    }

    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

}
