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
    public void pedirA(){
        System.out.println("Constante a:");
    }
    public void pedirB(){
        System.out.println("Constante b:");
    }
    public void pedirC(){
        System.out.println("Constante c:");
    }
    public String leerString(){
        Scanner leer= new Scanner(System.in);
        return leer.nextLine();
    }
}