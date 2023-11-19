package com.miguel.getor_finanzas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class items_consejos extends AppCompatActivity {

    EditText titulo1, consejo1;
    Button publicarbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_consejos);

        titulo1=(EditText)findViewById(R.id.titulo1);
        consejo1=(EditText)findViewById(R.id.consejo1);
        publicarbtn=findViewById(R.id.publicar);

        final db dbObject = new db(getApplicationContext());

        publicarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbObject.AgregarConsejos(titulo1.getText().toString(), consejo1.getText().toString());
                Toast.makeText(getApplicationContext(), "LOS DATOS SE AGREGARON CON EXITO ", Toast.LENGTH_LONG).show();
            }
        });

    }
}