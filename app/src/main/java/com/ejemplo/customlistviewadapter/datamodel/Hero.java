package com.ejemplo.customlistviewadapter.datamodel;

import android.graphics.drawable.Drawable;

public class Hero {
   private String nombre;
   private int edad;
   private Drawable foto;

    public Hero(String nombre, int edad, Drawable foto) {
        this.nombre = nombre;
        this.edad = edad;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Drawable getFoto() {
        return foto;
    }

    public void setFoto(Drawable foto) {
        this.foto = foto;
    }
}
