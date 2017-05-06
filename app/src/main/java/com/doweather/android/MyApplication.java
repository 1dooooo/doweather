package com.doweather.android;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePal;

/**
 * Created by do on 2017/5/6.
 */

public class MyApplication extends Application{

    private static Context context;

    @Override
    public void onCreate(){
        super.onCreate();
        context=getApplicationContext();
        LitePal.initialize(context);
    }

    public static Context getContext(){
        return context;
    }
}
