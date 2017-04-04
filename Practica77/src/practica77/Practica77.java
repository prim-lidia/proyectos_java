/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica77;

import java.util.Scanner;

/**
 *
 * @author lidia
 */
public class Practica77 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Declarar objeto */
        Circunferencia c1= new Circunferencia();
        Transformador t1= new Transformador();
        
        /* Pedir radio*/
        Scanner read= new Scanner(System.in); //Entrada teclado
        System.out.println("Radio de la circnferencia:");
        
        c1.setRadio(t1.establecerNum(read.nextLine())); //Lectura teclado
        
        /* Modificar Area y Longitu */
        c1.calcularArea(c1.getRadio());
        c1.calcularLongitud(c1.getRadio());
        
        /* Imprimir datos */
        System.out.println();
        System.out.println("Longitud: "+c1.getLongitud());
        System.out.println("Area: "+c1.getArea());
        
        
    }
    
}
