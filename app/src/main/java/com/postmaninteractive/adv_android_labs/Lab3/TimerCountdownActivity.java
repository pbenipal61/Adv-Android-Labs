package com.postmaninteractive.adv_android_labs.Lab3;

import android.annotation.SuppressLint;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.postmaninteractive.adv_android_labs.R;

public class TimerCountdownActivity extends AppCompatActivity {

    private static final String TAG = "TimerCountdownActivity";
    private int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer_countdown);

        int preTimer = getIntent().getIntExtra("timer", 30);
        Log.d(TAG, "onCreate: "+ preTimer);

        long timerAsLong = Long.parseLong(String.valueOf(preTimer* 1000));
        final TextView textView = (TextView) findViewById(R.id.textView);

        new CountDownTimer(timerAsLong,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                textView.setText(String.valueOf(Integer.parseInt(String.valueOf(millisUntilFinished/1000))));
                counter++;
            }
            @Override
            public void onFinish() {
                textView.setText("Finished");
            }
        }.start();
    }
}
