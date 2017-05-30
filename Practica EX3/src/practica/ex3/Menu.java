/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.ex3;
import java.util.Scanner;
/**
 *
 * @author lidia
 */
public class Menu {
    /**
     * Opción para el menú
     */
    private String opcion;
    /**
     * Pide por pantalla la longitud en pies y devuelve el valor introducido por teclado
     * @return número decimal
     */
    public float pedirFt(){
        System.out.println("Cantidad de pies:");
        Scanner read = new Scanner(System.in);
        return read.nextFloat();
    }
    /**
     * Muestra el menú por pantalla
     */
    public void mostrarMenu(){    
        System.out.println("MENU CONVERSOR");
        System.out.println("1 - YARDAS");
        System.out.println("2 - PULGADAS ");
        System.out.println("3 - CENTIMETROS");
        System.out.println("¿A que quiere convertir?");
    }
    /**
     * Modifica el calor de la opción con un valor introducido por teclado
     */
    public void setOpcion(){
        Scanner read= new Scanner(System.in);
        this.opcion= read.nextLine();
    }
    /**
     * Devuelve la opción del menu elegida
     * @return opción del menu
     */
    public String getOpcion(){
        return opcion;
    }
    
    
}
