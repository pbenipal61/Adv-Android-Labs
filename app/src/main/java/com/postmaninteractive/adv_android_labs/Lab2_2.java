package com.postmaninteractive.adv_android_labs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.postmaninteractive.adv_android_labs.Models.Countries;

import java.util.ArrayList;

public class Lab2_2 extends AppCompatActivity {

    private final Countries countries = new Countries();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        countries.addCountry("Finland");
        countries.addCountry("Sweden");
        countries.addCountry("Australia");
        countries.addCountry("Norway");
        countries.addCountry("Switzerland");
        countries.addCountry("Somalia");
        countries.addCountry("Kenya");
        countries.addCountry("Brazil");
        countries.addCountry("Belgium");
        countries.addCountry("Germany");

        ArrayList<String> listOfCountries = countries.getCountries();

        //     Creating layouts programmatically
        LinearLayout verticalLayout = new LinearLayout(this);
        LinearLayout horizontalLayout = new LinearLayout(this);
//     Setting their orientations
        verticalLayout.setOrientation(LinearLayout.VERTICAL);
        horizontalLayout.setOrientation(LinearLayout.HORIZONTAL);
//     Creating buttons programmatically
        Button addBtn = new Button(this);
        Button editBtn = new Button(this);
        Button removeBtn = new Button(this);
//     Setting text to the buttons
        addBtn.setText("Add");
        editBtn.setText("Edit");
        removeBtn.setText("Remove");
//     Creating EditText programmatically
        final EditText editText = new EditText(this);

//     Creating ListView programmatically
        ListView listView = new ListView(this);
//     Creating Array Adapter
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                listOfCountries
        );

//     Creating onClickListeners
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  editTextValue = editText.getText().toString();
                Log.d("onClick", "" + editTextValue);
                countries.addCountry(editTextValue);
                arrayAdapter.notifyDataSetChanged();
                editText.setText("");
            }
        });

        removeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  editTextValue = editText.getText().toString();
                Log.d("onClick", "" + editTextValue);
                countries.popCountries();
                arrayAdapter.notifyDataSetChanged();
            }
        });

//     Populating listView with data
        listView.setAdapter(arrayAdapter);
//     Adding UI elements to the layouts
        verticalLayout.addView(horizontalLayout);
        horizontalLayout.addView(addBtn);
        horizontalLayout.addView(editBtn);
        horizontalLayout.addView(removeBtn);
        verticalLayout.addView(editText);
        verticalLayout.addView(listView);

        setContentView(verticalLayout);
        }
    }

