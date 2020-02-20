package com.example.nopecsnosex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FinalNextActivity extends AppCompatActivity {

    private Button buttonNext;
    private Button buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_next);

        buttonNext = (Button) findViewById(R.id.openMainPage);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainPage();
            }
        });

        buttonBack = (Button) findViewById(R.id.backHeightWeight);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHeightWeight();
            }
        });

    }


    public void openHeightWeight() {
        Intent intent = new Intent(this, HeightWeightActivity.class);
        startActivity(intent);
    }

    public void openMainPage() {
        Intent intent = new Intent (this, MainPageActivity.class);
        startActivity(intent);
    }



}
