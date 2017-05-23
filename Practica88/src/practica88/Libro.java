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
    
    /**
     * Constructor por defecto de la clase Libro
     * Inicializa la propiedad codLibro a una cadena vacia
     * y también inicializa el ArrayList que contendrá sus ejemplares
     */
    public Libro(){
        codLibro="";
        this.ejemplares= new ArrayList<>();
    }
    /**
     * Constructor con paŕametros de la clase Libro
     * asigna a las propiedasdes del objeto el valor
     * de los parametros introducidos
     * @param titulo
     * @param autor
     * @param codLibro
     * @param ejemplares 
     */
    public Libro(String titulo, String autor, String codLibro, ArrayList<Ejemplar> ejemplares){
        this.titulo= titulo;
        this.autor= autor;
        this.codLibro=codLibro;
        this.ejemplares=ejemplares;
    }
    /**
     * Constructor copia, crea una nuevo objeto con las mismas
     * propiedasdes que el objeto Libro introducido como parametro
     * @param libro 
     */
    public Libro(Libro libro){
        this.titulo=libro.titulo;
        this.autor=libro.autor;
        this.codLibro=libro.codLibro;
        this.ejemplares=libro.ejemplares;
    }
    
    /**
     * Método que modifica el título del libro
     * @param titulo 
     */
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    /**
     * Método que modifica el autor del libro
     * @param autor 
     */
    public void setAutor(String autor){
        this.autor=autor;
    }
    /**
     * Método que modifica el cdóigo de identificación del libro
     * @param codLibro 
     */
    public void setCodLibro(String codLibro){
        this.codLibro=codLibro;
    }
    /**
     * Método para añadir un ejemplar al ArrayList de ejemplares.
     * El ejemplar añadido será introducido como parámetro
     * @param ejemplar del libro a añadir
     */
    public void setEjemplaresList(Ejemplar ejemplar){
        ejemplares.add(ejemplar);    
    }
    /**
     * Método para quitar un ejemplar al ArrayList de ejemplares.
     * El ejemplar quitado será introducido como parámetro
     * @param ejemplar del libro a quitar
     */
    public void quitEjemplarOfList(Ejemplar ejemplar){
        ejemplares.remove(ejemplar);
    }
    /**
     * Método para limpiar el ArrayList de ejemplares.
     */
    public void clearEjemplaresList(){
        ejemplares.clear();
    }
    
    /**
     * El método devuelve el título del libro
     * @return título del libro
     */
    public String getTitulo(){
        return titulo;
    }
    /**
     * El método devuelve el nombre del autor del libro
     * @return 
     */
    public String getAutor(){
        return autor;
    }
    /**
     * El método devuelve el código de identificación del libro
     * @return 
     */
    public String getCodLibro(){
        return codLibro;
    }
    /**
     * El método devuelve el ArrayList de los ejemplares del libro
     * @return  Listado de los ejemplares del libro
     */
    public ArrayList<Ejemplar> getEjemplares(){
        return ejemplares;
    }
    /**
     * El método devuelve el ejemplar del ArrayList de ejemplares
     * que ocupa la posición i
     * @param i posición del ejemplar en el ArrayList
     * @return ejemplar del libro
     */
    public Ejemplar getEjemplar(int i){
        return ejemplares.get(i);
    }
    
}
