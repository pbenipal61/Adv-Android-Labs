package com.postmaninteractive.adv_android_labs.Lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lab2_1 extends AppCompatActivity {

    private int clicks = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final Button gameButton = new Button(this);
        gameButton.setText("Hello, I'm the button "+ clicks);
        gameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicks++;
                gameButton.setText("Hello, I'm the button "+ clicks);
            }
        });
        setContentView(gameButton);

    }
}
