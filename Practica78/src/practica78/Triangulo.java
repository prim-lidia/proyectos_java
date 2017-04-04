/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica78;

/**
 *
 * @author lidia
 */
public class Triangulo {
    private float altura;
    private float base;
    private double area;
    
    /* Constructor triangulo */
    public Triangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
        this.area=(base*altura)/2;
    }
    public Triangulo(){
        this.base = 0;
        this.altura = 0;
        this.area=(base*altura)/2;
    }
    
    /* Setters triangulo */
    public void setBase (float base){
        this.base = base;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    public void setArea (float altura, float base){
        this.area=(base*altura)/2;
    }
    
    /* getters triangulo */
    public float getAltura(){
        return altura;
    }
    public float getBase(){
        return base;
    }
    public double getArea(){
        return area;
    }
}
