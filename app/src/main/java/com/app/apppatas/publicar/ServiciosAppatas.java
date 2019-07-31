package com.app.apppatas.publicar;

import com.app.apppatas.publicar.modelo.Mascota;
import com.app.apppatas.publicar.modelo.Publicacion;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ServiciosAppatas {

    @GET("/appatas/publicacion_list/")
    Call<List<Publicacion>> listapublicacion();

    @GET ("/appatas/mascotas/{usuario}/")
    Call<List<Mascota>>listar_mascocas_usuario(@Path("usuario") int usuario);
}
