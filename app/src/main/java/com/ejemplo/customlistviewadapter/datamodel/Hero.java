package com.ejemplo.customlistviewadapter.datamodel;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/**
 * Clase del modelo de datos para representa a un hero, tiene 4 propiedades: nombre, edad, foto
 * y poderes del superheroe
 */
public class Hero {
    private String nombre;
    private int edad;
    private Drawable foto;
    private ArrayList<String> poderes;
    /**
     * Constructor especializado en inicializar el nombre, la edad y la foto del héroe
     * @param nombre Nombre del héroe
     * @param edad Edad del héroe
     * @param foto Foto del héroe
     */
    public Hero(String nombre, int edad, Drawable foto) {
        this.nombre = nombre;
        this.edad = edad;
        this.foto = foto;
        this.poderes =new ArrayList<String>();
    }
    /**
     * Constructor especializado en inicializar los poderes del héroe
     * @param nombre Nombre del héroe
     * @param edad  Edad del héroe
     * @param foto Foto del héroe
     * @param poderes Lista de poderes del héroe
     */
    public Hero(String nombre, int edad, Drawable foto, ArrayList<String> poderes) {
        this(nombre, edad, foto);
        this.poderes = poderes;
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
    public ArrayList<String> getPoderes(){
        return this.poderes;
    }
    /**
     * Permite añadir nuevos poderes
     * @param poder Nuevo poder
     */
    public void nuevoPoder(String poder) {
        this.poderes.add(poder);
    }

    /**
     * Elimina un determinado poder
     * @param poder Poder a eliminar
     * @return Devuelve el poder eliminado o null en caso de que no haya sido posible eliminarlo
     */
    public String eliminarPoder(String poder){
        if(this.poderes.remove(poder))
            return poder;
        return null;
    }
}
