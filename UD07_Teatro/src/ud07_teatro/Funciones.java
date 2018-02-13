/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud07_teatro;

/**
 *
 * @author mati
 */
public class Funciones {
    private int id;
    private String nombre;
    private double precio;
    private int asientosLibres;
    private int fecha;
    private int hora;

    public Funciones() {
    }

    public Funciones(int id, String nombre, double precio, int asientosLibres, int fecha, int hora) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.asientosLibres = asientosLibres;
        this.fecha = fecha;
        this.hora = hora;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getAsientosLibres() {
        return asientosLibres;
    }

    public void setAsientosLibres(int asientosLibres) {
        this.asientosLibres = asientosLibres;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    
    
}
