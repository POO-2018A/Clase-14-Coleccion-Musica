/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionmusica;

import java.util.Date;

/**
 *
 * @author chalosalvador
 */
public class Artista {
    
    private String nombre;
    private Date fechaNacimiento;
    private String pais;
    private Album[] albums;

    public Artista(String nombre, Date fechaNacimiento, String pais, Album[] albums) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.pais = pais;
        this.albums = albums;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Album[] getAlbums() {
        return albums;
    }

    public void setAlbums(Album[] albums) {
        this.albums = albums;
    }

    @Override
    public String toString() {
        String artista = "Nombre=" + nombre + "\n"
                + "FechaNacimiento=" + fechaNacimiento + "\n"
                + "Pais=" + pais + "\n"
                + "Albums=\n";
        
        for(int i = 0; i < albums.length; i++){
            artista += albums[i] + "\n";
        }
        
        return artista;
    }
    
    
    
}
