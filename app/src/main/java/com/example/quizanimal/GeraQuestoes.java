package com.example.quizanimal;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GeraQuestoes {
    public static Map<String,Boolean> perguntasCachorro=new HashMap<>();
    public static Map<String,Boolean> perguntasGato=new HashMap<>();

    static {
        perguntasGato.put("O país de origem da raça de gatos Munchkin é a China.", false);
        perguntasGato.put("O gato Munchkin pode viver até 15 anos.", true);
        perguntasGato.put("A raça de gato Munchkin pode medir a 50 cm de altura.", false);
        perguntasGato.put("O peso de uma gato Munchkin varia entre 2,5 a 4 kg.", true);
        perguntasCachorro.put("O país de origem da raça cachorros Chihuahua é o México.", true);
        perguntasCachorro.put("O cachorro da raça Chihuahua pode viver até 30 anos.", false);
        perguntasCachorro.put("A raça de cachorro Chihuahua pode medir a 23 cm de altura.", true);
        perguntasCachorro.put("O peso de um cachorro da raça Chihuahua pode variar entre 1,5 a 3 kg.", true);
    }

    public static Map.Entry<String, Boolean> sortearPerguntaRespostaCachorro() {
        //Como o map não tem um indice numerico, foi convertido o valor no map em um arrey de string
        Object[] arrayString = perguntasCachorro.entrySet().toArray();
        Random random = new Random();
        // aqui é feito o sorteio do indice do arreyString
        int indiceSorteado = random.nextInt(arrayString.length);
        // aqui é feita a busca da pergunta sorteada no map de pergunta
        Map.Entry<String, Boolean> perguntaERespostaSorteada = (Map.Entry<String, Boolean>) arrayString[indiceSorteado];
        // aqui é retornado a um Map com a pergunta sorteada
        return perguntaERespostaSorteada;
    }

    public static Map.Entry<String, Boolean> sortearPerguntaRespostaGato() {
        //Como o map não tem um indice numerico, foi convertido o valor no map em um arrey de string
        Object[] arrayString = perguntasGato.entrySet().toArray();
        Random random = new Random();
        // aqui é feito o sorteio do indice do arreyString
        int indiceSorteado = random.nextInt(arrayString.length);
        // aqui é feita a busca da pergunta sorteada no map de pergunta
        Map.Entry<String, Boolean> perguntaERespostaSorteada = (Map.Entry<String, Boolean>) arrayString[indiceSorteado];
        // aqui é retornado a um Map com a pergunta sorteada
        return perguntaERespostaSorteada;
    }


}
