package com.postmaninteractive.adv_android_labs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.widget.Button;
import android.widget.LinearLayout;

public class Lab2_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout mainLayout = new LinearLayout(this);
        LinearLayout mainButtonsLayout = new LinearLayout(this);
        LinearLayout.LayoutParams mainButtonsLayoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        mainButtonsLayout.setLayoutParams(mainButtonsLayoutParams);
        Button addButton = new Button(this);
        addButton.setText("Add");
        mainButtonsLayout.addView(addButton);
        Button editButton = new Button(this);
        editButton.setText("Edit");
        mainButtonsLayout.addView(editButton);
        Button removeButton = new Button(this);
        removeButton.setText("Remove");
        mainButtonsLayout.addView(removeButton);

        mainLayout.addView(mainButtonsLayout);
    }
}
