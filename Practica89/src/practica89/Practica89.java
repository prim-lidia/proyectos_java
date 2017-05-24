/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica89;
import java.util.Scanner;
/**
 *
 * @author lidia
 */
public class Practica89 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fecha fecha=new Fecha(); 
        int dia, mes, año;
        Scanner read= new Scanner(System.in);
        String opcion="";
        do{
            System.out.println("1.- Introducir fecha manualmente");
            System.out.println("2.- Introducir fecha del sistema ");
            System.out.println("3.- Salir del programa ");
            opcion= read.nextLine();
            switch(opcion){
                case "1":
                    System.out.println("Día: ");
                    dia= read.nextInt();
                    System.out.println("Mes: ");
                    mes= read.nextInt();
                    System.out.println("Año: ");
                    año= read.nextInt();
                    read.nextLine();

                    if(fecha.fechaValida(dia, mes, año)==true){
                        fecha.setDia(dia);
                        fecha.setMes(mes);
                        fecha.setAño(año);
                        System.out.println("Fecha: "+fecha.getDia()+" de "
                                +fecha.getMesTexto()+" de "+fecha.getAño());
                        
                    }else{
                        System.out.println("La fecha no es válida");
                    }                    
                    break;
                case "2":
                    fecha.setDia(fecha.fechaSistema()[0]);
                    fecha.setMes(fecha.fechaSistema()[1]);
                    fecha.setAño(fecha.fechaSistema()[2]);
                    System.out.println("Fecha: "+fecha.getDia()+" de "
                            +fecha.getMesTexto()+" de "+fecha.getAño());
                    break;
                case "3":
                    break;
                default:
                    System.out.println("No existe esta opción");
                    break;        
            }
        }while(!opcion.equals("3"));    
    }
    
}
