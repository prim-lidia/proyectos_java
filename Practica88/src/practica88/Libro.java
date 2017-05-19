/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica88;
import java.util.ArrayList;
/**
 *
 * @author lidia
 */
public class Libro {
    private String titulo, autor,codLibro;
    private ArrayList<Ejemplar> ejemplares;
    
    //Constructores
    public Libro(){
        this.ejemplares= new ArrayList<>();
    }
    public Libro(String titulo, String autor, String codLibro, ArrayList<Ejemplar> ejemplares){
        this.titulo= titulo;
        this.autor= autor;
        this.codLibro=codLibro;
        this.ejemplares=ejemplares;
    }
    public Libro(Libro libro){
        this.titulo=libro.titulo;
        this.autor=libro.autor;
        this.codLibro=libro.codLibro;
        this.ejemplares=libro.ejemplares;
    }
    
    /*Metodos set*/
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public void setCodLibro(String codLibro){
        this.codLibro=codLibro;
    }
    public void setEjemplaresList(Ejemplar ejemplar){
        ejemplares.add(ejemplar);    
    }
    public void quitEjemplarOfList(Ejemplar ejemplar){
        ejemplares.remove(ejemplar);
    }
    public void clearEjemplaresList(){
        ejemplares.clear();
    }
    
    /* Metodos get*/
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public String getCodLibro(){
        return codLibro;
    }
    public ArrayList<Ejemplar> getEjemplares(){
        return ejemplares;
    }
    public Ejemplar getEjemplar(int i){
        return ejemplares.get(i);
    }
    
}
