package com.example.mackansari.maqbool2017summer;

import android.app.Application;

import com.example.mackansari.maqbool2017summer.util.UtilLog;

/**
 * Created by mackansari on 6/19/17.
 */

public class MaqboolApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        UtilLog.setIsLog(true);
    }
}
