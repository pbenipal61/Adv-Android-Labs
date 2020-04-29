package com.postmaninteractive.adv_android_labs.Lab3;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.postmaninteractive.adv_android_labs.R;

public class Lab31 extends AppCompatActivity {

    private TextView tv;
    private RelativeLayout rl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab31);

        rl = (RelativeLayout) findViewById(R.id.mainView);
        tv = (TextView) findViewById(R.id.tv);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_lab3_1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        switch(item.getItemId()){
            case R.id.red:
                rl.setBackgroundColor(getResources().getColor(R.color.red));
                tv.setText("Red");
                break;

            case R.id.yellow:
                rl.setBackgroundColor(getResources().getColor(R.color.yellow));
                tv.setText("Yellow");
                break;

            case R.id.blue:
                rl.setBackgroundColor(getResources().getColor(R.color.blue));
                tv.setText("Blue");
                break;

            case R.id.green:
                rl.setBackgroundColor(getResources().getColor(R.color.green));
                tv.setText("Green");
                break;
        }

        return true;
    }
}
