/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica80;

import java.util.Scanner;

/**
 *
 * @author lidia
 */
public class Practica80 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar objeto
        Cubo c1= new Cubo();
        
        //Pedir base y altura del cubo
        Scanner leer = new Scanner(System.in);//Entrada teclado
        System.out.println("Arista del cubo:");      
        c1.setArista(leer.nextFloat());

        
        //Calcular y mostrar area del cubo
        c1.setArea();
        System.out.println("El area del cubo es "+c1.getArea());
    }
    
}
