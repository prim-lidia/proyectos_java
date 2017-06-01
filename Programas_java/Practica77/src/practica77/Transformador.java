/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica77;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author lidia
 */
public class Transformador {
    /**
     * Comprueba si el texto introducido es un número
     * @param cad   número en formato texto
     * @return Devuelve true si cad cumple el patrón para ser un número
     */
    public boolean comprobarNumero( String cad){
        boolean valido;
        
        valido=Pattern.matches("\\d+[,.]*\\d*",cad);
        
        return valido;
    }
    /**
     * Devuelve el valro númerico del texto cad
     * @param cad texto
     * @return número entero o decimal
     */ 
    public float establecerNum(String cad){
        Scanner leer= new Scanner(System.in);
        float num;
         while(comprobarNumero(cad)==false){
            System.out.println("Input incorrecto. Escribe un número");
            cad = leer.nextLine();
        }  
        num=Float.parseFloat(cad);
        return num;
    }
}
