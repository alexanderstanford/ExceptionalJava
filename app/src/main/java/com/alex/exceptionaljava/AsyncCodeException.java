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

    public class AsyncCode extends AsyncTask<ArrayList, Void, Void> {

        @Override
        protected Void doInBackground(ArrayList... params) {
            boolean switcher = true;
            ArrayList temp = null;
            AsyncCodeException.Code code = null;
            for (ArrayList element : params) {
                for (Object ele : element) {
                    if (switcher) {
                        temp = (ArrayList)ele;
                        switcher = false;
                    } else {
                        code = (AsyncCodeException.Code)ele;
                    }
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