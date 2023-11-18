package com.miguel.getor_finanzas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.miguel.getor_finanzas.db.DbHelper;

public class inicio extends AppCompatActivity {

    Button historial, registrarj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        Intent recibir_peticion=getIntent();
        registrarj = findViewById(R.id.registrar);
        historial=findViewById(R.id.resultados);

        historial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent history = new Intent(inicio.this, resultados.class);
                startActivity(history);
            }
        });

        registrarj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DbHelper dbHelper = new DbHelper(inicio.this);
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                if(db != null){
                    Toast.makeText(inicio.this, "BASE DE DATOS CREADA", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(inicio.this, "ERROR AL CREAR LA BASE DE DATOS", Toast.LENGTH_LONG).show();

                }

            }
        });
    }
}