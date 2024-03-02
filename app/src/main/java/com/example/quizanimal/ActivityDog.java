package com.example.quizanimal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityDog extends AppCompatActivity {

    private Button buttonProximo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dog);

        buttonProximo = findViewById(R.id.buttonProximo);
        buttonProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ActivityDog.this, ActivityCat.class);
                startActivity(intent);
            }
        });
    }
}