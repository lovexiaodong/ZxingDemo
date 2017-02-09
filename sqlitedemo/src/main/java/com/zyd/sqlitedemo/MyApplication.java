package com.zyd.sqlitedemo;

import android.app.Application;

/**
 * Created by 张玉栋 on 2017/2/8.
 */

public class MyApplication  extends Application {


    private static Application app;

    public static Application getInstance(){
        return  app;
    }

    @Override
    public void onCreate() {
        app = this;
        super.onCreate();
    }



}
