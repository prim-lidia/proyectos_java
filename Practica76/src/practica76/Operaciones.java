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
    private float operadorA;
    private float operadorB;
    private float result;
    
    
    /*Setters de Operaciones*/
    public void setOperadorA(float n){
        this.operadorA= n;
    }
    public void setOperadorB(float n){
        this.operadorB= n;
    }
    public void setResult(float n){
        this.result=n;
    }
    
    
    /* Getters de operaciones*/
    public float getOperadorA(){
        return operadorA;
    }
    public float getOperadorB(){
        return operadorB;
    }
    public float getResult(){
        return result;
    }
    
    
    /* Posibilidades resultado*/
    public void suma(float numA, float numB){
        this.result = numA + numB;
    }
    public void resta(float numA, float numB){
        this.result = numA - numB;
    }
    public void multiplicacion(float numA, float numB){
        this.result = numA * numB;
    }
    public void division(float numA, float numB){
        this.result = numA / numB;
    }
    
    /* Conseguir numeros */
    public boolean comprobarNumero( String cad){
        boolean valido;
        
        valido=Pattern.matches("\\d+[,.]*\\d*",cad);
        
        return valido;
    }
    
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
