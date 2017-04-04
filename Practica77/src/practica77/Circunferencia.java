/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica77;

/**
 *
 * @author lidia
 */
public class Circunferencia {
    float radio;
    double area;
    double longitud;    
    
    public void setRadio(float radio){
        this.radio=radio;
    }
    public void calcularArea(float radio){
        this.area=Math.PI*Math.pow(radio, 2);
    }
    
    public void calcularLongitud(float radio){
        this.longitud=2*Math.PI*radio;
    }
    
    public float getRadio(){
        return radio;
    }
    public double getArea(){
        return area;
    }
    public double getLongitud(){
        return longitud;
    }
}
