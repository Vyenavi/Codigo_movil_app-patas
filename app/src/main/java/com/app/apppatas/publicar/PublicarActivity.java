package com.app.apppatas.publicar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import com.app.apppatas.R;
import com.app.apppatas.publicar.modelo.Publicacion;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PublicarActivity extends AppCompatActivity {
    String url="http://proyectosmovil.pythonanywhere.com";

    public CheckBox chk_recompensa;
    public EditText txt_monto_recompe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publicar);
        chk_recompensa=findViewById(R.id.chk_recompensa);
        txt_monto_recompe=findViewById(R.id.txt_recompensa);
        if ( chk_recompensa.isChecked ()) {
            chk_recompensa.setChecked(false);
            txt_monto_recompe.setVisibility(View.VISIBLE);
        }else {
            txt_monto_recompe.setVisibility(View.GONE);
        }

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ServiciosAppatas serviciosappatas = retrofit.create(ServiciosAppatas.class);
        Call<List<Publicacion>> call=serviciosappatas.listapublicacion();
        call.enqueue(new Callback<List<Publicacion>>() {
            @Override
            public void onResponse(Call<List<Publicacion>> call, Response<List<Publicacion>> response) {
                Log.e("Codigo ",response.code()+"");
                switch (response.code()){
                    case 200:
                        Publicacion p = (Publicacion) response.body();
                        Log.d("cancha", String.valueOf(p.getRecompensa()));
                        break;
                }
            }

            @Override
            public void onFailure(Call<List<Publicacion>> call, Throwable t) {
                Log.e("Error Appatas",t.getMessage());
            }
        });



    }


}
