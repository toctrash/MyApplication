package com.example.a29129.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.a29129.myapplication.utilities.MyTextUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyTextUtil util = new MyTextUtil();
        TextView tv = (TextView) findViewById(R.id.activity_text_view);
        tv.setText(util.getTextValue());

        for (int counter = 0; counter < 10; counter++) {
            Log.i("MainActivity", "onCreate value: "+counter);
        }
    }
}
