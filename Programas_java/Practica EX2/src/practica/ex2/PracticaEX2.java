/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.ex2;

import java.util.Scanner;

/**
 *
 * @author lidia
 */
public class PracticaEX2 {

    /**
     * Programa para desglosar una cantitdad de tiempo en segundos en el
     * minimo posible de semanas, dias, horas, minutos y segundos.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar objeto
       Conversor seg1 =  new Conversor();
       
       Scanner read= new Scanner(System.in);
       System.out.println("Total de segundos:");
       seg1.setTotal(read.nextInt());
       
       seg1.setTiempo(seg1.getTotal());
       
       System.out.println("DESGLOSE DE TIEMPO: ");
       for(int i=0; i<seg1.getLength(); i++){
           System.out.print(seg1.getTextoDesg(i)+": ");
           System.out.print(seg1.getTiempoDesg(i));
           System.out.println();
       }
       
    }
    
}
