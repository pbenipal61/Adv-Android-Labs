package com.postmaninteractive.adv_android_labs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Lab2_4 extends AppCompatActivity {

    private String language = "English";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab2_4);

        final TextView textView = (TextView) findViewById(R.id.textView);
        final EditText editText = (EditText) findViewById(R.id.editText);
        TextWatcher watcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String str = "";
                switch(language){
                    case "English":
                        str = "Hi";
                        break;
                    case "Swedish":
                        str = "Hejjsan";
                        break;
                    case "Finnish":
                        str= "Terve";
                        break;
                    case "Spanish":
                        str = "Hola";
                        break;
                    default:
                        str = "hi";
                        break;
                }

                textView.setText(str + " " + charSequence.toString());

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
        editText.addTextChangedListener(watcher);

        Button englishButton = (Button) findViewById(R.id.english);
        englishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                language = "English";
            }
        });

        Button swedishButton = (Button) findViewById(R.id.swedish);
        swedishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                language = "Swedish";
            }
        });

        Button finnishButton = (Button) findViewById(R.id.finnish);
        finnishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                language = "Finnish";
            }
        });

        Button spanishButton = (Button) findViewById(R.id.spanish);
        spanishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                language = "Spanish";
            }
        });
    }
}
