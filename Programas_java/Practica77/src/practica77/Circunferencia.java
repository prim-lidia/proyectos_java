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
    /**
     * Radio de la Circunferencia
     */
    float radio;
    /**
     * Area de la Circunferencia
     */
    double area;
    /**
     * Longitud de la Circunferencia
     */
    double longitud;    
    /**
     * Modifica el radio de la Circunferencia con el parámetro radio introducido
     * @param radio radio de la circunferencia
     */
    public void setRadio(float radio){
        this.radio=radio;
    }
    /**
     * Modifica el área de la Circunferencia con la operción pertienente
     * utilizando la propiedad radio
     */
    public void calcularArea(){
        this.area=Math.PI*Math.pow(radio, 2);
    }
    /**
     * Modifica la longitud de la Circunferencia con la operción pertienente
     * utilizando la propiedad radio
     */
    public void calcularLongitud(){
        this.longitud=2*Math.PI*radio;
    }
    /**
     * Devuelve el radio de la Circunferencia
     * @return radio de la circunferencia
     */
    public float getRadio(){
        return radio;
    }
    /**
     * Devuelve el área de la Circunferencia
     * @return área de la circunferencia
     */
    public double getArea(){
        return area;
    }
    /**
     * Devuelve la longitud de la Circunferencia
     * @return longitud de la circunferencia
     */
    public double getLongitud(){
        return longitud;
    }
}
