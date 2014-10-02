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
        test.add("test text in test arraylist");
        try {
            throw new AsyncCodeException(test, new AsyncCodeException.Code() {
                @Override
                public <T> void AsyncRun(ArrayList<T> params) {
                    Log.d("inside AsyncRun", "params are: " + params.toString());
                }
            });
        } catch (AsyncCodeException exception) {
        }
    }
}