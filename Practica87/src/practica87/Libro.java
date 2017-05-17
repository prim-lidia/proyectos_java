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
    //Crea una clase libro con metodos, prestamo, devolución. Metodos setter y getter
    //Porpiedades titulo, autor, ejemplares, isbn, prestado.
    
    private String titulo, autor, isbn;
    private int ejemplares;
    private boolean[] prestado;
    
    public Libro(){
        titulo="";
        autor="";
        isbn="";
        ejemplares=0;
        prestado=new boolean[ejemplares];
    }
    
    public Libro(String titulo, String autor, String isbn, int ejemplares){
        this.titulo=titulo;
        this.autor=autor;
        this.isbn=isbn;
        this.ejemplares=ejemplares;
        this.prestado= new boolean[ejemplares];
    }
    /*Metodos set */
    public void setTitulo(String titulo){
        this.titulo=titulo;    
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public void setIsbn(String isbn){
        this.isbn= isbn;
    }
    public void setEjemplares(int n){
        this.ejemplares=n;
    }
    public void setPrest(boolean prestado, int ejemplar){
        this.prestado[ejemplar]= prestado;
    }
    /* metodos get*/
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public String getIsbn(){
        return isbn;
    }
    public int getEjemplares(){
        return ejemplares;
    }
    public boolean[] getPrestado(){
        return prestado;
    }
    public boolean getPrestadoEj(int i){
        return prestado[i];
    }
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
