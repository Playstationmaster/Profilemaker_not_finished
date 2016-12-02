package com.example.playstationmaster.profilemaker;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static com.example.playstationmaster.profilemaker.variable.photoNumber;

public class photoSelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE);
        setContentView(R.layout.activity_photoselect);
    }

    public void veloClicked(View V) {
        photoNumber = 1;
        Intent intent = new Intent(getApplicationContext(), Profile_edit.class);
        startActivity(intent);
        finish();
    }
    public void lanetClicked(View V) {
        photoNumber = 2;
        Intent intent = new Intent(getApplicationContext(), Profile_edit.class);
        startActivity(intent);
        finish();
    }
    public void togetherClicked(View V) {
        photoNumber = 3;
        Intent intent = new Intent(getApplicationContext(), Profile_edit.class);
        startActivity(intent);
        finish();
    }
    /*public void addPhotoClicked(View V) {
        photoNumber = 4;

        Intent intent = new Intent(getApplicationContext(), Profile_edit.class);
        startActivity(intent);
    }*/
}