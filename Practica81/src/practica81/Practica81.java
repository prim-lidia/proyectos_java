/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica81;

import java.util.Scanner;

/**
 *
 * @author lidia
 */
public class Practica81 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // Declarar objeto
        Esfera esf1= new Esfera();
        
        //Pedir base y altura de la esfera 
        Scanner leer = new Scanner(System.in);//Entrada teclado
        System.out.println("Arista de la esfera:");      
        esf1.setRadio(leer.nextFloat());

        
        //Calcular y mostrar area de la esfera 
        esf1.setArea();
        System.out.println("El area de la esfera es "+esf1.getArea());
        esf1.setVolumen();
        System.out.println("El volumen de la esfera es "+esf1.getVolumen());
    }
    
}
