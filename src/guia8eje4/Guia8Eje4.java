/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8eje4;

import Entidades.Pelicula;
import Servicios.PeliculaService;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author A288808
 */
public class Guia8Eje4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PeliculaService ps = new PeliculaService();
       
        ps.llenarLista();
        ps.mostrarLista();
        ps.pelisMayorHora();
        ps.ordenMayorMenor();
        ps.ordenMenorMayor();
        ps.ordenNombre();
        ps.ordenaDirector();
        
        
        
    }
    
}
