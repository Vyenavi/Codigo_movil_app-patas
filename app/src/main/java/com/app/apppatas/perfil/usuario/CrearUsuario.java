package com.app.apppatas.perfil.usuario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.app.apppatas.R;

public class CrearUsuario extends AppCompatActivity {
    private EditText nombre, apellido,telefono,direccion,contrasenia,contrasian2;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_usuario);

        findElements();
        events();
    }

    private void findElements() {
        nombre = findViewById(R.id.Nombre);
        apellido = findViewById(R.id.Apellido);
        telefono=findViewById(R.id.Telefono);
        direccion= findViewById(R.id.direccion);
        contrasenia=findViewById(R.id.contraseña);
        contrasian2=findViewById(R.id.contraseña2);
        btnSave = findViewById(R.id.btnSave);


    }
    private void events() {

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), PerfilUsuarioActivity.class);
                startActivity(i);
            }
        });
    }
}


