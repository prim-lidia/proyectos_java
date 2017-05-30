/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaex1;

/**
 *
 * @author lidia
 */
public class TrianguloR {
    private double a, b, c;
    
    /**
     * Modifica la longitud del lado a
     * @param a longitud del lado a
     */
    public void setA(double a){
        this.a=a;
    }
    /**
     * Modifica la longitud del lado b
     * @param b longitud del lado b
     */
    public void setB(double b){
        this.b=b;
    }
    /**
     * Modifica la longitud del lado c
     * @param c longitud del lado c
     */
    public void setC(double c){
        this.c=c;
    }

    /**
     * Calcula la longitud del cateto a
     */
    public void calcA(){
        this.a= Math.sqrt(Math.pow(c,2)-Math.pow(b,2));
    }
    /**
     * Calcula la longitud del cateto b
     */
    public void calcB(){
        this.b= Math.sqrt(Math.pow(c,2)-Math.pow(a,2));
    }
    /**
     * Calcula la longitud de la hipotenusa C
     */
    public void calcC(){
        this.c= Math.sqrt(Math.pow(a,2)+ Math.pow(b,2));
    }
    
    
    /**
     * Devuelve la longitud del cateto a
     * @return longitud del cateto a
     */
    public double getA(){
        return a;
    }
    /**
     * Devuelve la longitud del cateto b
     * @return longitud del cateto b
     */
    public double getB(){
        return b;
    }
    /**
     * Devuelve la longitud del hipotenusa c
     * @return longitud del hipotenusa c
     */
    public double getC(){
        return c;
    }
    
}
