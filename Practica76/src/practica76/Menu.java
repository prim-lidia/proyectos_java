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
    private String opcion;
    static Scanner read= new Scanner(System.in);
    
    public Menu(){
        opcion="";
    }
    
    public void mostrarmenu(){
        System.out.println("MENU CALCULADORA:");
        System.out.println("+ - suma");
        System.out.println("- - resta");
        System.out.println("x - multiplicaión");
        System.out.println("/ - division");
        System.out.println("Elige opción");
        
    }
    
    public void leerOpcion(){
        this.opcion=read.nextLine();
        System.out.println();
    }
    
    public String getOpcion(){       
        return opcion;
    }
    
    public boolean validarOperacion(String opcion){
        boolean valido;
        valido=Pattern.matches("[-+x/]",opcion);
        
        return valido;
    }
}
