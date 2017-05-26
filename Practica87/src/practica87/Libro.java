/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica87;

import java.util.ArrayList;

/**
 *
 * @author lidia
 */
public class Libro {  
    private String titulo, autor, isbn;
    private int ejemplares;
    private boolean[] prestado;
    /**
     * Constructor por defecto de la clase Libro
     */
    public Libro(){
        titulo="";
        autor="";
        isbn="";
        ejemplares=0;
        prestado=new boolean[ejemplares];
    }
    /**
     * Constructor con paŕametros de la clase Libro
     * asigna a las propiedasdes del objeto el valor de los parametros introducidos 
     * e inicializa el listado de estado de los ejemplares.
     * @param titulo título del libro
     * @param autor nombre y apllidos del autor del libro
     * @param isbn código ISBN del libro
     * @param ejemplares  número de ejmplares del libro
     */
    public Libro(String titulo, String autor, String isbn, int ejemplares){
        this.titulo=titulo;
        this.autor=autor;
        this.isbn=isbn;
        this.ejemplares=ejemplares;
        this.prestado= new boolean[ejemplares];
    }
    /**
     * Modifica el título del libro
     * @param titulo tñitulo del libro
     */
    public void setTitulo(String titulo){
        this.titulo=titulo;    
    }
    /**
     * Modifica el autor del libro
     * @param autor nombre y apllidos del autor del libro
     */
    public void setAutor(String autor){
        this.autor=autor;
    }
    /**
     * Modifica el código ISBN del libro
     * @param isbn código ISBN del libro
     */
    public void setIsbn(String isbn){
        this.isbn= isbn;
    }
    /**
     *Modifica el número de ejemplares del libro
     * @param n número de ejemplares del libro
     */
    public void setEjemplares(int n){
        this.ejemplares=n;
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
     * Devuelve el código ISBN del libro
     * @return código ISBN del libro
     */
    public String getIsbn(){
        return isbn;
    }
    /**
     * Devuelve el número de ejemplares del libro
     * @return número de ejemplares
     */
    public int getEjemplares(){
        return ejemplares;
    }
    /**
     * Devuelve el listado de estados de presatmo de los ejemplares
     * @return listado de estados de presatmo 
     */
    public boolean[] getPrestado(){
        return prestado;
    }
    /**
     * Devuelve el estados de presatmo del ejemplare que tiene
     * el indice i en el listado de ejemplares
     * @param i indice del listado
     * @return listado de estados de presatmo 
     */
    public boolean getPrestadoEj(int i){
        return prestado[i];
    }
    /**
     * Modifica el estado a prestado si hay algun ejemplar disponible en el listado,
     * sino muestra un mensaje de error
     */
    public void prestar(){
        boolean j=false; int i;
        for(i=0; i<prestado.length && j==false; i++){
            if(prestado[i]==false){
                this.prestado[i]=true;
                j=true;
            }
        }
        if(j==false){
            System.out.println("No se puede realizar el prestamo.\nTodos los ejemplares YA están prestados");
        }else{
            System.out.println("Prestamo realizado correctamente");
        }
    }
    /**
     * Modifica el estado a disponible si hay algun ejemplar prestado en el listado,
     * sino muestra un mensaje de error
     */
    public void devolver(){
        boolean j=false; int i;
        for(i=0; i<prestado.length && j==false; i++){
            if(prestado[i]==true){
                this.prestado[i]=false;
                j=true;
            }
        }
        if(j==false){
            System.out.println("No se puede realizar la devolución. n\\ No hay ningún ejemplar en prestamo");
        }else{
            System.out.println("Devolución realizado correctamente");
        }
    }
    
    
}
