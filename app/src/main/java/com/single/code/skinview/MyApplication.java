package com.single.code.skinview;

import android.app.Application;

import com.single.code.skinlib.SkinManager;


/**
 * @author Lance
 * @date 2018/3/8
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SkinManager.init(this);

    }
}
