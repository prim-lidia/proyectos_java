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
    private float lado;
    private float apotema;
    private double area;
    
    /* Metodos set */
    public void setLado(float n){
        this.lado = n;
    }
    public void setApotema(float n){
        this.apotema = n;
    }
    public void setArea(){
        this.area=(5*lado*apotema)/2;
    }
    
    /* Metodos get */
    public float getLado(){
        return lado;
    }
    public float getApotema(){
        return apotema;
    }
    public double getArea(){
        return area;
    }
}
