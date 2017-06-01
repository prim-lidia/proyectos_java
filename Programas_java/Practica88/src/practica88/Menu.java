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
    static Scanner read= new Scanner(System.in);
    /**
     * Método que muestra por pantalla el menú incial
     */
    public void mostrarInicio(){
        System.out.println("---------------------------------------------");
        System.out.println("MENU INICIO:");
        System.out.println("1.- Añadir libro/s");
        System.out.println("2.- Añadir ejemplar/es de un libro");
        System.out.println("3.- Operaciones con libro/ejemplar");
        System.out.println("4.- Salir del programa");
    }
    /**
     * Método que muestra por pantalla el submenú operaciones
     */
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
    /**
     * Método que muestra por pantalla el submenú
     * para modificar datos del libro
     */
    public void modificarDatos(){
        System.out.println("---------------------------------------------");
        System.out.println("DATO A MODIFICAR:");
        System.out.println("1.- Título");
        System.out.println("2.- Autor");
        System.out.println("3.- Código Libro");
        System.out.println("4.- Ejemplar");
        System.out.println("5.- Volver atrás");
    }
    /**
     * Método que muestra por pantalla el submenú
     * para modificar datos del ejemplar
     */
    public void modificarDatosEjemplar(){
        System.out.println("---------------------------------------------");
        System.out.println("DATO A MODIFICAR:");
        System.out.println("1.- Codigo Ejemplar");
        System.out.println("2.- ISBN");
        System.out.println("3.- Volver al menú operaciones");
    }
    /**
     * Método que pregunta si se quiere introducir 
     * un ejemplar y devuelve la opción escogida
     * @return opción escogida
     */
    public String añadirEjemplar(){
        System.out.println("¿Quieres añadir ejemplar(S/N)?");
        return read.nextLine();
    }
    /**
     * Metodo que lee un string por teclado y lo devuelve
     * @return cadena de texto
     */
    public String pedirString(){
        return read.nextLine();
    }
    /**
     * Método que pregunta si se quiere introducir 
     * un libro y devuelve la opción escogida
     * @return cadena de texto
     */
    public String añadirLibro(){
        System.out.println("¿Has terminado de añadir libros(S/N)?");
        return read.nextLine();
    }
    /**
     * Método que pide por pantalla el título
     * y devuelve la cadena de texto introducida por teclado.
     * @return cadena de texto
     */
    public String pedirTitulo(){
        System.out.println("Título: ");
        return read.nextLine();
    }
    /**
     * Método que pide por pantalla el autor del libro
     * y devuelve la cadena de texto introducida por teclado.
     * @return cadena de texto
     */
    public String pedirAutor(){
        System.out.println("Autor: ");
        return read.nextLine();
    }
    /**
     * Método que pide por pantalla el código del libro
     * y devuelve la cadena de texto introducida por teclado.
     * @return cadena de texto
     */
    public String pedirCodLibro(){
        System.out.println("Código del libro: ");
        return read.nextLine();
    }
    /**
     * Método que pide por pantalla el código del ejemplar
     * y devuelve la cadena de texto introducida por teclado.
     * @return cadena de texto
     */
    public String pedirCodEjemplar(){
        System.out.println("Código del ejemplar: ");
        return read.nextLine();
    }
    /**
     * Método que pide por pantalla el ISBN
     * y devuelve la cadena de texto introducida por teclado.
     * @return cadena de texto
     */
    public String pedirIsbn(){
        System.out.println("ISBN: ");
        return read.nextLine();
    }
    
    /**
     * Método para recorrer el Listado de libros buscando coincidencia entre
     * un código de libro dado y los que hay almacenados en el listado.
     * si hay coincidencia devuelve el objeto libro y sino devuelve un objeto libro por defecto. 
     * @param codLibro dado por el usuario
     * @param biblioteca listado de objetos libro
     * @return objeto libro
     */
    public int buscarLibro(String codLibro, ArrayList<Libro> biblioteca){
        int index=-1;
        for (Libro libro : biblioteca) {
            if(libro.getCodLibro().equals(codLibro)){
                index=biblioteca.indexOf(libro);
            }
        }
        return index;
    }
    /**
     * Método para recorrer el Listado de ejemplares buscando coincidencia entre
     * un código de ejemplar dado y los que hay almacenados en el listado.
     * si hay coincidencia devuelve el objeto ejemplar y sino devuelve un objeto ejemplar por defecto. 
     * @param codEjemplar
     * @param ejemplares
     * @return objeto ejemplar
     */
    public int buscarEjemplar(String codEjemplar,ArrayList<Ejemplar> ejemplares){
        Ejemplar auxEjemplar;
        int index=-1;
        for (Ejemplar ejemplarX : ejemplares) {
            if(ejemplarX.getCodEj().equals(codEjemplar)){
                index=ejemplares.indexOf(ejemplarX);
            }
        }

        return index;
    }
    /**
     * Método que dado un objeto libro devuvle los datos de este libro por pantalla.
     * @param libro 
     */
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
