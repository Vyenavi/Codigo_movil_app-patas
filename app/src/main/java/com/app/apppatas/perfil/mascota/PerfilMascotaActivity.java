package com.app.apppatas.perfil.mascota;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.app.apppatas.R;
import com.app.apppatas.perfil.mascota.modelos.raza;

public class PerfilMascotaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_mascota);
    }

    //metodo tvRaza

    public void tvRaza (View view){
        Intent listarazas =new Intent(this, raza.class);

    }


}
