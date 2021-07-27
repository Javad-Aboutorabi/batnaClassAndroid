package com.javad.testjamshi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Secound extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secound);
        View button3 = findViewById(R.id.BackButton);
        button3.setOnClickListener(v -> {
            this.finish();
        });
    }

    @Override
    public void onBackPressed() {

    }
}