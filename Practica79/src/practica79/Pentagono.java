/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica79;

/**
 *
 * @author lidia
 */
public class Pentagono {
    private float arista;
    private float apotema;
    private double area;
    
    /* Setters Pentagono */
    public void setArista(float n){
        this.arista = n;
    }
    public void setApotema(float n){
        this.apotema = n;
    }
    public void setArea(float arista, float apotema){
        this.area = (5*arista*apotema)/2;
    }
    /* Getters Pentagono */
    public float getArista(){
        return arista;
    }
    public float getApotema(){
        return apotema;
    }
    public double getArea(){
        return area;
    }
}
