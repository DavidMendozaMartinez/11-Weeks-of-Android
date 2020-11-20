package com.google.sample.cast.castconnect;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;

public class MyApplication extends Application {

    private static final String LOG_TAG = "MyApplication";

    @Override
    public void onCreate() {
        super.onCreate();

        ProcessLifecycleOwner.get().getLifecycle().addObserver(new AppLifecycleObserver());
    }

    public static class AppLifecycleObserver implements DefaultLifecycleObserver {
        @Override
        public void onResume(@NonNull LifecycleOwner owner) {
            Log.d(LOG_TAG, "onResume");
        }

        @Override
        public void onPause(@NonNull LifecycleOwner owner) {
            Log.d(LOG_TAG, "onPause");
        }
    }
}

