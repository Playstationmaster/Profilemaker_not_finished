package com.example.playstationmaster.profilemaker;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.playstationmaster.profilemaker.variable.photoNumber;
import static com.example.playstationmaster.profilemaker.variable.randTextNum;
import static com.example.playstationmaster.profilemaker.variable.textNum;
import static com.example.playstationmaster.profilemaker.variable.toastString;

public class MainActivity extends AppCompatActivity {

    TextView introTextTitle;
    TextView introTextSub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);

        startActivity(new Intent(this, Splash.class));
        photoNumber = 3;
        textNum = 1;

        introTextTitle = (TextView) findViewById(R.id.textTitle);
        introTextSub = (TextView) findViewById(R.id.textMain);

        textSwitch();
    }

    public void click_next(View V) {
        if (textNum < 5) {
            textNum += 1;
            textSwitch();
        }
        else {
            randTextNum = (byte)(Math.random()*7);
            Toast.makeText(getApplicationContext(),toastString[randTextNum], Toast.LENGTH_SHORT).show();
        }
    }

    public void click_start(View V) {
        Intent intent = new Intent(getApplicationContext(), Profile_edit.class);
        startActivity(intent);
    }

    public void textSwitch() {
        switch (textNum) {
            case 1 :
                introTextTitle.setText("Hello World!");
                introTextSub.setText("You can make your profile with this application. \n\nClick 'NEXT' to see more explain.");
                break;
            case 2 :
                introTextTitle.setText("Photo is important!");
                introTextSub.setText("You can change photo by clicking photo. Choose the photo you like. \n\nClick 'NEXT' to see more...");
                break;
            case 3 :
                introTextTitle.setText("What's Your Name?");
                introTextSub.setText("After selecting photo, you should input your name, age, and gender. Please let the application notice them. \n" +
                        "\n" +
                        "Click 'NEXT' to see more...");
                break;
            case 4 :
                introTextTitle.setText("Almost finished!");
                introTextSub.setText("");
                break;
            case 5 :
                introTextTitle.setText("Good To Go!");
                introTextSub.setText("This is the last page of guide. Now let's make a  profile! \nPress 'Good to go!'button to start making profile.\n" +
                        "\n" +
                        "Do not click the 'Next' button...");
                break;
        }
    }
}