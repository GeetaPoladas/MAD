package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1=(Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final EditText e1=(EditText) findViewById(R.id.editTextNumber);
                final EditText e2=(EditText) findViewById(R.id.editTextNumber2);
                double a=Double.parseDouble(e1.getText().toString());
                double b=a-32;
                b=b*0.5555;
                e2.setText(String.valueOf(b));
            }
        });
        Button b2=(Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final EditText e1=(EditText) findViewById(R.id.editTextNumber);
                final EditText e2=(EditText) findViewById(R.id.editTextNumber2);
                double a=Double.parseDouble(e1.getText().toString());
                double b=a*1.8;
                b=b+32;
                e2.setText(String.valueOf(b));
            }
        });
    }
}
