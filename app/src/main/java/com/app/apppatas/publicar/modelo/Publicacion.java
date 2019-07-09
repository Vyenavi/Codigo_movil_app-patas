package com.app.apppatas.publicar.modelo;

import java.util.Date;

public class Publicacion {
    int idpublicacion;
    Date publicacion_hora;
    Date publicacion_fecha;
    double publicacion_recompensa;
    String publicacion_tiempo_perdida;
    int mascota_idmascota;
    Date perdida_fecha;

    public Publicacion(int idpublicacion, Date publicacion_hora, Date publicacion_fecha,
                       double publicacion_recompensa, String publicacion_tiempo_perdida,
                       int mascota_idmascota, Date perdida_fecha) {
        this.idpublicacion = idpublicacion;
        this.publicacion_hora = publicacion_hora;
        this.publicacion_fecha = publicacion_fecha;
        this.publicacion_recompensa = publicacion_recompensa;
        this.publicacion_tiempo_perdida = publicacion_tiempo_perdida;
        this.mascota_idmascota = mascota_idmascota;
        this.perdida_fecha = perdida_fecha;
    }

    public int getIdpublicacion() {
        return idpublicacion;
    }

    public void setIdpublicacion(int idpublicacion) {
        this.idpublicacion = idpublicacion;
    }

    public Date getPublicacion_hora() {
        return publicacion_hora;
    }

    public void setPublicacion_hora(Date publicacion_hora) {
        this.publicacion_hora = publicacion_hora;
    }

    public Date getPublicacion_fecha() {
        return publicacion_fecha;
    }

    public void setPublicacion_fecha(Date publicacion_fecha) {
        this.publicacion_fecha = publicacion_fecha;
    }

    public double getPublicacion_recompensa() {
        return publicacion_recompensa;
    }

    public void setPublicacion_recompensa(double publicacion_recompensa) {
        this.publicacion_recompensa = publicacion_recompensa;
    }

    public String getPublicacion_tiempo_perdida() {
        return publicacion_tiempo_perdida;
    }

    public void setPublicacion_tiempo_perdida(String publicacion_tiempo_perdida) {
        this.publicacion_tiempo_perdida = publicacion_tiempo_perdida;
    }

    public int getMascota_idmascota() {
        return mascota_idmascota;
    }

    public void setMascota_idmascota(int mascota_idmascota) {
        this.mascota_idmascota = mascota_idmascota;
    }

    public Date getPerdida_fecha() {
        return perdida_fecha;
    }

    public void setPerdida_fecha(Date perdida_fecha) {
        this.perdida_fecha = perdida_fecha;
    }
}
