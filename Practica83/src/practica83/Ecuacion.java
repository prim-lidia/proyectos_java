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
    
    /* Metodos set */
    public void setA(float n){
        this.a=n;
    }
    public void setB(float n){
        this.b=n;
    }
    public void setC(float n){
        this.c=n;
    }
    public void setD(){
        this.D=Math.pow(b,2)-4*a*c;
    }
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
    
    /* Métodos get */
    public float getA(){
        return a;
    }
    public float getB(){
        return b;
    }
    public float getC(){
        return c;
    }
    public double getD(){
        return D;
    }
    public double getResult_i(int i){
        return result[i];
    }
    
}
