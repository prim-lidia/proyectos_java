/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.ex3;

/**
 *
 * @author lidia
 */
public class Conversor {
    /**
     * Longitud en pies
     */
    private float ft;
    /**
     * Resultado de la conversión
     */
    double result;
    /**
     * Modificar la longitud en pies
     * @param n longitud con decimales
     */
    public void setFt(float n){
        this.ft = n;
    }
    /**
     * Modificar el resultado
     * @param n longitud
     */
    public void setResult(double n){
        this.result=n;
    }
    /**
     * Calcula la conversion de pies a yardas
     * @return longitud en yardas
     */
    public double ftYd(){
        return ft/3;
    }
    
    /**
     * Calcula la conversion de pies a pulgadas
     * @return longitud en pulgadas
     */
    public double ftIn(){
        return ft*12;
    }
    /**
     * calcula la conversión de pies a centimetros
     * @return 
     */
    public double ftCm(){
        return ft*30.48;
    }
    /**
     * Devuelve el valor de la longitud en pies
     * @return longitud en pies
     */
    public float getFt(){
        return ft;
    }
    /**
     * Devuelve el resultado de la longitud convertida
     * @return longitud convertida
     */
    public double getResult(){
        return result;
    }
}

