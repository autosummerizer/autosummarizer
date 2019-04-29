package com.example.summaryapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button camera1 = findViewById(R.id.Camera);
        camera1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent openCamera = new Intent(MainActivity.this, CameraActivity.class);
                startActivity(openCamera);
                // Code here executes on main thread after user presses button
            }
        });
    }
}
