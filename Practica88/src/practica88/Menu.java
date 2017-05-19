/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica88;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author lidia
 */
public class Menu {
    public void mostrarInicio(){
        System.out.println("---------------------------------------------");
        System.out.println("MENU INICIO:");
        System.out.println("1.- Añadir libro/s");
        System.out.println("2.- Añadir ejemplar/es de un libro");
        System.out.println("3.- Operaciones con libro/ejemplar");
        System.out.println("4.- Salir del programa");
    }
    public void mostrarMenu(){
        System.out.println("---------------------------------------------");
        System.out.println("MENU OPERACIONES:");
        System.out.println("1.- Prestamo de ejemplar");
        System.out.println("2.- Devolución de ejemplar");
        System.out.println("3.- Mostrar datos libro");
        System.out.println("4.- Modificar datos del libro");
        System.out.println("5.- Volver atrás");
        System.out.println("6.- Salir del programa");
    }
    public void modificarDatos(){
        System.out.println("---------------------------------------------");
        System.out.println("DATO A MODIFICAR:");
        System.out.println("1.- Título");
        System.out.println("2.- Autor");
        System.out.println("3.- Código Libro");
        System.out.println("4.- Ejemplar");
        System.out.println("5.- Volver atrás");
    }
    public void modificarDatosEjemplar(){
        System.out.println("---------------------------------------------");
        System.out.println("DATO A MODIFICAR:");
        System.out.println("1.- Codigo Ejemplar");
        System.out.println("2.- ISBN");
        System.out.println("3.- Volver al menú operaciones");
    }
    public String añadirEjemplar(){
        System.out.println("¿Quieres añadir ejemplar(S/N)?");
        return pedirString();
    }
    public String añadirLibro(){
        System.out.println("¿Has terminado de añadir libros(S/N)?");
        return pedirString();
    }
    public String pedirString(){
        Scanner read= new Scanner(System.in);
        return read.nextLine();
    }
    public String pedirTitulo(){
        System.out.println("Título: ");
        return pedirString();
    }
    public String pedirAutor(){
        System.out.println("Autor: ");
        return pedirString();
    }
    public String pedirCodLibro(){
        System.out.println("Código del libro: ");
        return pedirString();
    }
    public String pedirCodEjemplar(){
        System.out.println("Código del ejemplar: ");
        return pedirString();
    }
    public String pedirIsbn(){
        System.out.println("ISBN: ");
        return pedirString();
    }
    
    public Libro buscarLibro(String codLibro, ArrayList<Libro> biblioteca){
        Libro auxLibro;
        Libro libro=new Libro();
        for (Libro libros : biblioteca) {
            auxLibro=libros;
            if(auxLibro.getCodLibro().equals(codLibro)){
                libro=libros;
            }
        }
        return libro;
    }
    public Ejemplar buscarEjemplar(String codEjemplar,ArrayList<Ejemplar> ejemplares){
        Ejemplar auxEjemplar;
        Ejemplar ejemplar=new Ejemplar();
        Libro auxLibro;
        for (Ejemplar ejemplarX : ejemplares) {
            auxEjemplar=ejemplarX;
            if(auxEjemplar.getCodEj().equals(codEjemplar)){
                ejemplar=ejemplarX;
            }
        }

        return ejemplar;
    }
    public void mostrarDatos(Libro libro){
        Ejemplar ejemplar= new Ejemplar();
        System.out.println("Codigo Libro: "+libro.getCodLibro());
        System.out.println("Título: "+libro.getTitulo());
        System.out.println("Autor: "+libro.getAutor());
        System.out.println("\tEjemplares: ");
        for(int i=0; i<libro.getEjemplares().size();i++){
            ejemplar=libro.getEjemplar(i);
            System.out.print("\t"+ejemplar.getCodEj()+": ");
            System.out.print("(ISBN:"+ejemplar.getIsbn()+") ");
            if(ejemplar.getPrestado()==false){
                System.out.print("DISPONBLE");
            }else{
                System.out.print("PRESTADO");
            }
            System.out.println(); 
        }
    }
}
