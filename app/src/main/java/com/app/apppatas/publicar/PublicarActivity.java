package com.app.apppatas.publicar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import com.app.apppatas.R;
import com.app.apppatas.home.HomeActivity;
import com.app.apppatas.publicar.modelo.Mascota;
import com.app.apppatas.publicar.modelo.Publicacion;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.LinkedList;
import java.util.List;

import androidx.appcompat.widget.Toolbar;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PublicarActivity extends AppCompatActivity {
    String url="http://proyectosmovil.pythonanywhere.com";
    List<Publicacion> publicaciones;
    ImageView imagen_mapa;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publicar);
        imagen_mapa.findViewById(R.id.image_mapa);

        imagen_mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        Listar_mascota_usuario();
        //Crear_publicacion();
        Actualizar_publicacion();




    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_publicacion,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Toast.makeText(this,item.getTitle(),Toast.LENGTH_LONG).show();
        switch (item.getItemId()) {
            case R.id.menu_publicacion_eliminar:

                //agregar_nuevo_alumno();
                return true;
            case R.id.menu_publicacion_cancelar:
                Intent intentEditPerfil = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intentEditPerfil);
                //eliminar_todos();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    private void Listar_mascota_usuario(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ServiciosAppatas serviciosappatas = retrofit.create(ServiciosAppatas.class);
        Call<List<Mascota>> call=serviciosappatas.listar_mascocas_usuario(4);
        call.enqueue(new Callback<List<Mascota>>() {
            @Override
            public void onResponse(Call<List<Mascota>> call, Response<List<Mascota>> response) {
                Log.e("Codigo ",response.code()+"");
                switch (response.code()){
                    case 200:
                        Log.e("msj",response.body().toString());
                        List<Mascota> publicaciones = response.body();
                        List<String> perros = new LinkedList<>();
                        for (Mascota p : publicaciones) {
                            Log.e("app", p.getNombre() + "");
                            perros.add(p.getNombre());
                        }
                        Spinner spinner=findViewById(R.id.spinner_escoger_mascota);
                        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(),R.layout.item_spinner_escoger_mascota,perros);
                        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                        spinner.setAdapter(adapter);
                        break;
                }
            }
            @Override
            public void onFailure(Call<List<Mascota>> call, Throwable t) {
                Log.e("Error Appatas",t.getMessage());
            }
        });

    }
    private void Crear_publicacion(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ServiciosAppatas serviciosappatas = retrofit.create(ServiciosAppatas.class);

        Call<Publicacion>registrar_publicacion=serviciosappatas.registrar_publicacion(459.36,"2019-05-09",1,
                -16.4055966,-71.5072053);
        registrar_publicacion.enqueue(new Callback<Publicacion>() {
            @Override
            public void onResponse(Call<Publicacion> call, Response<Publicacion> response) {
                switch (response.code()){
                    case 200:
                        Publicacion p=response.body();
                        Log.d("publicar",""+p.getRecompensa());
                        break;
                }
            }

            @Override
            public void onFailure(Call<Publicacion> call, Throwable t) {
                Log.e("Error publicacion",t.getMessage());
            }
        });
    }

    private void Actualizar_publicacion(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ServiciosAppatas serviciosappatas = retrofit.create(ServiciosAppatas.class);

        Call<Publicacion>actualizar_publicacion=serviciosappatas.actualizar_publicacion(4,3.20,"2019-04-24",1,
                -16.4055966,-71.5072053);
        actualizar_publicacion.enqueue(new Callback<Publicacion>() {
            @Override
            public void onResponse(Call<Publicacion> call, Response<Publicacion> response) {
                switch (response.code()){
                    case 200:
                        Publicacion p=response.body();
                        Log.d("actualizar",""+p.getRecompensa());
                        break;
                }
            }
            @Override
            public void onFailure(Call<Publicacion> call, Throwable t) {
                Log.e("error actualizar",t.getMessage());
            }
        });
    }

    private void Listar_publicacion(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ServiciosAppatas serviciosappatas = retrofit.create(ServiciosAppatas.class);
        Call<List<Mascota>> call=serviciosappatas.listar_mascocas_usuario(4);
        call.enqueue(new Callback<List<Mascota>>() {
            @Override
            public void onResponse(Call<List<Mascota>> call, Response<List<Mascota>> response) {
                Log.e("Codigo ",response.code()+"");
                switch (response.code()){
                    case 200:
                        Log.e("msj",response.body().toString());
                        List<Mascota> publicaciones = response.body();
                        List<String> perros = new LinkedList<>();
                        for (Mascota p : publicaciones) {
                            Log.e("app", p.getNombre() + "");
                            perros.add(p.getNombre());
                        }
                        Spinner spinner=findViewById(R.id.spinner_escoger_mascota);
                        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getApplicationContext(),R.layout.item_spinner_escoger_mascota,perros);
                        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                        spinner.setAdapter(adapter);
                        break;
                }
            }
            @Override
            public void onFailure(Call<List<Mascota>> call, Throwable t) {
                Log.e("Error Appatas",t.getMessage());
            }
        });
    }
}
