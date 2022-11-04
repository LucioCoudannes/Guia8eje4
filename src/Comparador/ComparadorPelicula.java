/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparador;

import Entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author A288808
 */
public class ComparadorPelicula {
    
    public static Comparator<Pelicula> ordenaMayorMenor = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula P1, Pelicula P2) {
            return P2.getTiempo().compareTo(P1.getTiempo());
        }
        
    };
    
        public static Comparator<Pelicula> ordenaMenorMayor = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula P1, Pelicula P2) {
            return P1.getTiempo().compareTo(P2.getTiempo());
        }
        
    };
        public static Comparator<Pelicula> ordenaNombre = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula P1, Pelicula P2) {
            return P1.getNombre().compareTo(P2.getNombre());
        }
        
    };
        public static Comparator<Pelicula> ordenaDirector = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula P1, Pelicula P2) {
            return P1.getDirector().compareTo(P2.getDirector());
        }
        
    };
        
        
    
    
    
    
}
