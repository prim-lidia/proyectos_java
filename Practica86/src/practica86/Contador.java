/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica86;

/**
 *
 * @author lidia
 */
public class Contador {
    private float contador;
    
    /**
     * Constructor por defecto
     */
    public Contador(){
        contador=0;
    }
    /**
     * Constructor de la clase Contador donde incializar las propiedades contador y variacion 
     * introducciones los valores respectivos mediante parametros
     * @param contador
     * @param variacion 
     */
    public Contador(float contador){
        this.contador=contador;
    }
    
    /**
     * Metodo para incrementar el valor del contador 
     * @param variacion
     */
    public void incrementarSuma(float variacion){
        contador+=variacion;
    }
    public void incrementarMult(float variacion){
        contador*=variacion;
    }
    public void decrementarResta(float variacion){
        contador-=variacion;
    }
    public void decrementarDiv(float variacion){
        contador/=variacion;
    }
    
    public void setContador(float contador){
        this.contador=contador;
    }

    public float getContador(){
        return contador;
    } 
    
}
