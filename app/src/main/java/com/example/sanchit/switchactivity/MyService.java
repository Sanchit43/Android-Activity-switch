package com.example.sanchit.switchactivity;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    private static final String TAG="com.example.sanchit.switchactivity";
    public MyService() {
    }

    @Override
    public void onDestroy() {
        Log.i(TAG,"Ghus Gaya");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG,"Shuru Ho gaya");
        Runnable r=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++)
                {
                    long ft=System.currentTimeMillis()+5000;
                    while (System.currentTimeMillis()<ft)
                    {
                        synchronized (this)
                        {
                            try {
                                wait(ft-System.currentTimeMillis());
                                Log.i(TAG,"Shuru hui Start wali");
                            }catch (Exception e){}
                        }
                    }
                }
            }
        };
        Thread th=new Thread(r);
        th.start();
        return Service.START_STICKY;

    }

    @Override
    public IBinder onBind(Intent intent) {
     return null;
    }
}
