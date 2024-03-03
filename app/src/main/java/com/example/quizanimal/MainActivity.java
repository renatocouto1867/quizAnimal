package com.example.quizanimal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageViewPrincipal = findViewById(R.id.imageViewPrincipal);

        imageViewPrincipal.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ActivityDog.class);
            startActivity(intent);
        });

    }
}