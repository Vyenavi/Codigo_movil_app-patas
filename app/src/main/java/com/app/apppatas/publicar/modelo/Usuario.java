package com.app.apppatas.publicar.modelo;

import java.util.List;

public class Usuario {
    int idusuario;
    String usu_nombre;
    String usu_apellido;
    String usu_email;
    String usu_password;
    String usu_token;
    int usu_imagen;
    String usu_sexo;
    String telefono;

    public Usuario(int idusuario, String usu_nombre, String usu_apellido, String usu_email, String usu_password, String usu_token, int usu_imagen, String usu_sexo, String telefono) {
        this.idusuario = idusuario;
        this.usu_nombre = usu_nombre;
        this.usu_apellido = usu_apellido;
        this.usu_email = usu_email;
        this.usu_password = usu_password;
        this.usu_token = usu_token;
        this.usu_imagen = usu_imagen;
        this.usu_sexo = usu_sexo;
        this.telefono = telefono;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getUsu_nombre() {
        return usu_nombre;
    }

    public void setUsu_nombre(String usu_nombre) {
        this.usu_nombre = usu_nombre;
    }

    public String getUsu_apellido() {
        return usu_apellido;
    }

    public void setUsu_apellido(String usu_apellido) {
        this.usu_apellido = usu_apellido;
    }

    public String getUsu_email() {
        return usu_email;
    }

    public void setUsu_email(String usu_email) {
        this.usu_email = usu_email;
    }

    public String getUsu_password() {
        return usu_password;
    }

    public void setUsu_password(String usu_password) {
        this.usu_password = usu_password;
    }

    public String getUsu_token() {
        return usu_token;
    }

    public void setUsu_token(String usu_token) {
        this.usu_token = usu_token;
    }

    public int getUsu_imagen() {
        return usu_imagen;
    }

    public void setUsu_imagen(int usu_imagen) {
        this.usu_imagen = usu_imagen;
    }

    public String getUsu_sexo() {
        return usu_sexo;
    }

    public void setUsu_sexo(String usu_sexo) {
        this.usu_sexo = usu_sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }






}

