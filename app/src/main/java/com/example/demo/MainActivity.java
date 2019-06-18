package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // initializing the features we have on the page
    private TextView countdownText;
    private Button countdownButton;

    // setting the timer, giving it a starting point
    private CountDownTimer countDownTimer;
    private long timeLeftInMilliseconds = 600000; // 600000 = 10 mins
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
