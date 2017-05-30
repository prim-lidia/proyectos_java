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
     * Modifica el lado a
     * @param n longitud del lado a
     */
    public void setA(float n){
        this.a=n;
    }
    /**
     * Modifica el lado b
     * @param n longitud del lado b
     */
    public void setB(float n){
        this.b=n;
    }
    /**
     * Modifica el lado c
     * @param n longitud del lado c
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
     * Devuelve la longitud del lado a
     * @return longitud del lado a
     */
    public float getA(){
        return a;
    }
    /**
     * Devuelve la longitud del lado b
     * @return longitud del lado b
     */
    public float getB(){
        return b;
    }
    /**
     * Devuelve la longitud del lado c
     * @return longitud del lado c
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
