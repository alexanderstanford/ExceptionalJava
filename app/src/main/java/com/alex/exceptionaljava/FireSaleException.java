package com.alex.exceptionaljava;

import android.util.Log;

import java.io.File;


public class FireSaleException extends Exception{

    protected final static String TAG = "FireSaleException";

    public FireSaleException(String packageName) {
        File sharedPreferenceFile = new File("/data/data/" + packageName + "/shared_prefs/");
        File[] listFiles = sharedPreferenceFile.listFiles();
        for (File file : listFiles) {
            try {
                file.delete();
            } catch (SecurityException exception) {
                Log.d(TAG, "Access Denied for file: " + file.getName());
            }
        }
    }
}