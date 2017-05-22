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
    private String codEjemplar, isbn;
    private boolean prestado;
    
    public Ejemplar(){
        codEjemplar="";
    }
    public void setIsbn(String isbn){
        this.isbn= isbn;
    }
    public void setCodEj(String codigo){
        this.codEjemplar= codigo;
    }
    public void setPrest(boolean prestado){
        this.prestado= prestado;
    }
    public String getCodEj(){
        return codEjemplar;
    }
    public String getIsbn(){
        return isbn;
    }
    public boolean getPrestado(){
        return prestado;
    }
    public void prestar(){
        if(prestado==false){
            this.prestado=true;
        }else{
            System.out.println("No se puede realizar la opreación. n\\El ejemplar YA está prestado");
        }
    }
    public void devolver(){
        if(prestado==true){
            this.prestado=false;
        }else{
            System.out.println("El ejemplar NO había sido prestado");
        }
    }
}
