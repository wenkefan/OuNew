package com.wenke.ounew.app;

import android.app.Application;
import android.content.Context;

/**
 * Created by wenke on 2017/8/7.
 */

public class App extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }

    public static Context getmContext(){
        return mContext;
    }
}
