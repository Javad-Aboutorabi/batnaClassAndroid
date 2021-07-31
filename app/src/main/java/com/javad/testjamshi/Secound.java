package com.javad.testjamshi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Secound extends AppCompatActivity {
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_secound);
        ConstraintLayout constraintLayout=findViewById(R.id.my_layout);
        text=findViewById(R.id.text1);
        Typeface type= Typeface.createFromAsset(getAssets(),"fonts/Shekasteh.ttf");
        text.setTypeface(type);
        Button button3 = findViewById(R.id.BackButton);
        EditText editText=findViewById(R.id.editText);
        button3.setOnClickListener(v -> {
            button3.setText(editText.getText());
            constraintLayout.setBackgroundColor(Color.argb(200,201,11,11));

        });
        button3.setOnLongClickListener(v -> {
            Toast.makeText(this, "finish", Toast.LENGTH_SHORT).show();
            this.finish();
            return false;
        });


    }

    @Override
    protected void onPause() {
        super.onPause();
        this.finish();
    }

    @Override
    public void onBackPressed() {

    }
}