/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica76;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author lidia
 */
public class Menu {
    /**
     * Opción para acceder a las diferentes tareas del programa
     */
    private String opcion;
    /**
     * Incializar el objeto del la clase Scanner
     */
    static Scanner read= new Scanner(System.in);
    /**
     * Constructor de la clase
     */
    public Menu(){
        opcion="";
    }
    /**
     * Muestra el menú calculadora
     */
    public void mostrarmenu(){
        System.out.println("MENU CALCULADORA:");
        System.out.println("+ - suma");
        System.out.println("- - resta");
        System.out.println("x - multiplicaión");
        System.out.println("/ - division");
        System.out.println("Elige opción");
        
    }
    /**
     * Modifica la opción del objeto Menu
     */
    public void leerOpcion(){
        this.opcion=read.nextLine();
        System.out.println();
    }
    /**
     * Devuelve la opción del objeto Menu
     * @return opción del menú
     */
    public String getOpcion(){       
        return opcion;
    }
    /**
     * Comprueba que se haya elegido una operación correcta
     * @param opcion
     * @return Devuelve true si la opción cumple el patrón
     */
    public boolean validarOperacion(String opcion){
        boolean valido;
        valido=Pattern.matches("[-+x/]",opcion);
        
        return valido;
    }
}
