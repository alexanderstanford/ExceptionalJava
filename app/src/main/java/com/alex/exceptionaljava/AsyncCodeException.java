package com.alex.exceptionaljava;


import android.os.AsyncTask;

import java.util.ArrayList;

public class AsyncCodeException extends Exception {

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

            return null;
        }
    }

    public interface Code {

        public <T> void AsyncRun(ArrayList<T> params);
    }
}