package com.app.apppatas.publicar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.app.apppatas.R;
import com.app.apppatas.publicar.modelo.Mascota;
import com.app.apppatas.publicar.modelo.Publicacion;

import java.util.LinkedList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PublicarActivity extends AppCompatActivity {
    String url="http://172.23.8.109:8000";
    List<Publicacion> publicaciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publicar);


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
