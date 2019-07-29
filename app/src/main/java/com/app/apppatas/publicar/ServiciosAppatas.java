package com.app.apppatas.publicar;

import com.app.apppatas.publicar.modelo.Publicacion;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ServiciosAppatas {

    @GET("/appatas/publicacion_list/")
    Call<List<Publicacion>> listapublicacion();
}
