/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica79;

import java.util.Scanner;

/**
 *
 * @author lidia
 */
public class Practica79 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declarar objeto
        Pentagono p1 = new Pentagono();
        
        //Pedir base y altura del triangulo
        Scanner leer = new Scanner(System.in);//Entrada teclado
        System.out.println("Lado del pentágno:");      
        p1.setLado(leer.nextFloat());
        System.out.println("Apotema del pentágno:"); 
        p1.setApotema(leer.nextFloat());
        
        //Calcular y mostrar area del triángulo
        p1.setArea();
        System.out.println("El area del triangulo es "+p1.getArea());
    }
    
}
