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
    
    /*Metedos set*/
    public void setA(double a){
        this.a=a;
    }
    public void setB(double b){
        this.b=b;
    }
    public void setC(double c){
        this.c=c;
    }

    /* Calculos */
    public void calcA(){
        this.a= Math.sqrt(Math.pow(c,2)-Math.pow(b,2));
    }
    public void calcB(){
        this.b= Math.sqrt(Math.pow(c,2)-Math.pow(a,2));
    }
    public void calcC(){
        this.c= Math.sqrt(Math.pow(a,2)+ Math.pow(b,2));
    }
    
    
    /* Metodos get */
    
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    
}
