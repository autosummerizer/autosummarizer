package com.example.summaryapp;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EditText extends AppCompatActivity {
    private static String finalEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        finalEdit = "";
        FloatingActionButton summarize = findViewById(R.id.summarize);
        summarize.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent openEditText = new Intent(EditText.this, summary.class);
                startActivity(openEditText);
                TextView editText = findViewById(R.id.editText);
                finalEdit = editText.getText().toString();
            }
        });
    }
    public static String getFinalEdit() {
        return finalEdit;
    }
}
