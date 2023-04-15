package com.example.ex71;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class credit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit);

        Intent intent = getIntent();
        String result = intent.getDoubleExtra("result", 0) + "";
        TextView tv = findViewById(R.id.Cresult);
        tv.setText(result);
    }

    public void back(View view) {
        finish();
    }
}