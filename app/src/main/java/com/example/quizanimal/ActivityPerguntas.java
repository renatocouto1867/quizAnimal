package com.example.quizanimal;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityPerguntas extends AppCompatActivity {

    private Boolean respostaDog, respostaCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perguntas);

        TextView textViewQuestaoDog = findViewById(R.id.textViewQuestaoDog);
        TextView textViewQuestaoCat = findViewById(R.id.textViewQuestaoCat);
        RadioGroup radioGroupQuestaoDog = findViewById(R.id.radioGrupoQuestaoDog);
        RadioGroup radioGroupQuestaoCat = findViewById(R.id.radioGrupoQuestaoCat);
        Button resultado = findViewById(R.id.buttonResultado);

        Intent intent = getIntent();
        String questaoDog= (intent.getStringExtra("questoeCachorro"));
        String questaoCat= (intent.getStringExtra("questoeGato"));

        textViewQuestaoDog.setText(questaoDog);
        textViewQuestaoCat.setText(questaoCat);
        radioGroupQuestaoDog.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButtonDogCerto){
                    respostaDog = true;
                } else respostaDog = false;
            }
        });

        radioGroupQuestaoCat.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.radioButtonCatCerto){
                    respostaCat = true;
                } else respostaCat = false;
            }
        });

        resultado.setOnClickListener(v -> {
            Intent intentResult = new Intent(ActivityPerguntas.this, ActivityResultado.class);
            Boolean resultadoDog = GeraQuestoes.confereRespostaDog(questaoDog,respostaDog);
            Boolean resultadoCat = GeraQuestoes.confereRespostaCat(questaoCat,respostaCat);
            intentResult.putExtra("resultadoCachorro", resultadoDog);
            intentResult.putExtra("resultadoGato", resultadoCat);
            startActivity(intentResult);
        });

    }
}
