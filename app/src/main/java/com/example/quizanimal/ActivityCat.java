package com.example.quizanimal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityCat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat);

        Button buttonProximo = findViewById(R.id.buttonPerguntas);
        buttonProximo.setOnClickListener(v -> {
            Intent intent = new Intent(ActivityCat.this, ActivityPerguntas.class);
            intent.putExtra("questoeCachorro", GeraQuestoes.sortearPerguntaRespostaCachorro());
            intent.putExtra("questoeGato", GeraQuestoes.sortearPerguntaRespostaGato());
            startActivity(intent);
        });
    }
}
