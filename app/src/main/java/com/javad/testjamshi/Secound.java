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
        ConstraintLayout constraintLayout = findViewById(R.id.my_layout);
        text = findViewById(R.id.text1);
        Typeface type = Typeface.createFromAsset(getAssets(), "fonts/Shekasteh.ttf");
        text.setTypeface(type);
        Button button3 = findViewById(R.id.BackButton);
        EditText editText = findViewById(R.id.editText);


        EditText alpha = findViewById(R.id.alpha);
        EditText red = findViewById(R.id.red);
        EditText green = findViewById(R.id.green);
        EditText blue = findViewById(R.id.blue);

        button3.setOnClickListener(v -> {
            if(isEmpty(alpha)) {
                alpha.setText("250");
            }
            if(isEmpty(red)) {
                red.setText("80");
            }
            if(isEmpty(green)) {
                green.setText("200");
            }
            if(isEmpty(blue)) {
                blue.setText("150");
            }

            constraintLayout.setBackgroundColor(Color.argb(
                    Integer.parseInt(alpha.getText().toString()),
                    Integer.parseInt(red.getText().toString()),
                    Integer.parseInt(green.getText().toString()),
                    Integer.parseInt(blue.getText().toString())
            ));
            button3.setText(editText.getText());

        });
        button3.setOnLongClickListener(v -> {
            Toast.makeText(this, "finish", Toast.LENGTH_SHORT).show();
            this.finish();
            return false;
        });


    }
    private boolean isEmpty(EditText etText) {
        if (etText.getText().toString().trim().length() > 0)
            return false;

        return true;
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