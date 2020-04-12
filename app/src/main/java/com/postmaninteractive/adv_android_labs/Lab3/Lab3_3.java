package com.postmaninteractive.adv_android_labs.Lab3;

import android.annotation.SuppressLint;
import android.arch.lifecycle.MutableLiveData;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.postmaninteractive.adv_android_labs.R;

public class Lab3_3 extends AppCompatActivity {

    private MutableLiveData<String> animals = new MutableLiveData<>();
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_3);

        animals.setValue("mammals");
        ImageView imgOne = findViewById(R.id.imageView);
        ImageView imgTwo = findViewById(R.id.imageView2);
        ImageView imgThree = findViewById(R.id.imageView3);
        ImageView imgFour = findViewById(R.id.imageView4);
        imgOne.setImageResource(R.raw.bear);
        imgOne.setTag("bear");
        imgTwo.setImageResource(R.raw.elephant);
        imgTwo.setTag("elephant");
        imgThree.setImageResource(R.raw.lamb);
        imgThree.setTag("lamb");
        imgFour.setImageResource(R.raw.wolf);
        imgFour.setTag("wolf");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_lab_3_3, menu);
        return true;
    }

    @SuppressLint("ResourceType")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if ( item.getItemId() == R.id.birds ) {
            animals.setValue("birds");
            ImageView imgOne = findViewById(R.id.imageView);
            ImageView imgTwo = findViewById(R.id.imageView2);
            ImageView imgThree = findViewById(R.id.imageView3);
            ImageView imgFour = findViewById(R.id.imageView4);
            imgOne.setImageResource(R.raw.huuhkaja);
            imgOne.setTag("huuhkaja");
            imgTwo.setImageResource(R.raw.punatulkku);
            imgTwo.setTag("punatulkku");
            imgThree.setImageResource(R.raw.peippo);
            imgThree.setTag("peippo");
            imgFour.setImageResource(R.raw.peukaloinen);
            imgFour.setTag("peukaloinen");
        }
        if (item.getItemId() == R.id.mammals) {
            animals.setValue("mammals");
            ImageView imgOne = findViewById(R.id.imageView);
            ImageView imgTwo = findViewById(R.id.imageView2);
            ImageView imgThree = findViewById(R.id.imageView3);
            ImageView imgFour = findViewById(R.id.imageView4);
            imgOne.setImageResource(R.raw.bear);
            imgOne.setTag("bear");
            imgTwo.setImageResource(R.raw.elephant);
            imgTwo.setTag("elephant");
            imgThree.setImageResource(R.raw.lamb);
            imgThree.setTag("lamb");
            imgFour.setImageResource(R.raw.wolf);
            imgFour.setTag("wolf");
        }
        return true;
    }

    public void imageClick(View img) {
        MediaPlayer mediaPlayer;
        if (animals.getValue() == "mammals") {
            if (img.getTag() == "bear" ) {
                mediaPlayer = MediaPlayer.create(this, R.raw.bear_wav);
                mediaPlayer.start();
            }
            if (img.getTag() == "lamb") {
                mediaPlayer = MediaPlayer.create(this, R.raw.lamb_wav);
                mediaPlayer.start();
            }
            if (img.getTag() == "wolf") {
                mediaPlayer = MediaPlayer.create(this, R.raw.wolf_wav);
                mediaPlayer.start();
            }
            if ( img.getTag() == "elephant") {
                mediaPlayer = MediaPlayer.create(this, R.raw.elephant_wav);
                mediaPlayer.start();
            }
        }
        if (animals.getValue() == "birds") {
            if (img.getTag() == "huuhkaja" ) {
                mediaPlayer = MediaPlayer.create(this, R.raw.huuhkaja_norther_eagle_owl_mp3);
                mediaPlayer.start();
            }
            if (img.getTag() == "punatulkku") {
                mediaPlayer = MediaPlayer.create(this, R.raw.punatulkku_northern_bullfinch_mp3);
                mediaPlayer.start();
            }
            if (img.getTag() == "peippo") {
                mediaPlayer = MediaPlayer.create(this, R.raw.peippo_chaffinch_mp3);
                mediaPlayer.start();
            }
            if ( img.getTag() == "peukaloinen") {
                mediaPlayer = MediaPlayer.create(this, R.raw.peukaloinen_wren_mp3);
                mediaPlayer.start();
            }
        }
    }



}
