package com.javad.testjamshi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button;
        button=findViewById(R.id.buttonPanel);
        button.setOnClickListener(v -> {
            Toast.makeText(this, "jamshidi", Toast.LENGTH_SHORT).show();
            button.setText("jamishidi");
        });
    }
}