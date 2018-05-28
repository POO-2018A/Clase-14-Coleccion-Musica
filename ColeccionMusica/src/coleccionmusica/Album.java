/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionmusica;

/**
 *
 * @author chalosalvador
 */
public class Album {
    private String nombre;
    private int anioCreacion;
    private Genero genero;
    private int numeroCanciones;

    public Album(String nombre, int anioCreacion, Genero genero, int numeroCanciones) {
        this.nombre = nombre;
        this.anioCreacion = anioCreacion;
        this.genero = genero;
        this.numeroCanciones = numeroCanciones;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getNumeroCanciones() {
        return numeroCanciones;
    }

    public void setNumeroCanciones(int numeroCanciones) {
        this.numeroCanciones = numeroCanciones;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + ", Año de creación=" + anioCreacion + ", Género=" + genero + ", Número de canciones=" + numeroCanciones;
    }
}
