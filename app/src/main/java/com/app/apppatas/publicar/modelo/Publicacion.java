package com.app.apppatas.publicar.modelo;

import java.util.List;

public class Publicacion {

    private String imagenUsuario;
    private String nombreUsuario;
    private String fecha;
    private String hora;
    private String nombreMascota;
    private String raza;
    private String color;
    private String tamanio;
    private String aditamentos;
    private String donde;
    private String observaciones;
    private String enfermedades;
    private List<String> imagenesMascota;

    Publicacion(){

    }

    public Publicacion(String imagenUsuario, String nombreUsuario, String fecha, String hora, String nombreMascota,
                       String raza, String color, String tamanio, String aditamentos, String donde, String observaciones,
                       String enfermedades) {
        this.imagenUsuario = imagenUsuario;
        this.nombreUsuario = nombreUsuario;
        this.fecha = fecha;
        this.hora = hora;
        this.nombreMascota = nombreMascota;
        this.raza = raza;
        this.color = color;
        this.tamanio = tamanio;
        this.aditamentos = aditamentos;
        this.donde = donde;
        this.observaciones = observaciones;
        this.enfermedades = enfermedades;
    }

    public String getImagenUsuario() {
        return imagenUsuario;
    }

    public void setImagenUsuario(String imagenUsuario) {
        this.imagenUsuario = imagenUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getAditamentos() {
        return aditamentos;
    }

    public void setAditamentos(String aditamentos) {
        this.aditamentos = aditamentos;
    }

    public String getDonde() {
        return donde;
    }

    public void setDonde(String donde) {
        this.donde = donde;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    public List<String> getImagenesMascota() {
        return imagenesMascota;
    }

    public void setImagenesMascota(List<String> imagenesMascota) {
        this.imagenesMascota = imagenesMascota;
    }
}
