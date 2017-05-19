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
        Libro libro= new Libro();
        Libro auxLibro=new Libro();
        Ejemplar ejemplar= new Ejemplar();
        Ejemplar auxEjemplar= new Ejemplar();
        Menu m = new Menu();
        int max= 2;//Numero máximo de libros y ejemplares/libro
        String opcion;
        
        ArrayList<Libro> biblioteca = new ArrayList<>(); 
        do{
            m.mostrarInicio();
            opcion= m.pedirString();
        
            switch(opcion){
                
                case "1":
                    opcion="n";
                    while(opcion.equals("n")||opcion.equals("N")){
                        libro.setTitulo(m.pedirTitulo());
                        libro.setAutor(m.pedirAutor());
                        libro.setCodLibro(m.pedirCodLibro());
                        opcion=m.añadirEjemplar();
                        while(opcion.equals("s")||opcion.equals("S")){
                            auxEjemplar.setCodEj(m.pedirCodEjemplar());
                            auxEjemplar.setIsbn(m.pedirIsbn());
                            libro.setEjemplaresList(auxEjemplar);
                            if(libro.getEjemplares().size()<max){
                                opcion=m.añadirEjemplar();
                            }else{
                                opcion="n";
                            }   
                        }
                        biblioteca.add(libro);
                        if(biblioteca.size()<max){
                            opcion=m.añadirLibro();
                        }else{
                            opcion="s";
                        }  
                    }
                    break;
                case "2":
                    if(biblioteca.isEmpty()==false){
                        libro=m.buscarLibro(m.pedirCodLibro(), biblioteca);
                        if(libro.getCodLibro().equals("")){
                            System.out.println("No tenemos ese libro");
                        }else{
                            opcion="s";
                            while((opcion.equals("s")||opcion.equals("S"))&&libro.getEjemplares().size()<max){
                                auxEjemplar.setCodEj(m.pedirCodEjemplar());
                                auxEjemplar.setIsbn(m.pedirIsbn());
                                libro.setEjemplaresList(auxEjemplar);
                                if(libro.getEjemplares().size()<max){
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
                case "3":
                    while(!opcion.equals("5")){
                        m.mostrarMenu();
                        opcion=m.pedirString();
                        if(biblioteca.isEmpty()==false){
                            switch(opcion){
                                case "1":
                                    libro=m.buscarLibro(m.pedirCodLibro(), biblioteca);
                                    if(!libro.getCodLibro().equals("")){
                                        auxEjemplar=m.buscarEjemplar(m.pedirCodEjemplar(), libro.getEjemplares());
                                        if(auxEjemplar.getCodEj().equals("")){
                                            System.out.println("No tenemos ese ejemplar");
                                        }else{
                                           auxEjemplar.prestar();
                                           System.out.println("Operación realizada correctamente");
                                        }
                                    }else{
                                        System.out.println("No tenemos ese libro");
                                    }
                                    break;
                                case "2":
                                    libro=m.buscarLibro(m.pedirCodLibro(), biblioteca);
                                    if(!libro.getCodLibro().equals("")){
                                        auxEjemplar=m.buscarEjemplar(m.pedirCodEjemplar(), libro.getEjemplares());
                                        if(auxEjemplar.getCodEj().equals("")){
                                            System.out.println("No tenemos ese ejemplar");
                                        }else{
                                            auxEjemplar.devolver();
                                            System.out.println("Operación realizada correctamente");
                                        }
                                    }else{
                                        System.out.println("No tenemos ese libro");
                                    }
                                    break;
                                case "3":
                                    if(biblioteca.isEmpty()==false){
                                    libro=m.buscarLibro(m.pedirCodLibro(), biblioteca);
                                        if(!libro.getCodLibro().equals("")){
                                            m.mostrarDatos(libro);
                                        }else{
                                            System.out.println("No tenemos ese libro");
                                        }
                                    }else{
                                        System.out.println("La biblioteca no tiene libros");
                                    }
                                    break;
                                case "4":
                                    libro=m.buscarLibro(m.pedirCodLibro(), biblioteca);
                                    if(!libro.getCodLibro().equals("")){
                                        do{
                                            m.modificarDatos();
                                            opcion=m.pedirString();
                                            switch(opcion){
                                                case "1":
                                                    libro.setTitulo(m.pedirTitulo());
                                                    break;
                                                case "2":
                                                    libro.setAutor(m.pedirAutor());
                                                    break;
                                                case "3":
                                                    libro.setCodLibro(m.pedirCodLibro());
                                                    break;
                                                case "4":
                                                    auxEjemplar=m.buscarEjemplar(m.pedirCodEjemplar(), libro.getEjemplares());
                                                    if(auxEjemplar.getCodEj().equals("")){
                                                        System.out.println("No tenemos ese ejemplar");
                                                    }else{
                                                        do{
                                                            m.modificarDatosEjemplar();
                                                            opcion=m.pedirString();
                                                            switch(opcion){
                                                                case "1":
                                                                    auxEjemplar.setCodEj(m.pedirCodEjemplar());      
                                                                    break;
                                                                case "2":
                                                                    auxEjemplar.setIsbn(m.pedirIsbn());
                                                                    break;
                                                                case "3":
                                                                    break;
                                                                default:
                                                                    System.out.println("No exite está opción");
                                                                    break;
                                                            }
                                                        }while(!opcion.equals("3"));
                                                        opcion="5";  //Para volver al menú operaciones
                                                    }
                                                    break;
                                                case "5":
                                                    break;
                                                default:
                                                    System.out.println("No exite está opción");
                                                    break;
                                            }
                                        }while(!opcion.equals("5"));
                                    }else{
                                        System.out.println("No tenemos ese libro");
                                    }
                                    break;
                                case "5":
                                    System.out.println("No exite está opción");
                                    break;
                                default:
                                    break;
                            }
                        }else{
                            System.out.println("La biblioteca no tiene ningun libro");
                        }
                    }
                    break;
                case "4":
                    break;
                default:
                    System.out.println("No exite está opción");
                    break;
            }
        }while(!opcion.equals("7"));
    }
}
