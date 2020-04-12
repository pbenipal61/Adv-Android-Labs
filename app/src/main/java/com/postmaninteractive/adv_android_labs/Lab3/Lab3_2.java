package com.postmaninteractive.adv_android_labs.Lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.postmaninteractive.adv_android_labs.R;

public class Lab3_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_2);

        Button openMapButton = (Button) findViewById(R.id.openMapButton);
        openMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        Button callMeButton = (Button) findViewById(R.id.callMeButton);
        callMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        EditText uriToOpenET = (EditText) findViewById(R.id.uriToOpenET);

        Button goToPageButton = (Button) findViewById(R.id.goToPageButton);
        goToPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}
