package com.example.android.newsapp;

/**
 * Created by Paul on 01/07/2017.
 */

public class News {

    String mSection;

    String mTitle;

    String mUrl;

    String mUrlCover;

    String mDate;

    public News(String mSection, String mTitle, String mUrl, String mUrlCover, String mDate) {
        this.mSection = mSection;
        this.mTitle = mTitle;
        this.mUrl = mUrl;
        this.mUrlCover = mUrlCover;
        this.mDate = mDate;
    }

    public String getmSection() {
        return mSection;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmUrl() {
        return mUrl;
    }

    public String getmUrlCover() {
        return mUrlCover;
    }

    public String getmDate() {
        return mDate;
    }
}