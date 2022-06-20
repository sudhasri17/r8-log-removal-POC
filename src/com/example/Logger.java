package com.example;

import android.util.Log;

class Logger{
    public static final String VERBOSE = "VERBOSE";
    public static final String DEBUG = "DEBUG";
    public static final String ERROR = "ERROR";
    public void log(String priority, String tag, String msg){
        if(priority.equals(VERBOSE)){
            return;
        } else if (priority.equals(DEBUG)){
            Log.d(tag, msg);
        } else if (priority.equals(ERROR)){
            Log.e(tag, msg);
        }
    }

    public static void logVerbose(String tag, String msg){
        Log.v(tag, msg);
    }

    public static void logDebug(String tag, String msg){
        Log.d(tag, msg);
    }
}