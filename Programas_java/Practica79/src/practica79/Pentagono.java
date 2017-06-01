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
    /**
     * Longitud del lado del pentagono
     */
    private float lado;
    /**
     * Longitud del apotema del pentagono
     */
    private float apotema;
    /**
     * Area del pentagono
     */
    private double area;
    
    /**
     * Modifica el lado del pentagono
     * @param n longitud del lado
     */
    public void setLado(float n){
        this.lado = n;
    }
    /**
     * Modifica el apotema del pentagono
     * @param n longitud del apotema
     */
    public void setApotema(float n){
        this.apotema = n;
    }
    /**
     * Modifica el area del pentagono con el calculandola
     */
    public void setArea(){
        this.area=(5*lado*apotema)/2;
    }
    
    /**
     * Devuelve el lado del pentagono
     * @return longitud del lado
     */
    public float getLado(){
        return lado;
    }
    /**
     * Devuelve el apotema del pentagòno
     * @return longitud del apotema
     */
    public float getApotema(){
        return apotema;
    }
    /**
     * Devuelve el area del pentagon
     * @return area del pentagono
     */
    public double getArea(){
        return area;
    }
}
