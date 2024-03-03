package com.example.quizanimal;

import java.io.Serializable;
import java.util.*;

public class GeraQuestoes implements Serializable {
    private static final Map<String, Boolean> mapPerguntasCachorro = new HashMap<>();
    private static final Map<String, Boolean> mapPerguntasGato = new HashMap<>();

    static {
        mapPerguntasGato.put("O país de origem da raça de gatos Munchkin é a China.", false);
        mapPerguntasGato.put("O gato Munchkin pode viver até 15 anos.", true);
        mapPerguntasGato.put("A raça de gato Munchkin pode medir até 50 cm de altura.", false);
        mapPerguntasGato.put("O peso de uma gato Munchkin varia entre 2,5 a 4 kg.", true);

        mapPerguntasCachorro.put("O país de origem da raça cachorros Chihuahua é o México.", true);
        mapPerguntasCachorro.put("O cachorro da raça Chihuahua pode viver até 30 anos.", false);
        mapPerguntasCachorro.put("A raça de cachorro Chihuahua pode medir até 23 cm de altura.", true);
        mapPerguntasCachorro.put("O peso de um cachorro da raça Chihuahua pode variar entre 1,5 a 3 kg.", true);
    }

    public static String sortearPerguntaRespostaCachorro() {
        return sortearPerguntaResposta(mapPerguntasCachorro);
    }

    public static String sortearPerguntaRespostaGato() {
        return sortearPerguntaResposta(mapPerguntasGato);
    }

    private static String sortearPerguntaResposta(Map<String, Boolean> perguntas) {
        List<Map.Entry<String, Boolean>> listaPerguntas = new ArrayList<>(perguntas.entrySet());
        Random random = new Random();
        int indiceSorteado = random.nextInt(listaPerguntas.size());
        return listaPerguntas.get(indiceSorteado).getKey();
    }

    public static Boolean confereRespostaDog(String pergunta, Boolean resposta){
        for (Map.Entry<String, Boolean> entry : mapPerguntasCachorro.entrySet()) {
            String chave = entry.getKey();
            Boolean valor = entry.getValue();
            if (chave.equals(pergunta)){
                return valor == resposta;
            }
        }
        return false;
    }

    public static Boolean confereRespostaCat(String pergunta, Boolean resposta){
        for (Map.Entry<String, Boolean> entry : mapPerguntasGato.entrySet()) {
            String chave = entry.getKey();
            Boolean valor = entry.getValue();
            if (chave.equals(pergunta)){
                return valor == resposta;
            }
        }
        return false;
    }

}
