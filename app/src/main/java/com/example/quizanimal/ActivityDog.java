package com.example.quizanimal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityDog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog);

        Button buttonProximo = findViewById(R.id.buttonProximo);
        buttonProximo.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityDog.this, ActivityCat.class);
            startActivity(intent);
        });
    }
}