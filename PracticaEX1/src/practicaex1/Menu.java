/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaex1;
import java.util.Scanner;
/**
 *
 * @author lidia
 */
public class Menu {
    /**
     * Muestra por pantalla el menu para elegir 
     * que lado del triangulo quieres calcular
     */
    public void mostrarMenu(){
        System.out.println("TEOREMA DE PITAGORAS:");
        System.out.println("A - cateto a");
        System.out.println("B - cateto b");
        System.out.println("C - hipotenusa c");
        System.out.println("Lado a calcular:");
    }
    /**
     * Devuelve una cadena de texto introducida por teclada después de pasarla a mayúsculas
     * @return cadena de texto en mayúsculas
     */
    public String leerString(){
        String cad;
        Scanner leer= new Scanner(System.in);
        cad=leer.nextLine();
        return cad.toUpperCase();
    }
    /**
     * Devuvle un número decimal introducido por teclado
     * @return número decimal 
     */
    public Double leerDouble(){
        Scanner leer= new Scanner(System.in);
        return leer.nextDouble();
    }
    /**
     * Pide por pantalla el cateto a y devuelve el valor introducido por teclado
     * @return longitud con decimales
     */
    public Double pedirA(){
        System.out.print("Cateto a:  ");
        return leerDouble();
    }
    /**
     * Pide por pantalla el cateto b y devuelve el valor introducido por teclado
     * @return longitud con decimales
     */
    public Double pedirB(){
        System.out.print("Cateto b:  ");
        return leerDouble();
    }
    /**
     * Pide por pantalla la hipotenusa c y devuelve el valor introducido por teclado
     * @return longitud con decimales
     */
    public Double pedirC(){
        System.out.print("Hipotenusa c:  ");
        return leerDouble();
    }
    
}
