/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionmusica;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author chalosalvador
 */
public class ColeccionMusica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int opcion;
        int contadorGeneros = 0, contadorAlbumes = 0;
        Genero listaGeneros[] = new Genero[3];
        Album listaAlbumes[] = new Album[4];
        
        do {
            
            System.out.println("####### ADMINISTRACION DE MUSICA #######");
        
            System.out.println("1. Ingresar artista");
            System.out.println("2. Ingresar album");
            System.out.println("3. Ingresar genero");
            System.out.println("4. Imprimir artistas");
            System.out.println("5. Salir");
            
            System.out.println("Ingrese la opción que desea: ");
            opcion = scan.nextInt();
            
            switch(opcion) {
                case 1:
                    System.out.println("Ingrese el nombre del artista:");
                    scan.nextLine();
                    
                    String nombreArtista = scan.nextLine();
                    
                    System.out.println("Ingrese el pais");
                    String pais = scan.nextLine();
                    
                    System.out.println("Seleccione todos los albumes que le pertenecen al artista separados por comas:");
                    
                    for(int i = 0; i < listaAlbumes.length; i++) {
                        if(listaAlbumes[i] != null) {
                            System.out.println((i+1) + ". " + listaAlbumes[i].getNombre());
                        }
                    }
                    
                    String albumesArtistaTmp = scan.nextLine(); // 1,4,5
                    String[] idAlbumesArtista = albumesArtistaTmp.split(",");
                    
                    Album[] albumesArtista = new Album[idAlbumesArtista.length];
                    
                    for(int i = 0; i < idAlbumesArtista.length; i++) {
                        albumesArtista[i] = listaAlbumes[Integer.valueOf(idAlbumesArtista[i])-1];
                    }
                    
                    Artista artista = new Artista(nombreArtista, new Date(1986, 5, 3), pais, albumesArtista);
                    System.out.println("Artista ingresado:");
                    System.out.println(artista);
                    
                    break;
                case 2:
                    
                    if(contadorGeneros == 0) {
                        System.out.println("No ha ingresado ningún género.");
                        System.out.println("");
                        break;
                    }
                    
                    
                    System.out.println("Ingrese el nombre del album:");
                    scan.nextLine();
                    
                    String nombre =  scan.nextLine();
                    
                    System.out.println("Ingrese el año de creación:");
                    int anio = scan.nextInt();
                    
                    System.out.println("Ingrese el numero de canciones:");
                    int numCanciones = scan.nextInt();
                    
                    
                    for(int i = 0; i < listaGeneros.length; i++) {
                        if(listaGeneros[i] != null){
                            System.out.println( (i+1) + ". " + listaGeneros[i]);
                        }
                    }
                    System.out.println("Seleccione el genero:");
                    int opcionGenero = scan.nextInt();
                    Genero generoSeleccionado = listaGeneros[opcionGenero-1];
                    
                    Album album = new Album(nombre, anio, generoSeleccionado, numCanciones);
                    System.out.println("Se ha ingresado el siguiente album:");
                    System.out.println(album);
                    System.out.println("");
                    
                    
                    listaAlbumes[contadorAlbumes] = album;
                    contadorAlbumes++;
                    break;
                case 3:
                    if(contadorGeneros == 3){
                        System.out.println("La lista de generos está llena.");
                        break;
                    }
                    
                    System.out.println("Ingrese el nombre del género:");
                    scan.nextLine();
                    String nombreGenero = scan.nextLine();
                    
                    Genero genero = new Genero(nombreGenero);
                    
                    listaGeneros[contadorGeneros] = genero;
                    contadorGeneros++;
                    
                    break;
                case 4:
                    System.out.println("Esta es la lista de artistas:");
                    break;
                case 5:
                    System.out.println("Adios!!");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
            
        } while (opcion != 5);
        
    }
    
}
