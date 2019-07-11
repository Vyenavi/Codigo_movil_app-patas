package com.app.apppatas.perfil.usuario;

import android.os.Bundle;
import android.widget.Button;

import com.app.apppatas.R;

public class Perfil {
    int idusuario;
    int telefono;
    public String apellido;
    String nombre;
    String direccion;
    String contrasenia;
    String contrasian2;
    private Button btnSave;


    public Perfil(int idusuario, int telefono, String apellido, String nombre, String direccion, String contrasenia, String contrasian2) {
        this.telefono = telefono;
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono=telefono;
        this.contrasenia = contrasenia;
        this.contrasian2 = contrasian2;
    }


    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;

    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getApellido() {
        return  apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getContrasian2() {
        return contrasian2;
    }

    public void setContrasian2(String contrasian2) {
        this.contrasian2 = contrasian2;
    }
}
