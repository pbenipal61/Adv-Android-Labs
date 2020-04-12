package com.postmaninteractive.adv_android_labs.Lab3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.postmaninteractive.adv_android_labs.R;

import java.util.Locale;

public class Lab3_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_2);

        Button openMapButton = (Button) findViewById(R.id.openMapButton);
        openMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uri = String.format(Locale.ENGLISH, "geo:%f,%f", 64.999567, 25.511465);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);
            }
        });

        Button callMeButton = (Button) findViewById(R.id.callMeButton);
        callMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri number = Uri.parse("tel: +358 20 611 0200");
                Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                startActivity(callIntent);
            }
        });



        Button goToPageButton = (Button) findViewById(R.id.goToPageButton);
        goToPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText uriToOpenET = (EditText) findViewById(R.id.uriToOpenET);
                Uri typedUri =  Uri.parse(uriToOpenET.getText().toString());
                Intent openPageIntent = new Intent(Intent.ACTION_VIEW, typedUri);
                startActivity(openPageIntent);
            }
        });


    }
}
