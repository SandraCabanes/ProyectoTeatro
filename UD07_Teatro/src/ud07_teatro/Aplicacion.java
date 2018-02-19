/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud07_teatro;

import java.util.Scanner;

/**
 *
 * @author mati
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int op = 0;
        String nombreTeatro;
        String nombre;
        String localidad;
        int id;
        double precio;
        int asientosLibres;
        int fecha;
        int hora;
        Teatros teatro=null;
        Localidades ciudad=null;
        boolean estaTeatro=false;
        Funciones funcion=null;

        do {
            menu();
            System.out.print("Elegir opción: ");
            op = teclado.nextInt();
            teclado.nextLine();

            switch (op) {
                case 1:
                    do {
                        System.out.println("Nombre teatro: ");
                        nombreTeatro = teclado.nextLine();
                        estaTeatro=ciudad.buscarTeatro(nombreTeatro);
                    } while (estaTeatro);

                    if (!estaTeatro) {
                        
                        System.out.print("ID: ");
                        id = teclado.nextInt();
                        teclado.nextLine();
                        System.out.print("Nombre función: ");
                        nombre = teclado.nextLine();
                        System.out.print("Precio: ");
                        precio = teclado.nextDouble();
                        System.out.print("Asientos libres: ");
                        asientosLibres = teclado.nextInt();
                        System.out.print("Fecha: ");
                        fecha = teclado.nextInt();
                        System.out.print("Hora: ");
                        hora = teclado.nextInt();
                        teclado.nextLine();
                        
                        if(teatro.buscarFuncion(nombre, precio)){
                            System.out.println("La función ya existe");
                        }else{
                            funcion = new Funciones(id, nombre, precio, asientosLibres, fecha, hora);
                            teatro.añadirFuncion(funcion);
                        }
                    }
                    break;
                    
                    
                case 2:
                    System.out.print("Nombre de la función a modificar: ");
                    nombre=teclado.nextLine();
                    System.out.print("Precio a modificar: ");
                    precio=teclado.nextDouble();
                    teatro.modificarFuncion(nombre, precio);
                    break;
                    
                case 3:
                    
                    break;
                    

                case 0:
                    System.out.println("Salir");
                    break;

                default:
                    System.out.println("Opción inválida");
            }
        } while (op != 0);
    }

    public static void menu() {
        System.out.println("1. Añadir funciones a un teatro");
        System.out.println("2. Modificar precio función");
        System.out.println("3. Reservar asiento");
        System.out.println("4. Listado de funciones");
        System.out.println("5. Listado de teatros");
        System.out.println("0. Salir");
    }

}
