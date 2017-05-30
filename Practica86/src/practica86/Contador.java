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
     * Incrementa sumando el contador con el valor de la variación
     * @param variacion valor de incremento
     */
    public void incrementarSuma(float variacion){
        contador+=variacion;
    }
    /**
     * Incrementa multiplicando el contador con el valor de la variación
     * @param variacion valor de incremento
     */
    public void incrementarMult(float variacion){
        contador*=variacion;
    }
    /**
     * Decrementa restando el contador con el valor de la variación 
     * @param variacion valor de decremento
     */
    public void decrementarResta(float variacion){
        contador-=variacion;
    }
    /**
     * Decrementa dividiendo el contador con el valor de la variación 
     * @param variacion valor de decremento
     */
    public void decrementarDiv(float variacion){
        contador/=variacion;
    }
    /**
     * Modicfica el valor del contador asignandole el valor introducido como parámtero 
     * @param contador valor para modificar el contador
     */
    public void setContador(float contador){
        this.contador=contador;
    }
    /**
     * Devuelve el valor del contador
     * @return contador
     */
    public float getContador(){
        return contador;
    } 
    
}
