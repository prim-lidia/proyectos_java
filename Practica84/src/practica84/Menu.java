/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica84;
import java.util.Scanner;
/**
 *
 * @author lidia
 */
public class Menu {
    private String opcion;
    
    public void mostrarMenu(){
        System.out.println("-------------------------------");
        System.out.println("MENU OPERACIONES:");
        System.out.println("1.- Ingreso");
        System.out.println("2.- Reintegro");
        System.out.println("3.- Transferencia");
        System.out.println("4.- Consultar saldo");
        System.out.println("5.- Consultar datos");
        System.out.println("6.- Salir");
        System.out.println("¿Que operación deseas realizar?"); 
    }
    
    public double pedirDouble(){
        System.out.println("Importe:");
        Scanner read= new Scanner(System.in);
        return read.nextDouble();
    }
    
    public String pedirString(){
        Scanner read= new Scanner(System.in);
        return read.nextLine();//c.concat(read.nextLine());
    }
    public String pedirNombre(){
        System.out.println("Nombre:");
        return pedirString();
    }
    public String pedirApellido1(){
        System.out.println("Primer apellido:");
        return pedirString();
    }
    public String pedirApellido2(){
        System.out.println("Segundo apellido:");
        return pedirString();
    }
    public String pedirCuenta(){
        System.out.println("Numero de cuenta:");
        return pedirString();
    }
    public double pedirImporte(){
        System.out.println("Importe:");
        return pedirDouble();
    }
    public double pedirInteres(){
        System.out.println("Tipo de interés:");
        return pedirDouble();
    }
    public void mostrarTrans(){
        System.out.println("-------------------------------");
        System.out.println("TRANSFERENCIA");
    }
    
    public void mostrarIngreso(){
        System.out.println("-------------------------------");
        System.out.println("INGRESO");
    }
    
    public void mostrarReintegro(){
        System.out.println("-------------------------------");
        System.out.println("REINTEGRO");
        System.out.println();
    }
    
    public void mostrarDatos(Cuenta c){
        System.out.println("-------------------------------");
        System.out.println("MOSTRAR DATOS");
        System.out.println();
        System.out.println("Nombre: "+c.getNombre());
        System.out.println("Apellidos: "+c.getApellido1()+" "+c.getApellido2());
        System.out.println("Nº cuenta: "+c.getNumCuenta());
        System.out.println("Tipo interés: "+c.getTipoInt()+"%");
        
    }
    public void mostrarSaldo(Cuenta c){
        System.out.println("-------------------------------");
        System.out.println("MOSTRAR SALDO");
        System.out.println();
        System.out.println("Saldo cuenta"+ c.getNumCuenta()+"="+c.getSaldo());
    
    }
}
