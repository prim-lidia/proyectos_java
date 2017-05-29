/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica88;

/**
 *
 * @author lidia
 */
public class Ejemplar {
    /**
     * Codigo del ejemplar
     */
    private String codEjemplar;
    /**
     * Código isbn del ejemplar
     */
    private String isbn;
    /**
     * Estado de prestamo del ejemplar (true=prestado, false=disponible)
     */
    private boolean prestado;
    /**
     * Constructor por defecto para Ejemplar.
     * Solo inicializamos el codEjmeplar, porque es necesario para otras clases;
     */
    public Ejemplar(){
        codEjemplar="";
    }
    /**
     * Modifica el ISBN del ejemplar
     * @param isbn 
     */
    public void setIsbn(String isbn){
        this.isbn= isbn;
    }
    /**
     * Modifica el codigo del ejemplar
     * @param codigo 
     */
    public void setCodEj(String codigo){
        this.codEjemplar= codigo;
    }
    /**
     * Modifica el estado de prestamo del libro.
     * @param prestado 
     */
    public void setPrest(boolean prestado){
        this.prestado= prestado;
    }
    /**
     * El método devuelve el código del ejemplar
     * @return Codigo del ejemplar
     */
    public String getCodEj(){
        return codEjemplar;
    }
    /**
     * El método devuelve el ISBN del ejemplar
     * @return ISBN del ejemplar
     */
    public String getIsbn(){
        return isbn;
    }
    /**
     * El método devuelve el estado de prestamo del ejemplar
     * @return estado de prestamo del ejemplar (true-false)
     */
    public boolean getPrestado(){
        return prestado;
    }
    /**
     * El método cambia el estado de prestamos del ejemplar.
     * Si el estado es false(disponible), cambia el estado.
     * Si es estado es true (ya está prestado) no cambia el estado y
     * muestra un mesaje de error.
     */
    public void prestar(){
        if(prestado==false){
            this.prestado=true;
        }else{
            System.out.println("No se puede realizar la operación. n\\El ejemplar YA está prestado");
        }
    }
    /**
     * El método cambia el estado de prestamos del ejemplar.
     * Si el estado es true(prestado), cambia el estado a false (disponible).
     * Si es estado es false (disponible) no cambia el estado y
     * muestra un mesaje de error.
     */
    public void devolver(){
        if(prestado==true){
            this.prestado=false;
        }else{
            System.out.println("El ejemplar NO había sido prestado");
        }
    }
}
