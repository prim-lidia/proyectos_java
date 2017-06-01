/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica74;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author lidia
 */
public class Practica74 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> list_hab= new ArrayList<Integer>();
        int tarea;
        tarea=0;
        
        Scanner teclado= new Scanner(System.in); //Entrada teclado
        
        while(tarea!=6){
            mostrarMenu();
            /* Leer la tarea */
            System.out.println("Tarea a realizar:");
            tarea=pedirInt();
            
            switch(tarea){
                case 1: //Añadir habitantes
                    añadirHabitantes(list_hab);
                    break;
                
                case 2: //Borrar habitantes
                    borrarHabitantes(list_hab);
                    break;
                
                case 3: //Editar habitantes
                    editarHabitantes(list_hab);
                    break;
               
                case 4: //Mostrar habitantes indice concreto
                    mostrarHabitantes(list_hab);
                    break;
                
                case 5: //Mostrar listado completo
                    if(list_hab.isEmpty()==true){
                        System.out.println("El listado está vacio");
                    }else{
                        System.out.println(list_hab);
                    }
                    break;
               
                case 6: //Finalizar
                    break;
                
                default: //Mensaje de error
                    System.out.println("Tarea inexistente");
                    break;
            }
            System.out.println();
        }
    }
    
    public static void mostrarMenu(){
        
        System.out.println("Menú: ");
        System.out.println("1 - Añadir habitantes");
        System.out.println("2 - Borrar habitantes");
        System.out.println("3 - Editar habitantes");
        System.out.println("4 - Mostrar habitantes");
        System.out.println("5 - Mostrar Listado habitantes");
        System.out.println("6 - Finalizar programa");
        
    }
    public static int pedirInt(){
        Scanner teclado= new Scanner(System.in); //Entrada teclado
        
        int num=teclado.nextInt();
        teclado.nextLine(); //Limpiar el intro
        
        return num;
    }
    
    public static boolean validarHabitantes(int x){
        boolean valido=false;
        
        if(x>0){ //Serán validos los números positivos
            valido=true;
        }
        
        return valido;
    }
    
    public static ArrayList<Integer> añadirHabitantes(ArrayList<Integer> x){
        int habitantes;
        System.out.println("Añadir habitantes de la ciudad "+x.size()+":");
        habitantes=pedirInt();
        if(validarHabitantes(habitantes)==true){
            x.add(habitantes);
        }else{
            System.out.println("Número de habitantes no válido");
        }
        
        return x;
    }
    
    public static ArrayList<Integer> borrarHabitantes(ArrayList<Integer> x){
        int indice;
        
        if(x.isEmpty()==true){
             System.out.println("El listado está vacio");
        }else{
            System.out.println("Posición del listado que quieres borrar:");
            indice=pedirInt();
            
            if(indice<x.size()&& indice>=0){
                System.out.println("Valor borrado: "+x.get(indice));
                x.remove(indice); //Metodo para borrar 
            }else{
                System.out.println("Indice fuera de rango");
            }
        }
        
        return x;  
    }
    
    public static ArrayList<Integer> editarHabitantes(ArrayList<Integer> x){
        int indice, habitantes;
        
        if(x.isEmpty()==true){
             System.out.println("El listado está vacio");
        }else{
            System.out.println("Posición del listado que quieres editar:");
            indice=pedirInt();
            
            if(indice<x.size()&& indice>=0){
                System.out.println("Valor a editar: "+x.get(indice));
                System.out.println("Valor por el que quieres cambiar:");
                habitantes=pedirInt(); //Pedir nº de habitantes
                x.set(indice, habitantes); //Metodo para borrar 
            }else{
                System.out.println("Indice fuera de rango");
            }
        }
        
        return x; 
    }
    
    public static void mostrarHabitantes(ArrayList<Integer> x){
        int indice;
        
        if(x.isEmpty()==true){
             System.out.println("El listado está vacio");
        }else{
            System.out.println("Posición del listado que quieres borrar:");
            indice=pedirInt();
            
            if(indice<x.size()&& indice>=0){
                System.out.println("Nº habitantes: "+x.get(indice));
            }else{
                System.out.println("Indice fuera de rango");
            }
        }
    }
    
    
}
