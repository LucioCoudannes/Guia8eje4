/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Comparador.ComparadorPelicula;
import static Comparador.ComparadorPelicula.ordenaDirector;
import static Comparador.ComparadorPelicula.ordenaMayorMenor;
import static Comparador.ComparadorPelicula.ordenaMenorMayor;
import static Comparador.ComparadorPelicula.ordenaNombre;
import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author A288808
 */
public class PeliculaService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> listaPeliculas = new ArrayList();
    
    public Pelicula nuevaPelicula(){
        
        Pelicula p = new Pelicula();
        
        
        System.out.println("Ingrese el nombre de la Pelicula");
        p.setNombre(leer.next());
        System.out.println("Ingrese el nombre del director de la Pelicula");
        p.setDirector(leer.next());
        System.out.println("Ingrese la duracion de la Pelicula");
        p.setTiempo(leer.nextDouble());
        
        
        
      return p;  
    }
    
    public void llenarLista(){
        
        String op="S";
        
        do {
            
            listaPeliculas.add(nuevaPelicula());
            System.out.println("Desea agregar otra pelicula S/N");
            op=leer.next();
            
        } while (op.equalsIgnoreCase("s"));
        
    }
    
    public void mostrarLista(){
        
        System.out.println("Lista de Peliculas");
        
        for (Pelicula listaPelicula : listaPeliculas) {
            
            System.out.println(listaPelicula.toString());
            
        }
 
    }
    
    public void pelisMayorHora(){
        
        System.out.println("Peliculas con duracion mayor de una hora");
        
        
        for (Pelicula listaPelicula : listaPeliculas) {
            
            if(listaPelicula.getTiempo()>1){
                System.out.println(listaPelicula.toString());
                
            }
            
        }
        
        
    }
    
    public void ordenMayorMenor(){
        
        System.out.println("Peliculas ordenadas de Mayor a Menor duracion");
        Collections.sort(listaPeliculas, ordenaMayorMenor);
        
        mostrarLista();
        
        
    }
    
    public void ordenMenorMayor(){
        
        System.out.println("Peliculas ordenadas de Menor a Mayor duracion");
        Collections.sort(listaPeliculas, ordenaMenorMayor);
        
        mostrarLista();
        
        
    }
    public void ordenNombre(){
        
        System.out.println("Peliculas ordenadas por Titulo");
        Collections.sort(listaPeliculas, ordenaNombre);
        
        mostrarLista();
        
        
    }
    public void ordenaDirector(){
        
        System.out.println("Peliculas ordenadas por Director");
        Collections.sort(listaPeliculas, ordenaDirector);
        
        mostrarLista();
        
        
    }
    
    
    
    
    
}
