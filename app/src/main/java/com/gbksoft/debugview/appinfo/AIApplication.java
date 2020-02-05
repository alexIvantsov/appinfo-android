package com.gbksoft.debugview.appinfo;

import androidx.multidex.MultiDexApplication;

import com.gbksoft.debugview.appinfolib.AppInfo;
import com.facebook.stetho.Stetho;

public class AIApplication extends MultiDexApplication {

    @Override
    public void onCreate() {
        super.onCreate();

        setupStetho();
        setupAppInfo();
    }

    private void setupStetho() {
        if (BuildConfig.DEBUG) {
            Stetho.initializeWithDefaults(this);
        }
    }

    private void setupAppInfo() {
        new AppInfo.Builder(this)
                .isEnabled(true)
                .isShake()
                .build();
    }
}
