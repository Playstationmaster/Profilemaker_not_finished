package com.example.playstationmaster.profilemaker;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;

import static com.example.playstationmaster.profilemaker.variable.SetAge;
import static com.example.playstationmaster.profilemaker.variable.SetEmail;
import static com.example.playstationmaster.profilemaker.variable.SetName;
import static com.example.playstationmaster.profilemaker.variable.gender;
import static com.example.playstationmaster.profilemaker.variable.photoNumber;

public class Profile_edit extends AppCompatActivity {

    ImageButton profilePhoto;
    EditText NameInput;
    EditText AgeInput;
    EditText EmailInput;
    Spinner GenderInput;
    Button FinishInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE);
        setContentView(R.layout.activity_profile_edit);
        profilePhoto = (ImageButton) findViewById(R.id.imageButton);
        NameInput = (EditText) findViewById(R.id.editName);
        AgeInput = (EditText) findViewById(R.id.editAge);
        EmailInput = (EditText) findViewById(R.id.editEmail);
        GenderInput = (Spinner)findViewById(R.id.spinner);
        FinishInput = (Button)findViewById(R.id.finishEdit);

        switch (photoNumber) {
            case 1 : profilePhoto.setImageResource(R.drawable.velo_icon_200x200); break;
            case 2 : profilePhoto.setImageResource(R.drawable.lanet_icon_200x200); break;
            case 3 : profilePhoto.setImageResource(R.drawable.together_icon_200x200); break;
        }

        profilePhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), photoSelect.class);
                startActivity(intent);
                finish();
            }
        });

        GenderInput.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                gender = position;
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                gender = 3;
            }
        });

        FinishInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SetName = NameInput.getText().toString();
                SetAge = AgeInput.getText().toString();
                SetEmail = EmailInput.getText().toString();

                Intent intent = new Intent(getApplicationContext(), FinishedEditing.class);
                startActivity(intent);
                finish();
            }
        });
    }
}