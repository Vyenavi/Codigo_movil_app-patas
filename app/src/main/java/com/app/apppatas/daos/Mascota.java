package com.app.apppatas.daos;

public class Mascota {
    String nombre;
    String observaciones;
    char sexo;
    int usuario;
    int raza;

    public Mascota() {
    }

    public Mascota(String nombre, String observaciones, char sexo, int usuario, int raza) {
        this.nombre = nombre;
        this.observaciones = observaciones;
        this.sexo = sexo;
        this.usuario = usuario;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }
}
