/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud07_teatro;

import java.util.ArrayList;

/**
 *
 * @author mati
 */
public class Teatros {
    private String nombreTeatro;
    private int numAsientos;
    private ArrayList<Funciones> listaFunciones;

   public Teatros() {
    }

    public Teatros(String nombreTeatro, int numAsientos) {
        this.nombreTeatro = nombreTeatro;
        this.numAsientos = numAsientos;
    }
    
    public void añadirFuncion(Funciones funcion){
        this.listaFunciones.add(funcion);
    }
    
    public void modificarFuncion(String nombre, double nuevoPrecio){
        
    }
    
    public boolean buscarFuncion(String nombre, double precio){
        for (int i = 0; i < listaFunciones.size(); i++) {
            if(listaFunciones.get(i).getNombre().equalsIgnoreCase(nombre)){
                listaFunciones.get(i).setPrecio(precio);
                return true;
            }
        }
        return false;
    }

    public String getNombreTeatro() {
        return nombreTeatro;
    }

    public void setNombreTeatro(String nombreTeatro) {
        this.nombreTeatro = nombreTeatro;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }
    
    
}
