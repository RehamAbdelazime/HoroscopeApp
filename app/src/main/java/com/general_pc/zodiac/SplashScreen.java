package com.general_pc.zodiac;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    ImageView intro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        intro = findViewById(R.id.splash_intro);
        Animation animation= AnimationUtils.loadAnimation(this, R.anim.splash_anim);
        intro.setAnimation(animation);
        final Intent in = new Intent(this, MainActivity.class);
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally {
                    startActivity(in);
                    finish();
                }
            }
        };
        timer.start();
    }
}
