package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
public class MainActivity extends AppCompatActivity {

    Animation anim1,anim2,anim3,anim4;
    int flag=0;
    FloatingActionButton fb1,fb2,fb3,fb4,fb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fb1 = findViewById(R.id.fb);
        fb2 = findViewById(R.id.blinkfb);
        fb3 = findViewById(R.id.rotatefb);
        fb4 = findViewById(R.id.scalefb);
        fb5 = findViewById(R.id.translatefb);
        fb2.setVisibility(View.INVISIBLE);
        fb3.setVisibility(View.INVISIBLE);
        fb4.setVisibility(View.INVISIBLE);
        fb5.setVisibility(View.INVISIBLE);
        ImageView img = findViewById(R.id.imageView);
        anim1= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        anim2= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        anim3= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
        anim4= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
        fb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==0) {
                    fb2.setVisibility(View.VISIBLE);
                    fb3.setVisibility(View.VISIBLE);
                    fb4.setVisibility(View.VISIBLE);
                    fb5.setVisibility(View.VISIBLE);
                    flag=1;
                }
                else {
                    fb2.setVisibility(View.INVISIBLE);
                    fb3.setVisibility(View.INVISIBLE);
                    fb4.setVisibility(View.INVISIBLE);
                    fb5.setVisibility(View.INVISIBLE);
                    flag=0;
                }
            }
        });
        fb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.startAnimation(anim1);
            }
        });
        fb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.startAnimation(anim2);
            }
        });
        fb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.startAnimation(anim3);
            }
        });
        fb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.startAnimation(anim4);
            }
        });
    }
}