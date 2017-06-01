/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica83;

/**
 *
 * @author lidia
 */
public class Ecuacion {
    private float a;
    private float b;
    private float c;
    private double D; //discriminante
    private double[] result= new double[2];
    
    /**
     * Modifica el valor de a
     * @param n valor de a
     */
    public void setA(float n){
        this.a=n;
    }
    /**
     * Modifica el valor de b
     * @param n valor de b
     */
    public void setB(float n){
        this.b=n;
    }
    /**
     * Modifica el valor de c
     * @param n valor de c
     */
    public void setC(float n){
        this.c=n;
    }
    
    /**
     * Calcula el Discriminante D y lo módifica
     */
    public void setD(){
        this.D=Math.pow(b,2)-4*a*c;
    }
    /**
     * Calcula el resultado de la ecuación y lo guarda en la propieda result
     */
    public void setResult(){
        if(D>0){
            double valorPositivo=-(b+Math.sqrt(D))/2;
            double valorNegativo=-(b-Math.sqrt(D))/2;
            result[0]= valorPositivo;
            result[1]= valorNegativo;
        }else if(D==0){
            result[0]=-(b/2*a);
        }       
    }
    
    /**
     * Devuelve el valor de a
     * @return valor de a
     */
    public float getA(){
        return a;
    }
    /**
     * Devuelve el valor de b
     * @return valor de b
     */
    public float getB(){
        return b;
    }
    /**
     * Devuelve el valor de c
     * @return valor de c
     */
    public float getC(){
        return c;
    }
    /**
     * Devuelve el valor del discriminante D
     * @return valor del discriminante D
     */
    public double getD(){
        return D;
    }
    /**
     * Devuelve el valor del resultado alacenando en la posición i del listado
     * @param i indice del listado
     * @return resultado [i] de la ecuación
     */
    public double getResult_i(int i){
        return result[i];
    }
    
}
