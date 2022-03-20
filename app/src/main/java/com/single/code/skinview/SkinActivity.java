package com.single.code.skinview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import com.single.code.skinlib.SkinManager;


/**
 * @author 享学课堂 jett
 */

public class SkinActivity extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        LayoutInflater.from(this).setFactory2();
        setContentView(R.layout.activity_skin);

//        findViewById(R.id.tabLayout);
//        Resources resources = getResources();
//        new Resources()

       

    }

    public void change(View view) {
        //换肤，收包裹，皮肤包是独立的apk包，可以来自网络下载
//        SkinManager.getInstance().loadSkin("/data/data/com.single.code.skinview/skinresapk-debug.apk");
        SkinManager.getInstance().loadSkin("/sdcard/skinresapk-debug.apk");
}

    public void restore(View view) {
        SkinManager.getInstance().loadSkin(null);
    }
}
