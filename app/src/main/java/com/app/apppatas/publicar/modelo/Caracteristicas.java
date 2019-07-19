package com.app.apppatas.publicar.modelo;

public class Caracteristicas {
    int id_caracteristicas_id;
    String tipo_caracteristicas;

    public Caracteristicas(int id_caracteristicas_id, String tipo_caracteristicas) {
        this.id_caracteristicas_id = id_caracteristicas_id;
        this.tipo_caracteristicas = tipo_caracteristicas;
    }


    public int getId_caracteristicas_id() {
        return id_caracteristicas_id;
    }

    public void setId_caracteristicas_id(int id_caracteristicas_id) {
        this.id_caracteristicas_id = id_caracteristicas_id;
    }

    public String getTipo_caracteristicas() {
        return tipo_caracteristicas;
    }

    public void setTipo_caracteristicas(String tipo_caracteristicas) {
        this.tipo_caracteristicas = tipo_caracteristicas;
    }
}
