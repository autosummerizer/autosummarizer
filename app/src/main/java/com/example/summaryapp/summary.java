package com.example.summaryapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class summary extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        TextView finalSummary = findViewById(R.id.finalSummary);
        finalSummary.setText(EditText.getFinalEdit());
    }
}
