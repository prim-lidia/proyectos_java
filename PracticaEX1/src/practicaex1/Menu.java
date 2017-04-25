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
    public void mostrarMenu(){
        System.out.println("TEOREMA DE PITAGORAS:");
        System.out.println("A - cateto a");
        System.out.println("B - cateto b");
        System.out.println("C - hipotenusa c");
        System.out.println("Lado a calcular:");
    }
    public String leerString(){
        String cad;
        Scanner leer= new Scanner(System.in);
        cad=leer.nextLine();
        return cad.toUpperCase();
    }
    public Double leerDouble(){
        Scanner leer= new Scanner(System.in);
        return leer.nextDouble();
    }
    
    public Double pedirA(){
        System.out.print("Cateto a:  ");
        return leerDouble();
    }
    public Double pedirB(){
        System.out.print("Cateto b:  ");
        return leerDouble();
    }
    public Double pedirC(){
        System.out.print("Hipotenusa c:  ");
        return leerDouble();
    }
    
}
