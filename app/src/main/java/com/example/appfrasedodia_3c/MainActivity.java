package com.example.appfrasedodia_3c;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View V){
        //Array com as frases
        String [] frases = {
                "'Nunca pare de sonhar' - Freddy Krueger.",
                "Existem mais aviões no fundo do mar do que submarinos no céu.",
                "Se a vida te der limões faça um suco de acerola.",
                "Michael Jackson esta vivo e vai jogar no Vasco.",
                "Beba água e evite pedra no rim.",
        };
        //sortear um numero
        int posicaoSorteada = new Random().nextInt(frases.length);
        TextView texto = (TextView) findViewById(R.id.textViewResultado);

        String fraseDoDia = frases[posicaoSorteada];
        texto.setText(fraseDoDia);
    }

}