package com.postmaninteractive.adv_android_labs.Lab3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.postmaninteractive.adv_android_labs.R;

public class Lab3_4 extends AppCompatActivity {
    private static final String TAG = "Lab3_4";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_4);

        final EditText editText = (EditText) findViewById(R.id.editText);
        Button startTimerButton = (Button) findViewById(R.id.startTimerButton);
        startTimerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String timer = editText.getText().toString();
                Log.d(TAG, "onClick: " + " " + timer);
                Intent intent = new Intent(getApplicationContext(), TimerCountdownActivity.class);
                intent.putExtra("timer", Integer.parseInt(timer));
                Log.d(TAG, "onClick: here");
                startActivity(intent);
            }
        });
    }
}
