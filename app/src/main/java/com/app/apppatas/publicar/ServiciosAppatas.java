package com.app.apppatas.publicar;

import com.app.apppatas.publicar.modelo.Mascota;
import com.app.apppatas.publicar.modelo.Publicacion;

import java.util.Date;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ServiciosAppatas {

    @GET("/appatas/publicacion_list/")
    Call<List<Publicacion>> listapublicacion();

    @GET ("/appatas/mascotas/{usuario}/")
    Call<List<Mascota>>listar_mascocas_usuario(@Path("usuario") int usuario);

    @POST("/appatas/publicacion/")
    @FormUrlEncoded
    Call<Publicacion>registrar_publicacion(@Field("recompensa")Double recompensa,
                                @Field("fecha_perdida")String fecha_perdida,
                                @Field("mascota")int mascota,
                                @Field("latitud_perdida")Double latitud_perdida,
                                @Field("longitud_perdida")Double longitud_perdida);
    @POST ("publicacion/{pk}/")
    @FormUrlEncoded
    Call<Publicacion>actualizar_publicacion(@Path("usuario") int usuario);

}
