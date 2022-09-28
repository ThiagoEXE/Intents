package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnFinalizar, btnAbrirOutraTela;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Tela Principal!");

        btnAbrirOutraTela = findViewById(R.id.btn_abrir_tela);
        btnFinalizar = findViewById(R.id.btn_finalizar);

        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnAbrirOutraTela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent outraTela = new Intent(getApplicationContext(), OutraTela.class);
                startActivity(outraTela);
            }
        });
    }
}