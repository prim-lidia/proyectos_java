/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica81;

/**
 *
 * @author lidia
 */
public class Esfera {
    private float radio;
    private double area;
    private double volumen;
    
    /* Metodos set */
    public void setRadio(float n){
        this.radio=n;
    }
    public void setArea(){
        this.area=4*Math.PI*Math.pow(radio,2);
    }
    public void setVolumen(){
        this.volumen=4*Math.PI*Math.pow(radio,3)/3;
    }
    
    /* Metodos get */
    public float getRadio(){
        return radio;
    }
    public double getArea(){
        return area;
    }
    public double getVolumen(){
        return volumen;
    }
}
