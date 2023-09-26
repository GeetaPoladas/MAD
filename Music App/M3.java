package com.example.music;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class M3 extends Service {
    MediaPlayer myPlayer;
    public IBinder onBind(Intent intent) {
        return null;
    }
    @Override
    public void onCreate() {
        myPlayer = MediaPlayer.create(this,R.raw.telugu);
        myPlayer.setLooping(false);
    }
    @Override
    public void onStart(Intent intent,int startid) {
        Toast.makeText(this,"Service Started and playing music",Toast.LENGTH_LONG).show();
        myPlayer.start();
    }
    @Override
    public void onDestroy() {
        Toast.makeText(this,"Service Stopped and Music stopped",Toast.LENGTH_LONG).show();
        myPlayer.stop();
    }
}
