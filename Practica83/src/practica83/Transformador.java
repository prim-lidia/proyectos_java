/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica83;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

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
    public boolean comprobarNumero(String cad){
        boolean valido;
        
        valido=Pattern.matches("\\d+[,.]*\\d*",cad);
        
        return valido;
    }
    /**
     * Comprueba si el texto introducido es un frácción de numeros
     * @param cad   número en formato texto
     * @return Devuelve true si cad cumple el patrón para ser un número
     */
    public boolean comprobarFraccion(String cad){
        boolean valido;
        
        valido=Pattern.matches("(\\d+)\\/(\\d+)",cad);
        
        return valido;
    }
    /**
     * Devuelve el valor númerico del texto cad, si la cadena no cumple 
     * con las condiciones para pasar a nñumero muestra un mensaje de error y vuelve
     * a pedir el número.
     * @param cad texto
     * @return número entero o decimal
     */ 
    public float establecerNum(String cad){
        Scanner leer= new Scanner(System.in);
        float num;
         while(comprobarNumero(cad)==false&&comprobarFraccion(cad)==false){
            System.out.println("Input incorrecto. Escribe un número o fracción");
            cad = leer.nextLine();
        }  
         if(comprobarNumero(cad)){
         num=Float.parseFloat(cad);
         }else{
             //Obtener un Pattern de la expresion regular
            //Después de ese Pattern obtener un Matcher.
            Pattern patronMatch = Pattern.compile("(\\d+)\\/(\\d+)");
            Matcher matcher= patronMatch.matcher(cad);

            //Hacer que el matcher busque los trozos
            matcher.find();
            
            
            float num1=Float.parseFloat(matcher.group(1));//Convetir a float
            float num2=Float.parseFloat(matcher.group(2));//Convertir a float
             
            num=num1/num2;
         
         }
        
        return num;
    }
}
