/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica82;

/**
 *
 * @author lidia
 */
public class Desglosador {
    private int[] valorMon;
    private int[] cantidadMon;
    private int dinero;
    
    /* Constructor */
    Desglosador(){
    valorMon = new int[]{500,200,100,50,20,10,5,2,1};
    cantidadMon = new int[9];
    dinero=0;
    }
    
    /* Metodos set */
    public void setDinero(int n){
        this.dinero=n;
    }
    public void setCantidadMon(int dinero){
        for(int i=0; i<valorMon.length;i++){
        cantidadMon[i]=dinero/valorMon[i];
        dinero = dinero%valorMon[i];
        }
    }
    /* Metodos get */
    public int getDinero(){
        return dinero;
    }
    public int getValorIndex(int i){
        return valorMon[i];
    }
    public int getCantidadIndex(int i){
        return cantidadMon[i];
    }
    public int getLenghtArray(){
        return valorMon.length;
    }
    
    
}
