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
    private float ft;
    double result;
    public void setFt(float n){
        this.ft = n;
    }
    public void setResult(double n){
        this.result=n;
    }
    
    public double ftYd(){
        return ft/3;
    }
    
    public double ftIn(){
        return ft*12;
    }
    
    public double ftCm(){
        return ft*30.48;
    }
    
    public float getFt(){
        return ft;
    }
    public double getResult(){
        return result;
    }
}

