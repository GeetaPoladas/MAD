package com.example.music;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mus1 = findViewById(R.id.m1);
        Button mus2 = findViewById(R.id.m2);
        Button mus3 = findViewById(R.id.m3);
        Button mus4 = findViewById(R.id.m4);
        Button mus5 = findViewById(R.id.m5);
        Button mus6 = findViewById(R.id.m6);
        mus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isMyServiceRunning(M2.class)) {
                    stopService(new Intent(MainActivity.this, M2.class));
                }
                if (isMyServiceRunning(M3.class)) {
                    stopService(new Intent(MainActivity.this, M3.class));
                }
                if (isMyServiceRunning(M4.class)) {
                    stopService(new Intent(MainActivity.this, M4.class));
                }
                if (isMyServiceRunning(M5.class)) {
                    stopService(new Intent(MainActivity.this, M5.class));
                }
                if (isMyServiceRunning(M6.class)) {
                    stopService(new Intent(MainActivity.this, M6.class));
                }
                startService(new Intent(MainActivity.this, M1.class));
            }
        });
        mus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isMyServiceRunning(M1.class)) {
                    stopService(new Intent(MainActivity.this, M1.class));
                }
                if (isMyServiceRunning(M3.class)) {
                    stopService(new Intent(MainActivity.this, M3.class));
                }
                if (isMyServiceRunning(M4.class)) {
                    stopService(new Intent(MainActivity.this, M4.class));
                }
                if (isMyServiceRunning(M5.class)) {
                    stopService(new Intent(MainActivity.this, M5.class));
                }
                if (isMyServiceRunning(M6.class)) {
                    stopService(new Intent(MainActivity.this, M6.class));
                }
                startService(new Intent(MainActivity.this, M2.class));
            }
        });
        mus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isMyServiceRunning(M2.class)) {
                    stopService(new Intent(MainActivity.this, M2.class));
                }
                if (isMyServiceRunning(M1.class)) {
                    stopService(new Intent(MainActivity.this, M1.class));
                }
                if (isMyServiceRunning(M4.class)) {
                    stopService(new Intent(MainActivity.this, M4.class));
                }
                if (isMyServiceRunning(M5.class)) {
                    stopService(new Intent(MainActivity.this, M5.class));
                }
                if (isMyServiceRunning(M6.class)) {
                    stopService(new Intent(MainActivity.this, M6.class));
                }
                startService(new Intent(MainActivity.this, M3.class));
            }
        });
        mus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isMyServiceRunning(M2.class)) {
                    stopService(new Intent(MainActivity.this, M2.class));
                }
                if (isMyServiceRunning(M3.class)) {
                    stopService(new Intent(MainActivity.this, M3.class));
                }
                if (isMyServiceRunning(M1.class)) {
                    stopService(new Intent(MainActivity.this, M1.class));
                }
                if (isMyServiceRunning(M5.class)) {
                    stopService(new Intent(MainActivity.this, M5.class));
                }
                if (isMyServiceRunning(M6.class)) {
                    stopService(new Intent(MainActivity.this, M6.class));
                }
                startService(new Intent(MainActivity.this, M4.class));
            }
        });
        mus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isMyServiceRunning(M2.class)) {
                    stopService(new Intent(MainActivity.this, M2.class));
                }
                if (isMyServiceRunning(M3.class)) {
                    stopService(new Intent(MainActivity.this, M3.class));
                }
                if (isMyServiceRunning(M4.class)) {
                    stopService(new Intent(MainActivity.this, M4.class));
                }
                if (isMyServiceRunning(M1.class)) {
                    stopService(new Intent(MainActivity.this, M1.class));
                }
                if (isMyServiceRunning(M6.class)) {
                    stopService(new Intent(MainActivity.this, M6.class));
                }
                startService(new Intent(MainActivity.this, M5.class));
            }
        });
        mus6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isMyServiceRunning(M2.class)) {
                    stopService(new Intent(MainActivity.this, M2.class));
                }
                if (isMyServiceRunning(M3.class)) {
                    stopService(new Intent(MainActivity.this, M3.class));
                }
                if (isMyServiceRunning(M4.class)) {
                    stopService(new Intent(MainActivity.this, M4.class));
                }
                if (isMyServiceRunning(M5.class)) {
                    stopService(new Intent(MainActivity.this, M5.class));
                }
                if (isMyServiceRunning(M1.class)) {
                    stopService(new Intent(MainActivity.this, M1.class));
                }
                startService(new Intent(MainActivity.this, M6.class));
            }
        });
    }

    private boolean isMyServiceRunning(Class<?> serviceClass) {
        ActivityManager manager = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        for (ActivityManager.RunningServiceInfo service : manager.getRunningServices(Integer.MAX_VALUE)) {
            if (serviceClass.getName().equals(service.service.getClassName())) {
                return true;
            }
        }
        return false;
    }
}