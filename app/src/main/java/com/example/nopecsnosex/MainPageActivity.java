package com.example.nopecsnosex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainPageActivity extends AppCompatActivity {

    private Button buttonAchievement;
    private Button buttonBMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        buttonAchievement = (Button) findViewById(R.id.AchievementsButton);
        buttonAchievement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAchievement();
            }
        });


        buttonBMI = (Button) findViewById(R.id.ComputerBMI);

        buttonBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBMI();
            }
        });
    }

    public void openAchievement() {
        Intent intent = new Intent (this, AchievementsActivity.class);
        startActivity(intent);
    }
    public void openBMI() {
        Intent intent = new Intent(this, BMIActivity.class);
        startActivity(intent);
    }


}
