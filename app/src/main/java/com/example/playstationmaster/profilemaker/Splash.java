package com.example.playstationmaster.profilemaker;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

public class Splash extends AppCompatActivity {

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_splash);

        MediaPlayer backgrounds = MediaPlayer.create(this, R.raw.logosound);
        backgrounds.setLooping(false);
        backgrounds.start();

        Handler handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                finish();
            }
        };

        handler.sendEmptyMessageDelayed(0,1000);
    }
}
