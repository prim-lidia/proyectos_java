/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica87;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author lidia
 */
public class Menu {
    public void mostrarMenu(){
        System.out.println("---------------------------------------------");
        System.out.println("MENU PRINCIPAL:");
        System.out.println("1.- Prestamo de ejemplar");
        System.out.println("2.- Devolución de ejemplar");
        System.out.println("3.- Mostrar datos libro");
        System.out.println("4.- Modificar datos del libro");
        System.out.println("5.- Salir del programa");
    }
    public void mostrarElegirLibro(){
        System.out.println("---------------------------------------------");
        System.out.println("ELECCIÓN LIBRO:");
        System.out.println("1.- El encanto");
        System.out.println("2.- Escrito en el agua");
        System.out.println("3.- Volver a atrás");
    }
    public void modificarDatos(){
        System.out.println("---------------------------------------------");
        System.out.println("DATO A MODIFICAR:");
        System.out.println("1.- Título");
        System.out.println("2.- Autor");
        System.out.println("3.- ISBN");
        System.out.println("4.- Nº ejemplares");
        System.out.println("5.- Volver atrás");
    }
    
    public String pedirString(){
        Scanner read= new Scanner(System.in);
        return read.nextLine();
    }
    public int pedirInt(){
        int aux;
        Scanner read= new Scanner(System.in);
        aux=read.nextInt();
        read.nextLine();
        return aux; 
    }
    public String pedirIsbn(){
        System.out.println("Isbn:");
        return pedirString();
    }
    public String pedirTitulo(){
        System.out.println("Titulo:");
        return pedirString();
    }
    public String pedirAutor(){
        System.out.println("Autor:");
        return pedirString();
    }
    
    public int pedirNumEjemp(){
        System.out.println("Nº ejemplares:");
        return pedirInt();
    }
    public void mostrarDatos(Libro libro){
        String estado;
        System.out.println("Título: "+libro.getTitulo());
        System.out.println("Autor: "+libro.getAutor());
        System.out.println("ISBN: "+libro.getIsbn());
        System.out.println("Nº ejemplares: "+libro.getEjemplares());

        System.out.print("Estado de los ejemplares: ");
        for(int i=0; i<libro.getPrestado().length;i++){
        estado=(libro.getPrestadoEj(i))? "Prestado" : "Disponible"; 
        System.out.print(estado+"\t");
        }  
        System.out.println();
    }
}
