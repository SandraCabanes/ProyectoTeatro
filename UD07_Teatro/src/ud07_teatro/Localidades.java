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
public class Localidades {

    private String nombre;
    private int numTeatros;
    private ArrayList<Teatros> listaTeatros;

    public Localidades() {
        listaTeatros = new ArrayList<>();
    }

    public boolean buscarTeatro(String nombreTeatro){
        for (int i = 0; i < listaTeatros.size(); i++) {
            if(listaTeatros.get(i).getNombreTeatro().equalsIgnoreCase(nombreTeatro)){
                return true;
            }
        }
        return false;
    }
    
}