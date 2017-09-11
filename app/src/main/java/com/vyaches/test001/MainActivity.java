package com.vyaches.test001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button)findViewById(R.id.button2);
        b.setText("Hello");
        Button a = (Button)findViewById(R.id.button);
        a.setText("Hi");
    }
}
