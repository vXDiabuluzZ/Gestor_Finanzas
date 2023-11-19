package com.miguel.getor_finanzas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Inicio, consejosbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Inicio=findViewById(R.id.entrar);
        consejosbtn=findViewById(R.id.consejos);

        Inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent cambio_inicio=new Intent(MainActivity.this, inicio.class);
                startActivity(cambio_inicio);
            }
        });

        consejosbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cambio_consejos=new Intent(MainActivity.this, items_consejos.class);
                startActivity(cambio_consejos);
            }
        });
    }
}