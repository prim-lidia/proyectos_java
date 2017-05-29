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
    /**
     * Título del libro
     */
    private String titulo;
    /**
     * Nombre y apellidos del autor del libro
     */
    private String autor;
    /**
     * Código de identificación del libro
     */
    private String codLibro;
    /**
     * listado de objetos Ejemplar
     */
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
     * @param titulo título del libro
     * @param autor nombre y apellidos del autor del libro
     * @param codLibro código de identificación del libro
     * @param ejemplares listado de objetos Ejemplar
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
     * Modifica el título del libro
     * @param titulo título del libro
     */
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    /**
     * Modifica el autor del libro
     * @param autor nombre y apellidos del autor del libro
     */
    public void setAutor(String autor){
        this.autor=autor;
    }
    /**
     * Modifica el código de identificación del libro
     * @param codLibro código de identificación del libro
     */
    public void setCodLibro(String codLibro){
        this.codLibro=codLibro;
    }
    /**
     * Añade un ejemplar al ArrayList de ejemplares.
     * El ejemplar añadido será introducido como parámetro
     * @param ejemplar del libro a añadir
     */
    public void setEjemplaresList(Ejemplar ejemplar){
        ejemplares.add(ejemplar);    
    }
    /**
     * Quita un ejemplar al ArrayList de ejemplares.
     * El ejemplar quitado será introducido como parámetro
     * @param ejemplar del libro a quitar
     */
    public void quitEjemplarOfList(Ejemplar ejemplar){
        ejemplares.remove(ejemplar);
    }
    /**
     * Limpia el ArrayList de ejemplares.
     */
    public void clearEjemplaresList(){
        ejemplares.clear();
    }
    
    /**
     * Devuelve el título del libro
     * @return título del libro
     */
    public String getTitulo(){
        return titulo;
    }
    /**
     * Devuelve el nombre del autor del libro
     * @return nombre y apellidos del autor
     */
    public String getAutor(){
        return autor;
    }
    /**
     * Devuelve el código de identificación del libro
     * @return código de identificación del libro
     */
    public String getCodLibro(){
        return codLibro;
    }
    /**
     * Devuelve el ArrayList de los ejemplares del libro
     * @return  Listado de los ejemplares del libro
     */
    public ArrayList<Ejemplar> getEjemplares(){
        return ejemplares;
    }
    /**
     * Devuelve el ejemplar del ArrayList de ejemplares
     * que ocupa la posición i
     * @param i posición del ejemplar en el ArrayList
     * @return ejemplar del libro
     */
    public Ejemplar getEjemplar(int i){
        return ejemplares.get(i);
    }
    
}
