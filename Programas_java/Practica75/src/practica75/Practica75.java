/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import java.util.Scanner;

/**
 *
 * @author lidia
 */
public class Practica75 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> ciudades= new ArrayList<String>();
        ArrayList<Integer> list_hab= new ArrayList<Integer>();
        String tarea="", tarea2="", auxIndice;
        
        Scanner teclado= new Scanner(System.in); //Entrada teclado
        
        while(!tarea.equals("6")){
            mostrarMenu();
            /* Leer la tarea */
            System.out.println("Tarea a realizar:");
            tarea=pedirString();
            
            switch(tarea){
                case "1": //Añadir ciudad
                    añadirCiudad(ciudades);                    
                    while(ciudades.size()>list_hab.size()){
                        añadirHabitantes(list_hab);
                    }
                    break;
                 
                case "2": //Borrar ciudad
                    borrarCiudad (ciudades, list_hab);
                    break;
                
                case "3": //Editar ciudad
                    if(ciudades.isEmpty()==true){
                        System.out.println("El listado está vacio");
                    }else{
                        mostrarMenuEditar();
                        tarea2=pedirString();
                        int indice=-1;//Reinicializar indice por si ha sido utilizado
                        auxIndice="";
                        while(tarea!="C" && tarea!="c" && tarea!="H" && tarea!="h"){
                            switch (tarea2){
                                case "C": case "c": //Editar ciudad
                                    System.out.println("Ciudad que quieres editar(posicion):");
                                    auxIndice=pedirString();//Lectura indice
                                    indice=pasarInt(auxIndice); //Cambio a int
                                    if(indice!=-1){
                                        tarea2=editarCiudad(ciudades, indice);
                                    }
                                break;
                            
                                case "H": case "h": //Editar habitantes
                                    if(indice==-1){
                                        System.out.println("Ciudad que quieres editar(posicion):");
                                        auxIndice=pedirString();//Lectura indice
                                        indice=pasarInt(auxIndice); //Cambio a int
                                    }
                                    editarHabitantes(list_hab, indice);
                                    tarea2="0";
                                break;
                            }
                        }
                    }
                    break;
                 
                case "4": //Mostrar ciudad
                    mostrarCiudad(ciudades, list_hab);    
                    break;
                    
                case "5":
                    mostrarListadosCombinados(ciudades, list_hab);
                    break;
                    
                case "6":
                    break;
                    
                default:
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
    
    public static int pasarInt(String x){
        int num=-1;  
        String patron= "\\d+";
        boolean cumplePatron=Pattern.matches(patron, x);
        
        while(cumplePatron=false){
            System.out.println("Los datos introducidos no son numeros enteros");
            System.out.println("Vuelve a introducir el número");
            x=pedirString();
        }
        num=Integer.parseInt(x);

        
        return  num;
    }
    
    public static boolean validarCiudadPatron(String x){
        boolean valido;  
        /* Expresión regular para una ciudad*/
        String patron="^([A-ZÑÁ-Ú][a-zñá-ú]*[\\s\\-]*)+$";
        //String patron= "^([A-ZÑÁ-Ú][a-zñá-ú]*([\\s\\-][A-ZÑÁ-Ú]?[a-zñá-ú]+)*)$";
        valido = Pattern.matches(patron, x);
        
        return valido;      
    }
    
    public static boolean mirarRepetida(String x, ArrayList<String> y){
        boolean repetido; 
        repetido=y.contains(x);
        
        return repetido;
    }
    
    public static boolean validarHabitantes(int x){
        boolean valido=false;
        
        if(x>0){ //Serán validos los números positivos
            valido=true;
        }
        
        return valido;
    }
    
    public static void añadirCiudad(ArrayList<String> x){
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
    }
    
    public static void añadirHabitantes(ArrayList<Integer> x){
        int habitantes;
        String text_hab;
        System.out.println("Añadir habitantes:");
        text_hab = pedirString();
        habitantes=pasarInt(text_hab);
        if(validarHabitantes(habitantes)==true){
            x.add(habitantes);
        }else{
            System.out.println("Número de habitantes no válido");
        }
    }
    
    public static void mostrarBorrar(ArrayList<String> list_ciudades, String nombre_ciudad){
        /*Mostrar mensaje de borrado*/
        if(Pattern.matches("\\d+", nombre_ciudad)==true && Integer.parseInt(nombre_ciudad)<list_ciudades.size()){
            System.out.println("Ciudad borrada: "+list_ciudades.get(Integer.parseInt(nombre_ciudad)));
        }else if(list_ciudades.contains(nombre_ciudad)==true){
            System.out.println(nombre_ciudad+" ha sido borrada");
        }else{
            System.out.println("La ciudad no existe en el listado o está fuera de rango");
        }
    }
    
    public static void borrarCiudad (ArrayList<String> list_ciudades, ArrayList<Integer> habitantes ){
        int indice=-1;
        String ciudad;
        if(list_ciudades.isEmpty()==true){
            System.out.println("El listado está vacio");
        }else{
            System.out.println("Ciudad que quieres borrar:");
            ciudad=pedirString();//Lectura ciudad
                    
            if(Pattern.matches("\\d+",ciudad)==true){
                indice=Integer.parseInt(ciudad); 
            }else{
                indice=list_ciudades.indexOf(ciudad);
            }
            mostrarBorrar(list_ciudades,ciudad);
            /*Borrar ciudad*/
            list_ciudades.remove(ciudad);
        }
        if(list_ciudades.size()< habitantes.size()){
            habitantes.remove(indice);
        }
        
    }
    
    public static void mostrarListadosCombinados(ArrayList<String> x, ArrayList<Integer> y){
        System.out.println("Listado de ciudades y sus habitantes");
        Iterator<String> itr = x.iterator();
        Iterator<Integer> itr2 = y.iterator();
        while (itr.hasNext()&& itr2.hasNext()) {
            String ciudad = itr.next();
            int habitantes =itr2.next();
            System.out.print(ciudad + ": "+habitantes+" habitantes");
            System.out.println();
        }
    }
    
    public static void mostrarMenuEditar(){
        System.out.println("Que quieres editar:");
        System.out.println("C - Ciudades");
        System.out.println("H - Habitantes");
    }
    public static String editarCiudad(ArrayList<String> x, int y){
        String ciudad, tarea;
        
        if(y<x.size() && y>=0){
            System.out.println("Ciudad por la que la quieres cambiar:");
            ciudad=pedirString();
            x.set(y,ciudad);//Metodo para hcer el cambio
        }else{
            System.out.println("Posición fuera de rango");
        }
        System.out.println("Quieres editar los habitantes: S/N");
        tarea=pedirString();
        if(tarea.equals("S")||tarea.equals("s")){
            tarea="H";
        }else{
            tarea="0";
        }
        
        return tarea;
    }
    
    public static void editarHabitantes(ArrayList<Integer> x, int y){
        int habitantes;
        String text_hab;
            
        if(y<x.size()&& y>=0){
            System.out.println("Valor a editar: "+x.get(y));
            System.out.println("Valor por el que quieres cambiar:");
            text_hab=pedirString();
            habitantes=pasarInt(text_hab); //Pedir nº de habitantes
            x.set(y, habitantes); //Metodo para borrar 
        }else{
            System.out.println("Indice fuera de rango");
        }
    }
    
    public static void mostrarCiudad(ArrayList<String> x, ArrayList<Integer> y){
        int indice;
        String text_ind;
        if(x.isEmpty()==true){
            System.out.println("El listado está vacio");
        }else{
        
            System.out.println("Ciudad que quieres ver(posicion):");
            text_ind=pedirString();
            indice=pasarInt(text_ind);//Lectura ciudadro
            if(indice<x.size()){
                System.out.print(x.get(indice)+": ");
                System.out.print(y.get(indice)+"habitantes");
            }else{
                System.out.println("posición fuera de rango");
            }

        }
    }

    private static void While(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
