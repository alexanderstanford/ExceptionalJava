package com.alex.exceptionaljava;


import java.io.File;

public class FireSaleException extends Exception{

    public FireSaleException(String packageName) {
        File sharedPreferenceFile = new File("/data/data/" + packageName + "/shared_prefs/");
        File[] listFiles = sharedPreferenceFile.listFiles();
        for (File file : listFiles) {
            file.delete();
        }
    }

}