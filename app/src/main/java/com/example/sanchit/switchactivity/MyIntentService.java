package com.example.sanchit.switchactivity;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Sanchit on 2/12/2017.
 */

public class MyIntentService extends IntentService {
    private static final String TAG="com.example.sanchit.switchactivity";
    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i(TAG,"Chal gai service");

    }

    public MyIntentService() {
        super("MyIntentService");

    }
}
