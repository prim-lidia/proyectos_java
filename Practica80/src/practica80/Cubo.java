/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica80;

/**
 *
 * @author lidia
 */
public class Cubo {
    /**
     * Arista del cubo
     */
    private float arista;
    /**
     * Area del cubo
     */
    private double area;
    
    /**
     * Modifica la arista del cubo
     * @param arista longitud del la arista
     */
    public void setArista(float arista){
        this.arista=arista;
    }
    /**
     * Modifica el area del cubo con su calculo
     */
    public void setArea(){
        this.area=Math.pow(arista,2)*6;
    }
    
    /**
     * Devuelve la arisa del cubo
     * @return arista del cubo
     */
    public float getArista(){
        return arista;
    }
    /**
     * Devuelve el area del cubo
     * @return area del cubo
     */
    public double getArea(){
        return area;
    }
}

