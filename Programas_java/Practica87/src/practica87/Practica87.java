/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica87;

/**
 *
 * @author lidia
 */
public class Practica87 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declarar objetos y variables
        Libro libro1= new Libro("El encanto","Susana Lopez Rubio","9788467049732",2);
        Libro libro2= new Libro("Escrito en el agua","Paula Hawkins","9788408172178",3); 
        Menu m= new Menu();
        String opcion="";
        int libro_i;
        Libro[] libros= new Libro[]{libro1,libro2};
        m.mostrarElegirLibro();
        libro_i=m.pedirInt()-1; //indice del libro a utilizar para las tareas
        switch(libro_i){
            case 0: case 1: // Si el indice está entre los que hay en el Array de Libros
                do{
                    m.mostrarMenu();
                    opcion=m.pedirString();
                    switch(opcion){
                        case "1": //prestar
                            libros[libro_i].prestar();
                            break;
                        case "2"://devolver
                            libros[libro_i].devolver();
                            break;
                        case "3"://mostrar datos
                            m.mostrarDatos(libros[libro_i]);
                            break;
                        case "4": //Submenu modificar datos
                            while(!opcion.equals("5")){
                                m.modificarDatos();
                                opcion=m.pedirString();
                                switch(opcion){
                                    case"1": //modificar titulo
                                        libros[libro_i].setTitulo(m.pedirTitulo());
                                        break;
                                    case"2": // modificar autor
                                        libros[libro_i].setAutor(m.pedirAutor());
                                        break;
                                    case"3":// modificar ISBN
                                        libros[libro_i].setIsbn(m.pedirIsbn());
                                        break;
                                    case"4":// modificar cantidad de ejemplares
                                        libros[libro_i].setEjemplares(m.pedirNumEjemp());
                                        break;
                                    case"5":
                                        break;
                                        
                                    default:
                                        System.out.println("No existe esta opción");
                                        break;
                                }
                            }                    
                            opcion="";//Resetear la entrada para que entre al menu principal
                            break;
                        case "5":
                            break;
                        default:
                            System.out.println("No existe esta opción");
                            break;                    
                    }
                }while(!opcion.equals("5")); //Salir del programa
                break;
            default:
                    System.out.println("No existe esta opción");
                    break;   
            }   
    }
    
}
