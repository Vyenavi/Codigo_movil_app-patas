package com.app.apppatas.publicar.modelo;

import java.util.Date;

public class Publicacion {
    int idpublicacion;
    Date publicacion_fecha;
    Double publicacion_recompensa;
    Date publicacion_tiempo_perdida;
    Date perdida_fecha;

    public Publicacion(int idpublicacion, Date publicacion_fecha, Double publicacion_recompensa, Date publicacion_tiempo_perdida, Date perdida_fecha) {
        this.idpublicacion = idpublicacion;
        this.publicacion_fecha = publicacion_fecha;
        this.publicacion_recompensa = publicacion_recompensa;
        this.publicacion_tiempo_perdida = publicacion_tiempo_perdida;
        this.perdida_fecha = perdida_fecha;
    }


    public int getIdpublicacion() {
        return idpublicacion;
    }

    public void setIdpublicacion(int idpublicacion) {
        this.idpublicacion = idpublicacion;
    }

    public Date getPublicacion_fecha() {
        return publicacion_fecha;
    }

    public void setPublicacion_fecha(Date publicacion_fecha) {
        this.publicacion_fecha = publicacion_fecha;
    }

    public Double getPublicacion_recompensa() {
        return publicacion_recompensa;
    }

    public void setPublicacion_recompensa(Double publicacion_recompensa) {
        this.publicacion_recompensa = publicacion_recompensa;
    }

    public Date getPublicacion_tiempo_perdida() {
        return publicacion_tiempo_perdida;
    }

    public void setPublicacion_tiempo_perdida(Date publicacion_tiempo_perdida) {
        this.publicacion_tiempo_perdida = publicacion_tiempo_perdida;
    }

    public Date getPerdida_fecha() {
        return perdida_fecha;
    }

    public void setPerdida_fecha(Date perdida_fecha) {
        this.perdida_fecha = perdida_fecha;
    }
}
