/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica85;
import java.util.Scanner;
/**
 *
 * @author lidia
 */
public class Menu {
    public String pedirString(){
        Scanner read= new Scanner(System.in);
        return read.nextLine();
    }
    public Float pedirFloat(){
        Scanner read= new Scanner(System.in);
        return read.nextFloat();
    }
    
    public void MenuCuenta(){
        System.out.println("-------------------------------");
        System.out.println("MENU CUENTA:");
        System.out.println("1.- Crear cuenta");
        System.out.println("2.- Operar con cuenta existente");
        System.out.println("3.- Salir del programa");
    }
    
    public String pedirCuenta1(){
        System.out.println("Numero de cuenta:");
        return pedirString();
    }
    public String pedirCuenta2(){
        System.out.println("Numero de cuenta beneficiario:");
        return pedirString();
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
    public float pedirInteres(){
        System.out.println("Tipo de interés:");
        return pedirFloat();
    }
    public float pedirSaldo(){
        System.out.println("Saldo inicial:");
        return pedirFloat();
    }
    public float pedirImporte(){
        System.out.println("Importe:");
        return pedirFloat();
    }
    public void MenuOperaciones(){
        System.out.println("-------------------------------");
        System.out.println("MENU OPERACIONES:");
        System.out.println("1.- Ingreso");
        System.out.println("2.- Reintegro");
        System.out.println("3.- Transferencia");
        System.out.println("4.- Consultar saldo");
        System.out.println("5.- Consultar datos");
        System.out.println("6.- Modificar datos");
        System.out.println("7.- Salir del programa");
        System.out.println("¿Que operación deseas realizar?"); 
    }
    public void menuModificar(){
        System.out.println("MENU MODIFICAR DATOS:");
        System.out.println("1.- Nombre");
        System.out.println("2.- Primer apellido");
        System.out.println("3.- Segundo apellido");
        System.out.println("4.- Tipo de interés");
        System.out.println("5.- Volver al menú anterior");
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
