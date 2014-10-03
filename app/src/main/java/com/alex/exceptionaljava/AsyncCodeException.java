package com.alex.exceptionaljava;

import android.os.AsyncTask;
import android.util.Log;

import java.util.ArrayList;


public class AsyncCodeException extends Exception {

    protected final static String TAG = "AsyncCodeException";

    public <T> AsyncCodeException(ArrayList<T> params, Code run) {
        ArrayList temp = new ArrayList();
        temp.add(params);
        temp.add(run);
        AsyncCode code = new AsyncCode();
        code.execute(temp);
    }

    public class AsyncCode extends AsyncTask<Object, Void, Void> {

        @Override
        protected Void doInBackground(Object... params) {
            boolean switcher = true;
            ArrayList temp = null;
            AsyncCodeException.Code code = null;
            for (Object element : params) {
                if (switcher) {
                    temp = (ArrayList)element;
                    switcher = false;
                } else {
                    code = (AsyncCodeException.Code)element;
                }
            }
            try {
                code.AsyncRun(temp);
            } catch (NullPointerException exception) {
                Log.d(TAG, "Either AsyncRun or Params are null");
            }
            return null;
        }
    }

    public interface Code {
        public <T> void AsyncRun(ArrayList<T> params);
    }
}