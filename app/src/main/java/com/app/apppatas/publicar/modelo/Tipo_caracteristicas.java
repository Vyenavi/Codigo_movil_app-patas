package com.app.apppatas.publicar.modelo;

public class Tipo_caracteristicas {
    int idtipo_caracteristicas;
    String caracteristica;


    public Tipo_caracteristicas(int idtipo_caracteristicas, String caracteristica) {
        this.idtipo_caracteristicas = idtipo_caracteristicas;
        this.caracteristica = caracteristica;
    }

    public int getIdtipo_caracteristicas() {
        return idtipo_caracteristicas;
    }

    public void setIdtipo_caracteristicas(int idtipo_caracteristicas) {
        this.idtipo_caracteristicas = idtipo_caracteristicas;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
}
