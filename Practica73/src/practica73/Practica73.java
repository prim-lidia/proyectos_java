/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica73;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.Scanner;

/**
 *
 * @author lidia
 */
public class Practica73 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Declarar variables*/
        String tarea="";
        ArrayList<String> ciudades= new ArrayList<String>();
        
        Scanner teclado= new Scanner(System.in); //Entrada teclado
        
        while(!tarea.equals("6")){
            mostrarMenu();
            /* Leer la tarea */
            System.out.println("Tarea a realizar:");
            tarea=pedirString();
            
            switch(tarea){
                
                case "1": //Añadir ciudad
                    añadirCiudad(ciudades);
                    break;
                    
                case "2": //Borrar ciudad 
                    borrarCiudad(ciudades);
                    break;
                    
                case "3": //Editar ciudad
                    editarCiudad(ciudades);
                    break;
                    
                case "4": //Mostrar ciudad concreta
                    mostrarCiudad(ciudades);
                    break;
                    
                case "5": //Mostrar ArrayList
                    if(ciudades.isEmpty()==true){
                        System.out.println("El listado está vacio");
                    }else{
                        System.out.println(ciudades);
                    }
                    break;
                    
                case "6": //Finalizar programa
                    break;
                    
                default: //Mesnaje de error
                    System.out.println("Tarea inexistente");
                    break;    
            }
            System.out.println();
        }
    }
    public static void mostrarMenu(){
        
        System.out.println("Menú: ");
        System.out.println("1 - Añadir Ciudad");
        System.out.println("2 - Borrar Ciudad");
        System.out.println("3 - Editar Ciudad");
        System.out.println("4 - Mostrar Ciudad");
        System.out.println("5 - Mostrar Listado ciudades");
        System.out.println("6 - Finalizar programa");
        
    }
    
    public static String pedirString(){
        Scanner teclado= new Scanner(System.in);//Entrada teclado
        
        return teclado.nextLine(); //Lectura teclado
    }
    
    public static int pedirInt(){
        int num;
        Scanner teclado= new Scanner(System.in);//Entrada teclado
        num= teclado.nextInt();//Lectura teclado
        teclado.nextLine();
        
        return  num;
    }

    public static boolean validarCiudadPatron(String x){
        boolean valido;  
        /* Expresión regular para una ciudad*/
        String patron= "^([A-ZÑÁ-Ú][a-zñá-ú]*([\\s\\-][A-ZÑÁ-Ú]?[a-zñá-ú]+)*)$";
        valido = Pattern.matches(patron, x);
        
        return valido;      
    }
    
    public static boolean mirarRepetida(String x, ArrayList<String> y){
        boolean repetido; 
        repetido=y.contains(x);
        
        return repetido;
    }
    
    public static ArrayList<String> añadirCiudad(ArrayList<String> x){
        String ciudad;
        System.out.println("Dime una ciudad");
        ciudad=pedirString();
        while(validarCiudadPatron(ciudad)==false){
            System.out.println("Sintaxis incorrecta");
            System.out.println("introudce de nuevo la ciudad");
            ciudad=pedirString();
        }
        if (mirarRepetida(ciudad,x)==true){
            System.out.println("No se puede introducir. Ciudad Repetida");
        }else{
            x.add(ciudad);
        }
      
        return x;   
    }
    
    public static void mostrarBorrar(ArrayList<String> x, String y){
        /*Mostrar mensaje de borrado*/
        if(Pattern.matches("\\d+", y)==true && Integer.parseInt(y)<x.size()){
            System.out.println("Ciudad borrada: "+x.get(Integer.parseInt(y)));
        }else if(x.contains(y)==true){
            System.out.println(y+" ha sido borrada");
        }else{
            System.out.println("La ciudad no existe en el listado o está fuera de rango");
        }
    }
    
    public static ArrayList<String> borrarCiudad(ArrayList<String> x){
        String ciudad;
        
        if(x.isEmpty()==true){
             System.out.println("El listado está vacio");
        }else{
            System.out.println("Ciudad que quieres borrar:");
            ciudad=pedirString();//Lectura ciudad
                    
            mostrarBorrar(x,ciudad);
                    
            /*Borrar ciudad*/
            x.remove(ciudad);
        }
        
        return x;
    }
    
    public static ArrayList<String> editarCiudad(ArrayList<String> x){ 
        String ciudad;
        int indice;
        
        if(x.isEmpty()==true){
            System.out.println("El listado está vacio");
        }else{
            System.out.println("Ciudad que quieres editar(posicion):");
            indice=pedirInt();//Lectura ciudad
            if(indice<x.size() && indice>=0){
                System.out.println("Ciudad por la que la quieres cambiar:");
                ciudad=pedirString();
                x.set(indice,ciudad);//Metodo para hcer el cambio
            }else{
                System.out.println("Posición fuera de rango");
            }
        }

        return x;
    }
    
    public static void mostrarCiudad(ArrayList<String> x){
        int indice;
        
        if(x.isEmpty()==true){
            System.out.println("El listado está vacio");
         }else{
            System.out.println("Ciudad que quieres ver(posicion):");
            indice=pedirInt();//Lectura ciudadro
            if(indice<x.size()){
                System.out.println(x.get(indice));
            }else{
                System.out.println("posición fuera de rango");
            }

        }
    }
    
}
