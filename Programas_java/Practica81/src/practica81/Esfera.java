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
    /**
     * Radio de la esfera
     */
    private float radio;
    /**
     * Area de la esfera
     */
    private double area;
    /**
     * Volumen de la esfera
     */
    private double volumen;
    
    /**
     * Modifica el radio de la esfera
     * @param n logitud del radio
     */
    public void setRadio(float n){
        this.radio=n;
    }
    /**
     * Calcula y modifica el area de la esfera
     */
    public void setArea(){
        this.area=4*Math.PI*Math.pow(radio,2);
    }
    /**
     * Calcula y modifica el volumen de la esfera
     */
    public void setVolumen(){
        this.volumen=4*Math.PI*Math.pow(radio,3)/3;
    }
    /**
     * Devuelve el radio de la esfera
     * @return radio 
     */
    public float getRadio(){
        return radio;
    }
    /**
     * Devuelve el area de la esfera
     * @return area
     */
    public double getArea(){
        return area;
    }
    /**
     * Devuelve el volumen de la esfera
     * @return volumen
     */
    public double getVolumen(){
        return volumen;
    }
}
