/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica76;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author lidia
 */
public class Operaciones {
    /**
     * Operador decimal
     */
    private float operadorA;
    /**
     * Operador decimal
     */
    private float operadorB;
    /**
     * Resultado de la operación realizada con los operadores A y B
     */
    private float result;
    
    
    /**
     * Modifica el operadorA del objeto Operaciones dandole el valor del número n
     * @param n número decimal
     */
    public void setOperadorA(float n){
        this.operadorA= n;
    }
    /**
     * Modifica el operadorB del objeto Operaciones dandole el valor del número n
     * @param n número decimal
     */
    public void setOperadorB(float n){
        this.operadorB= n;
    }
    /**
     * Modifica el resultado del objeto Operaciones dandole el valor del número n
     * @param n número decimal
     */
    public void setResult(float n){
        this.result=n;
    }
    
    
    /**
     * Devuelve el operadorA del objeto Operaciones
     * @return número decimal
     */
    public float getOperadorA(){
        return operadorA;
    }
    /**
     * Devuelve el operadorB del objeto Operaciones
     * @return número decimal 
     */
    public float getOperadorB(){
        return operadorB;
    }
    /**
     * Devuelve el resultado del objeto Operaciones
     * @return número decimal
     */
    public float getResult(){
        return result;
    }
    
    /**
     * Modifica el resultado del objeto Operaciones con el valor de la operacion 
     * OperadorA + OperadorB
     */
    public void suma(){
        this.result = operadorA + operadorB;
    }
    /**
     * Modifica el resultado del objeto Operaciones con el valor de la operacion 
     * OperadorA - OperadorB
     */
    public void resta(){
        this.result = operadorA - operadorB;
    }
    /**
     * Modifica el resultado del objeto Operaciones con el valor de la operacion 
     * OperadorA x OperadorB
     */
    public void multiplicacion(){
        this.result = operadorA * operadorB;
    }
    /**
     * Modifica el resultado del objeto Operaciones con el valor de la operacion 
     * OperadorA / OperadorB
     */
    public void division(){
        this.result = operadorA / operadorB;
    }
    
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
     * Modifica el valor del OperadorA del objeto Operaciones asignandole
     * el valor númerico del texto cad
     * @param cad texto
     */
    public void establecerNumA(String cad){
        Scanner leer= new Scanner(System.in);
        float num;
         while(comprobarNumero(cad)==false){
            System.out.println("Input incorrecto. Escribe un número");
            cad = leer.nextLine();
        }  
        num=Float.parseFloat(cad);
        this.setOperadorA(num);
    }
    /**
     * Modifica el valor del OperadorB del objeto Operaciones asignandole
     * el valor númerico del texto cad
     * @param cad texto
     */
    public void establecerNumB(String cad){
        Scanner leer= new Scanner(System.in);
        float num;
        while(comprobarNumero(cad)==false){
            System.out.println("Input incorrecto. Escribe un número");
            cad = leer.nextLine();
        } 
        num=Float.parseFloat(cad);
        this.setOperadorB(num);
    }
}
