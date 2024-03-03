package com.example.quizanimal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityResultado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        ImageView imageViewDog = findViewById(R.id.imageViewDog);
        ImageView imageViewCat = findViewById(R.id.imageViewCat);

        Intent intent = getIntent();
        intent.getExtras();

        boolean respostaDog = intent.getBooleanExtra("resultadoCachorro", false);
        boolean respostaCat = intent.getBooleanExtra("resultadoGato", false);

        if (respostaDog) {
            imageViewDog.setImageResource(R.drawable.dog_acerto);
        } else {
            imageViewDog.setImageResource(R.drawable.dog_triste);
        }

        if (respostaCat) {
            imageViewCat.setImageResource(R.drawable.cat_acerto);
        } else {
            imageViewCat.setImageResource(R.drawable.cat_triste);
        }

    }
}
