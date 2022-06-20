/*
 * Sample application to illustrate processing with ProGuard.
 *
 * Copyright (c) 2012-2020 Guardsquare NV
 */
package com.example;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;
import android.util.Log;

/**
 * Sample activity that displays "Hello world!".
 */
public class HelloWorldActivity extends Activity
{
    Logger logger = new Logger();

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // Display the message.
        TextView view = new TextView(this);
        view.setText("Hello World");
        view.setGravity(Gravity.CENTER);
        setContentView(view);
        Logger.logVerbose("HI", "msg1");
        Logger.logVerbose("HI", "msg2" + "msg3");
        Logger.logVerbose("HIYANA", "Hello" + view.getText().toString());
        Logger.logVerbose("HUMAN", new StringBuilder("hello")
                .append("hi").append("asdvas").toString());
        Logger.logDebug("tag1", "msg4");
        logger.log("ERROR", "tag2", "msg5"); // non- static
        Log.v("VERBOSE1", "CAN YOU STRIP THIS?");
    }
}
