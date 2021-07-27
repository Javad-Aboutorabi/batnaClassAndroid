package com.javad.testjamshi;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList name = new ArrayList<>();
        name.add("javad");
        name.add("mehdi");
        name.add("amirhossein");
        name.add("masih");
        name.add("alireza");
        name.add("dariush");
        name.add("farzad");
        name.add("mojtaba");

        Button button;
        button = findViewById(R.id.buttonPanel);
        button.setOnClickListener(v -> {
            Random random = new Random();
            int a = random.nextInt(name.size());
            button.setText(name.get(a).toString());
        });
    }
}