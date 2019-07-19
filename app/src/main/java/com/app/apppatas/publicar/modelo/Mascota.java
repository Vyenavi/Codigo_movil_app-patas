package com.app.apppatas.publicar.modelo;

public class Mascota {
   int idmascota;
   String masc_nombre;
   String masc_edad;
   String masc_acsesorios;
   String masc_observaciones;

    public Mascota(int idmascota, String masc_nombre, String masc_edad, String masc_acsesorios, String masc_observaciones) {
        this.idmascota = idmascota;
        this.masc_nombre = masc_nombre;
        this.masc_edad = masc_edad;
        this.masc_acsesorios = masc_acsesorios;
        this.masc_observaciones = masc_observaciones;
    }

    public int getIdmascota() {
        return idmascota;
    }

    public void setIdmascota(int idmascota) {
        this.idmascota = idmascota;
    }

    public String getMasc_nombre() {
        return masc_nombre;
    }

    public void setMasc_nombre(String masc_nombre) {
        this.masc_nombre = masc_nombre;
    }

    public String getMasc_edad() {
        return masc_edad;
    }

    public void setMasc_edad(String masc_edad) {
        this.masc_edad = masc_edad;
    }

    public String getMasc_acsesorios() {
        return masc_acsesorios;
    }

    public void setMasc_acsesorios(String masc_acsesorios) {
        this.masc_acsesorios = masc_acsesorios;
    }

    public String getMasc_observaciones() {
        return masc_observaciones;
    }

    public void setMasc_observaciones(String masc_observaciones) {
        this.masc_observaciones = masc_observaciones;
    }
}
