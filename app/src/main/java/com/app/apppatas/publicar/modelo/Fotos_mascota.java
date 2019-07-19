package com.app.apppatas.publicar.modelo;

public class Fotos_mascota {
    int idfotos_mascota;
    int fotos;
    String estado;

    public Fotos_mascota(int idfotos_mascota, int fotos, String estado) {
        this.idfotos_mascota = idfotos_mascota;
        this.fotos = fotos;
        this.estado = estado;
    }

    public int getIdfotos_mascota() {
        return idfotos_mascota;
    }

    public void setIdfotos_mascota(int idfotos_mascota) {
        this.idfotos_mascota = idfotos_mascota;
    }

    public int getFotos() {
        return fotos;
    }

    public void setFotos(int fotos) {
        this.fotos = fotos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
