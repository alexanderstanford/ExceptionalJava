package com.alex.exceptionaljava;

import java.util.ArrayList;


public class RunCodeException extends Exception{

    protected final static String TAG = "RunCodeException";

    public <T> RunCodeException(ArrayList<T> params, Code run) {
        run.Run(params);
    }

    public interface Code {
        public <T> void Run(ArrayList<T> params);
    }
}