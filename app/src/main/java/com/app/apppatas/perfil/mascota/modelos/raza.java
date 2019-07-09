package com.app.apppatas.perfil.mascota.modelos;

public class raza {

    int idraza;
    String raza_nombre;
    byte foto_raza;

    public raza(int idraza, String raza_nombre, byte foto_raza) {
        this.idraza = idraza;
        this.raza_nombre = raza_nombre;
        this.foto_raza = foto_raza;
    }

    public int getIdraza() {
        return idraza;
    }

    public void setIdraza(int idraza) {
        this.idraza = idraza;
    }

    public String getRaza_nombre() {
        return raza_nombre;
    }

    public void setRaza_nombre(String raza_nombre) {
        this.raza_nombre = raza_nombre;
    }

    public byte getFoto_raza() {
        return foto_raza;
    }

    public void setFoto_raza(byte foto_raza) {
        this.foto_raza = foto_raza;
    }
}
