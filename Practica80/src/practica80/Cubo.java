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

    private float arista;
    private double area;
    
    /* Metodos Set */
    public void setArista(float arista){
        this.arista=arista;
    }
    public void setArea(){
        this.area=Math.pow(arista,2)*6;
    }
    
    /* Metodos Get */
    public float getArista(){
        return arista;
    }
    public double getArea(){
        return area;
    }
}

