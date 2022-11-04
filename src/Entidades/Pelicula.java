/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;



/**
 *
 * @author A288808
 */
public class Pelicula {
    
    private String nombre;
    private String director;
    private Double tiempo;
    
    public Pelicula() {
    }

    public Pelicula(String nombre, String director, Double tiempo) {
        this.nombre = nombre;
        this.director = director;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getTiempo() {
        return tiempo;
    }

    public void setTiempo(Double tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", director=" + director + ", tiempo=" + tiempo + '}';
    }

    public int compareTo(Double d) {
        return tiempo.compareTo(d);
    }
    
    
    
    
}
