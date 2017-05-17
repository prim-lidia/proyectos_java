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
        int libro;
        Libro[] libros= new Libro[]{libro1,libro2};
        m.mostrarElegirLibro();
        libro=m.pedirInt()-1;
        switch(libro){
            case 0: case 1:
                do{
                    m.mostrarMenu();
                    opcion=m.pedirString();
                    switch(opcion){
                        case "1":
                            libros[libro].prestar();
                            break;
                        case "2":
                            libros[libro].devolver();
                            break;
                        case "3":
                            m.mostrarDatos(libros[libro]);
                            break;
                        case "4":
                            while(!opcion.equals("5")){
                                m.modificarDatos();
                                opcion=m.pedirString();
                                switch(opcion){
                                    case"1":
                                        libros[libro].setTitulo(m.pedirTitulo());
                                        break;
                                    case"2":
                                        libros[libro].setAutor(m.pedirAutor());
                                        break;
                                    case"3":
                                        libros[libro].setIsbn(m.pedirIsbn());
                                        break;
                                    case"4":
                                        libros[libro].setEjemplares(m.pedirNumEjemp());
                                        break;
                                    case"5":
                                        break;
                                        
                                    default:
                                        System.out.println("No existe esta opción");
                                        break;
                                }
                            }                    
                            opcion="";
                            break;
                        case "5":
                            break;
                        default:
                            System.out.println("No existe esta opción");
                            break;                    
                    }
                }while(!opcion.equals("5"));
                break;
            default:
                    System.out.println("No existe esta opción");
                    break;   
            }   
    }
    
}
