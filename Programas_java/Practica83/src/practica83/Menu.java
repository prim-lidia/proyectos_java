/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica83;

import java.util.Scanner;

/**
 *
 * @author lidia
 */
public class Menu {
    /**
     * Pide a por pantalla
     */
    public void pedirA(){
        System.out.println("Constante a:");
    }
    /**
     * Pide b por pantalla
     */
    public void pedirB(){
        System.out.println("Constante b:");
    }
    /**
     * Pide c por pantalla
     */
    public void pedirC(){
        System.out.println("Constante c:");
    }
    /**
     * Devuelve una string pedida por pantalla
     * @return string
     */
    public String leerString(){
        Scanner leer= new Scanner(System.in);
        return leer.nextLine();
    }
}