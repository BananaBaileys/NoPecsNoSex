package com.example.nopecsnosex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMIActivity extends AppCompatActivity {

    private Button buttonBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        buttonBack = (Button) findViewById(R.id.backMainPage);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainPage();
            }
        });
    }

    public void openMainPage() {
        Intent intent = new Intent (this, MainPageActivity.class);
        startActivity(intent);
    }

    public void computeBMI(View v)
    {
        EditText weightView = (EditText) findViewById(R.id.weightBox);
        String weight = weightView.getText().toString();
        EditText heightView = (EditText) findViewById(R.id.heightBox);
        String height = heightView.getText().toString();

        BMIModel myModel = new BMIModel(weight, height);
        String myBMI = myModel.getBMI();

        ((TextView) findViewById(R.id.answer)).setText("BMI: " + myBMI);

    }


}
