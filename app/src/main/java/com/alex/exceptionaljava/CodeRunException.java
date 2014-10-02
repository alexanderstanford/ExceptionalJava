package com.alex.exceptionaljava;


import java.util.ArrayList;

public class CodeRunException extends Exception{

    public <T> CodeRunException(ArrayList<T> params, Code run) {
        run.Run(params);
    }

    public interface Code {

        public <T> void Run(ArrayList<T> params);

    }
}