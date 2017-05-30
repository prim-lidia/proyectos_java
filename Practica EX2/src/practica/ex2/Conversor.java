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
    /**
     * Total de tiempo 
     */
    private int total;
    /**
     * Listado de unidad de tiempo en formato texto
     */
    private String[] texto;
    /**
     * Listado bidimensional del las unidades de tiempo. 
     * En el listado uno están el equivalente de la unidad de tiempo en segundos
     * En el segundo se guarda el resultado del desglose parar cada unidad de tiempo
     */
    private int[][]tiempo;
    
    /**
     * Constructor por defecto.
     * Incializa el listado con texto ("Semanas","Días","Horas","Minutos","Segundos")
     * Incializa el primer listado del listado bidimensional (604800,86400,3600,60,1)
     * 
     */
    public Conversor (){
        this.total=0;
        this.texto = new String[]{"Semanas","Días","Horas","Minutos","Segundos"};
        this.tiempo= new int[][]{{604800,86400,3600,60,1},{0,0,0,0,0}};
    }
    /**
     * Modifica el total de tiempo 
     * @param segundos cantidad de segundos del total de tiempo
     */
    public void setTotal(int segundos){
        this.total=segundos;
    }
    /**
     * Calcula y rellena el 2º listado del listado bidimensional.
     * Dividiendo el tiempo por la unidad de tiempo correspondiente
     * @param segundos cantidad de segundos del total de tiempo
     */
    public void setTiempo(int segundos){
        int auxSeg= segundos;
        for(int i= 0; i< tiempo[0].length; i++){
            tiempo[1][i]= auxSeg/tiempo[0][i];
            auxSeg=auxSeg%tiempo[0][i];
        } 
    }
    /**
     * Devuelve el total de tiempo
     * @return total de tiempo en segundos
     */
    public int getTotal(){
        return total;
    }
    /**
     * Devulve la longitud del listado texto
     * @return 
     */
    public int getLength(){
        return texto.length;
    }
    /**
     * Devuelve el valor [i] del listado texto
     * @param i indice del listado
     * @return Nombre de la uniad de tiempo
     */
    public String getTextoDesg (int i){
        return texto[i];
    }
    /**
     * Devuelve el valor [i] del 2º listado de tiempo 
     * donde están almacenados los resultados del desglose
     * @param i indice del listado
     * @return cantidad de la tiempo/unidad
     */
    public int getTiempoDesg(int i){
        int cantidad=tiempo[1][i];
        return cantidad;
    }
}
