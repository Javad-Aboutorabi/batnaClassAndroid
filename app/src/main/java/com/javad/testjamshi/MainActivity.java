package com.javad.testjamshi;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("WrongViewCast")
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
            button.setBackgroundColor(Color.argb(255,random.nextInt(255),random.nextInt(255),random.nextInt(255)));
            button.setTextColor(Color.argb(255,random.nextInt(255-210)+210,random.nextInt(255-210)+210,random.nextInt(255-210)+210));
            button.setScaleX((float) (random.nextFloat()+0.5));
            button.setScaleY((float) (random.nextFloat()+0.5));
        });
        Button button2;
        button2 = findViewById(R.id.jamshidi);
        button2.setBackgroundColor(Color.argb(200,85,120,250));

        button2.setOnClickListener(v -> {
            Intent intent=new Intent(this,Secound.class);
            startActivity(intent);
        });

    }
}