/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica88;
import java.util.ArrayList;
/**
 *
 * @author lidia
 */
public class Practica88 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar objetos
        Menu m = new Menu();
        int max= 2, index, index2;//Numero máximo de libros y ejemplares/libro
        String opcion;
        boolean salir=false, salir2=false;
        
        ArrayList<Libro> biblioteca = new ArrayList<>(); 
        do{
            m.mostrarInicio();
            opcion= m.pedirString();
        
            switch(opcion){
                
                case "1": //Tarea para añadir nuevo libro
                    opcion="n";
                    while(opcion.equals("n")||opcion.equals("N")){
                        Libro auxLibro=new Libro();//Nuevo objeto libro por cada vez que entremos en el while
                        auxLibro.setTitulo(m.pedirTitulo());
                        auxLibro.setAutor(m.pedirAutor());
                        auxLibro.setCodLibro(m.pedirCodLibro());
                        opcion=m.añadirEjemplar();
                        while(opcion.equals("s")||opcion.equals("S")){ //Menu para añadir nuevos ejemplares
                            Ejemplar auxEjemplar= new Ejemplar(); //Nuevo objeto ejemplar cada vez que entremos en el while
                            auxEjemplar.setCodEj(m.pedirCodEjemplar());
                            auxEjemplar.setIsbn(m.pedirIsbn());
                            auxLibro.setEjemplaresList(auxEjemplar); //añadir ejemplar al libro
                            if(auxLibro.getEjemplares().size()<max){
                                opcion=m.añadirEjemplar();
                            }else{
                                opcion="n";
                            }   
                        }
                        biblioteca.add(auxLibro); //añadir libro a la bibliotea
                        if(biblioteca.size()<max){
                            opcion=m.añadirLibro();
                        }else{
                            opcion="s";
                        }  
                    }
                    break;
                case "2": // Tarea para añadir ejemplares a un libro ya creado
                    if(biblioteca.isEmpty()==false){
                        index=m.buscarLibro(m.pedirCodLibro(), biblioteca); //Buscar libro
                        if(index==-1){
                            System.out.println("No tenemos ese libro");
                        }else{
                            opcion="s";
                            while((opcion.equals("s")||opcion.equals("S"))&&biblioteca.get(index).getEjemplares().size()<max){
                                Ejemplar auxEjemplar= new Ejemplar();
                                auxEjemplar.setCodEj(m.pedirCodEjemplar());
                                auxEjemplar.setIsbn(m.pedirIsbn());
                                biblioteca.get(index).setEjemplaresList(auxEjemplar);
                                if(biblioteca.get(index).getEjemplares().size()<max){
                                    opcion=m.añadirEjemplar();
                                 }else{
                                    opcion="n";
                                }  
                            }
                        }
                    }else{
                        System.out.println("La biblioteca no tiene ningun libro");
                    }
                    break;
                case "3": //Tareas a realizar con un libro existente
                    salir2=false;
                    while(salir2==false){
                        m.mostrarMenu();
                        opcion=m.pedirString();
                        if(biblioteca.isEmpty()==false){
                            switch(opcion){
                                case "1": // Tarea para prestar ejemplar de un libro
                                    index=m.buscarLibro(m.pedirCodLibro(), biblioteca);
                                    if(index==-1){
                                        index2=m.buscarEjemplar(m.pedirCodEjemplar(), biblioteca.get(index).getEjemplares());
                                        if(index==-1){
                                            System.out.println("No tenemos ese ejemplar");
                                        }else{
                                           biblioteca.get(index).getEjemplares().get(index2).prestar();
                                           System.out.println("Operación realizada correctamente");
                                        }
                                    }else{
                                        System.out.println("No tenemos ese libro");
                                    }
                                    break;
                                case "2": //Tarea para devolver ejemplar de un libro
                                    index=m.buscarLibro(m.pedirCodLibro(), biblioteca);
                                    if(index==-1){
                                        index2=m.buscarEjemplar(m.pedirCodEjemplar(), biblioteca.get(index).getEjemplares());
                                        if(index2==-1){
                                            System.out.println("No tenemos ese ejemplar");
                                        }else{
                                            biblioteca.get(index).getEjemplares().get(index2).devolver();
                                            System.out.println("Operación realizada correctamente");
                                        }
                                    }else{
                                        System.out.println("No tenemos ese libro");
                                    }
                                    break;
                                case "3": // Mostrar datos de un libro y sus ejemplares
                                    if(biblioteca.isEmpty()==false){
                                        index=m.buscarLibro(m.pedirCodLibro(), biblioteca);
                                        if(index==-1){
                                            m.mostrarDatos(biblioteca.get(index));
                                        }else{
                                            System.out.println("No tenemos ese libro");
                                        }
                                    }else{
                                        System.out.println("La biblioteca no tiene libros");
                                    }
                                    break;
                                case "4": // Sub menu para modificar libro
                                    index=m.buscarLibro(m.pedirCodLibro(), biblioteca);
                                    if(index==-1){
                                        do{
                                            m.modificarDatos();
                                            opcion=m.pedirString();
                                            switch(opcion){
                                                case "1": // Modificar titulo
                                                    biblioteca.get(index).setTitulo(m.pedirTitulo());
                                                    break;
                                                case "2": // Modificar autor
                                                    biblioteca.get(index).setAutor(m.pedirAutor());
                                                    break;
                                                case "3": // Modificar Codigo libro
                                                    biblioteca.get(index).setCodLibro(m.pedirCodLibro());
                                                    break;
                                                case "4": // Submenu para modificar un ejemplar
                                                    index2=m.buscarEjemplar(m.pedirCodEjemplar(), biblioteca.get(index).getEjemplares());
                                                    if(index2==-1){
                                                        System.out.println("No tenemos ese ejemplar");
                                                    }else{
                                                        do{
                                                            m.modificarDatosEjemplar();
                                                            opcion=m.pedirString();
                                                            switch(opcion){
                                                                case "1": //modificar codifo ejemplar
                                                                    biblioteca.get(index).getEjemplares().get(index2).setCodEj(m.pedirCodEjemplar());      
                                                                    break;
                                                                case "2": // modificar isbn
                                                                    biblioteca.get(index).getEjemplares().get(index2).setIsbn(m.pedirIsbn());
                                                                    break;
                                                                case "3":
                                                                    break;
                                                                default:
                                                                    System.out.println("No exite está opción");
                                                                    break;
                                                            }
                                                        }while(!opcion.equals("3")); //condición para salir del sub menu
                                                        opcion="5"; //AL modificar a 5 volvemos al submenu de Tareas libro
                                                    }
                                                    break;
                                                case "5":
                                                    break;
                                                default:
                                                    System.out.println("No exite está opción");
                                                    break;
                                            }
                                        }while(!opcion.equals("5")); //condición para cvolver al menú anterior
                                    }else{
                                        System.out.println("No tenemos ese libro");
                                    }
                                    break;
                                case "5": 
                                    salir2=true; // condición para volver al menú principal
                                    break;
                                case "6":
                                    salir2=true; // condición para volver al menú principal
                                    salir=true; //Condición parar salir del programa
                                    break;
                                default:
                                    System.out.println("No exite está opción");
                                    break;
                            }
                        }else{
                            System.out.println("La biblioteca no tiene ningun libro");
                        }
                    }
                    break;
                case "4":
                    salir=true; //Condición parar salir del programa
                    break;
                default:
                    System.out.println("No exite está opción");
                    break;
            }
        }while(salir==false);
    }
}
