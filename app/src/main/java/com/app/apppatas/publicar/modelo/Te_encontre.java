package com.app.apppatas.publicar.modelo;

import java.util.Date;

public class Te_encontre {
    int idte_encontre;
    Float te_encontre_gps;
    Date te_encontre_fecha;
    String te_encontre_nombre;
    String te_encontre_telefono;

    public Te_encontre(int idte_encontre, Float te_encontre_gps, Date te_encontre_fecha, String te_encontre_nombre, String te_encontre_telefono) {
        this.idte_encontre = idte_encontre;
        this.te_encontre_gps = te_encontre_gps;
        this.te_encontre_fecha = te_encontre_fecha;
        this.te_encontre_nombre = te_encontre_nombre;
        this.te_encontre_telefono = te_encontre_telefono;
    }


    public int getIdte_encontre() {
        return idte_encontre;
    }

    public void setIdte_encontre(int idte_encontre) {
        this.idte_encontre = idte_encontre;
    }

    public Float getTe_encontre_gps() {
        return te_encontre_gps;
    }

    public void setTe_encontre_gps(Float te_encontre_gps) {
        this.te_encontre_gps = te_encontre_gps;
    }

    public Date getTe_encontre_fecha() {
        return te_encontre_fecha;
    }

    public void setTe_encontre_fecha(Date te_encontre_fecha) {
        this.te_encontre_fecha = te_encontre_fecha;
    }

    public String getTe_encontre_nombre() {
        return te_encontre_nombre;
    }

    public void setTe_encontre_nombre(String te_encontre_nombre) {
        this.te_encontre_nombre = te_encontre_nombre;
    }

    public String getTe_encontre_telefono() {
        return te_encontre_telefono;
    }

    public void setTe_encontre_telefono(String te_encontre_telefono) {
        this.te_encontre_telefono = te_encontre_telefono;
    }
}
