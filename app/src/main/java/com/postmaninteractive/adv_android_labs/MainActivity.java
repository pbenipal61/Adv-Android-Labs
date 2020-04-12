package com.postmaninteractive.adv_android_labs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button lab21 = (Button) findViewById(R.id.lab_2_1);
        lab21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Lab2_1.class);
                startActivity(intent);
            }
        });

        Button lab22 = (Button) findViewById(R.id.lab_2_2);
        lab22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Lab2_2.class);
                startActivity(intent);
            }
        });

        Button lab24 = (Button) findViewById(R.id.lab_2_4);
        lab22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Lab2_4.class);
                startActivity(intent);
            }
        });
    }
}
