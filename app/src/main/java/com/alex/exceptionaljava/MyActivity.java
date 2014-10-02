package com.alex.exceptionaljava;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        final ArrayList test = new ArrayList();
        try {
            throw new CodeRunException(test, new CodeRunException.Code() {
                @Override
                public <T> void Run(ArrayList<T> params) {
                    Log.d("my code", "is running and whatnot");
                }
            });
        } catch (CodeRunException exception) {
        }
    }
}