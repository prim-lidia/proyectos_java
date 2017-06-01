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
    
    /**
     * Constructor por defecto para triangulo
     */
    public Triangulo(){
        this.base = 0;
        this.altura = 0;
        this.area=(base*altura)/2;
    }
    /**
     * Constructor triangulo  con parametros
     * @param base base del triangulo
     * @param altura atura del triangulo
     */
    public Triangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
        this.area=(base*altura)/2;
    }
    
    /**
     * Modifica la propiedad base con una longitud dada
     * @param base longitud de la base
     */
    public void setBase (float base){
        this.base = base;
    }
    /**
     * Modifica la propiedad altura con una longitud dada
     * @param altura longitud de la altura
     */
    public void setAltura(float altura){
        this.altura = altura;
    }
    /**
     * Modifica el area con una altura  base dadas
     * @param altura longitud de la altura
     * @param base longitud de la base
     */
    public void setArea (float altura, float base){
        this.area=(base*altura)/2;
    }
    
    /**
     * Devuelve la altura del trianuglo
     * @return altura del triangulo
     */
    public float getAltura(){
        return altura;
    }
    /**
     * Devuelde la base del tirangulo
     * @return base del trianuglo
     */
    public float getBase(){
        return base;
    }
    /**
     * Deveulve el area del triangulo
     * @return area del triangulo
     */
    public double getArea(){
        return area;
    }
}
