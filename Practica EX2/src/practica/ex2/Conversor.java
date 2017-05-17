/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.ex2;

/**
 *
 * @author lidia
 */
public class Conversor {
    private int total;
    private String[] texto;
    private int[][]tiempo;
    
    public Conversor (){
        this.total=0;
        this.texto = new String[]{"Semanas","Días","Horas","Minutos","Segundos"};
        this.tiempo= new int[][]{{604800,86400,3600,60,1},{0,0,0,0,0}};
    }
    
    public void setTotal(int segundos){
        this.total=segundos;
    }
    public void setTiempo(int segundos){
        int auxSeg= segundos;
        for(int i= 0; i< tiempo[0].length; i++){
            tiempo[1][i]= auxSeg/tiempo[0][i];
            auxSeg=auxSeg%tiempo[0][i];
        } 
    }
    public int getTotal(){
        return total;
    }
    public int getLength(){
        return texto.length;
    }
    
    public String getTextoDesg (int i){
        return texto[i];
    }
    
    public int getTiempoDesg(int i){
        int cantidad=tiempo[1][i];
        return cantidad;
    }
}
