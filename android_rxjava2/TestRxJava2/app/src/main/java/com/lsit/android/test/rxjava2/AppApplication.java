package com.lsit.android.test.rxjava2;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by SeungTaek.Lim on 2017. 7. 14..
 */

public class AppApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
    }
}
