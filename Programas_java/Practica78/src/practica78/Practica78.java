/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica78;
import java.util.Scanner;
/**
 *
 * @author lidia
 */
public class Practica78 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declarar objeto
        Triangulo t1 = new Triangulo();
        
        //Pedir base y altura del triangulo
        Scanner leer = new Scanner(System.in);//Entrada teclado
        System.out.println("Base del triángulo:");      
        t1.setBase(leer.nextFloat());
        System.out.println("Altura del triángulo:"); 
        t1.setAltura(leer.nextFloat());
        
        //Calcular y mostrar area del triángulo
        t1.setArea(t1.getBase(),t1.getAltura());
        System.out.println("El area del triangulo es "+t1.getArea());
        
        
    }
    
}
