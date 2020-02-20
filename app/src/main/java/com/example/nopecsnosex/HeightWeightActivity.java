package com.example.nopecsnosex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HeightWeightActivity extends AppCompatActivity {

    private Button buttonback;
    private Button buttonnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_height_weight);

        buttonnext = (Button) findViewById(R.id.computeBMI);
        buttonnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFinalNext();
            }
        });

        buttonback = (Button) findViewById(R.id.backNameAge);
                    // need to cast              //button id
        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNameAge();
            }
        });

    }

    public void openFinalNext(){
        Intent intent = new Intent(this, FinalNextActivity.class);
        startActivity(intent);
    }

    public void openNameAge() {
        Intent intent = new Intent(this, NameAgeActivity.class);
        startActivity(intent);
    }


}
