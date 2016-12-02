package com.example.playstationmaster.profilemaker;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.playstationmaster.profilemaker.variable.SetAge;
import static com.example.playstationmaster.profilemaker.variable.SetEmail;
import static com.example.playstationmaster.profilemaker.variable.SetName;
import static com.example.playstationmaster.profilemaker.variable.gender;
import static com.example.playstationmaster.profilemaker.variable.photoNumber;

public class FinishedEditing extends AppCompatActivity {

    TextView SignName;
    TextView SignAge;
    TextView SignGender;
    TextView SignEmail;
    ImageView ProfilePhotoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finished_editing);

        SignName=(TextView)findViewById(R.id.DisplayName);
        SignAge=(TextView)findViewById(R.id.DisplayAge);
        SignGender=(TextView)findViewById(R.id.DisplayGender);
        SignEmail=(TextView)findViewById(R.id.DisplayEmailAddress);
        ProfilePhotoView=(ImageView)findViewById(R.id.mainPhoto);

        SignName.setText(SetName);
        SignAge.setText(SetAge);
        SignEmail.setText(SetEmail);
        switch (gender) {
            case 0:SignGender.setText("Male");break;
            case 1:SignGender.setText("Female");break;
            case 2:SignGender.setText("Sexlessness");break;
            default:SignGender.setText("IDK");break;
        }
        switch (photoNumber) {
            case 1:ProfilePhotoView.setImageResource(R.drawable.velo_icon_200x200);break;
            case 2:ProfilePhotoView.setImageResource(R.drawable.lanet_icon_200x200);break;
            case 3:ProfilePhotoView.setImageResource(R.drawable.together_icon_200x200);break;
            //case 4:break;
        }
    }
}