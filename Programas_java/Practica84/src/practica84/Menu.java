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
    /**
     * Muestra por pantalla el menú incial
     */
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
    /**
     * Lee un número por teclado y lo devuelve
     * @return número decimal
     */
    public double pedirDouble(){
        System.out.println("Importe:");
        Scanner read= new Scanner(System.in);
        return read.nextDouble();
    }
    /**
     * Lee un string por teclado y lo devuelve
     * @return cadena de texto
     */
    public String pedirString(){
        Scanner read= new Scanner(System.in);
        return read.nextLine();//c.concat(read.nextLine());
    }
    /**
     * Pide por pantalla el nombre del titular
     * y devuelve la cadena de texto introducida por teclado.
     * @return  cadena de texto 
     */
    public String pedirNombre(){
        System.out.println("Nombre:");
        return pedirString();
    }
    /**
     * Pide por pantalla el primer apellido del titular
     * y devuelve la cadena de texto introducida por teclado.
     * @return  cadena de texto 
     */
    public String pedirApellido1(){
        System.out.println("Primer apellido:");
        return pedirString();
    }
    /**
     * Pide por pantalla el segundo apellido del titular
     * y devuelve la cadena de texto introducida por teclado.
     * @return  cadena de texto 
     */
    public String pedirApellido2(){
        System.out.println("Segundo apellido:");
        return pedirString();
    }
    /**
     * Pide por pantalla el número de cuenta
     * y devuelve la cadena de texto introducida por teclado.
     * @return  cadena de texto 
     */
    public String pedirCuenta(){
        System.out.println("Numero de cuenta:");
        return pedirString();
    }
    /**
     * Pide por pantalla el importe para la operación
     * y devuelve el numero decimal introducida por teclado.
     * @return  numero decimal 
     */
    public double pedirImporte(){
        System.out.println("Importe:");
        return pedirDouble();
    }
    /**
     * Pide por pantalla el tipo de interesa
     * y devuelve el numero decimal introducida por teclado.
     * @return  numero decimal 
     */
    public double pedirInteres(){
        System.out.println("Tipo de interés:");
        return pedirDouble();
    }
    /**
     * Muestra por pantalla un encabezado
     * para la operacion transferencia
     */
    public void mostrarTrans(){
        System.out.println("-------------------------------");
        System.out.println("TRANSFERENCIA");
    }
    /**
     * Muestra por pantalla un encabezado
     * para la operacion ingreso
     */
    public void mostrarIngreso(){
        System.out.println("-------------------------------");
        System.out.println("INGRESO");
    }
    /**
     * Muestra por pantalla un encabezado
     * para la operacion reintegro
     */
    public void mostrarReintegro(){
        System.out.println("-------------------------------");
        System.out.println("REINTEGRO");
        System.out.println();
    }
    /**
     * Muestra por pantalla el submenú modificar datos
     */
    public void mostrarDatos(Cuenta c){
        System.out.println("-------------------------------");
        System.out.println("MOSTRAR DATOS");
        System.out.println();
        System.out.println("Nombre: "+c.getNombre());
        System.out.println("Apellidos: "+c.getApellido1()+" "+c.getApellido2());
        System.out.println("Nº cuenta: "+c.getNumCuenta());
        System.out.println("Tipo interés: "+c.getTipoInt()+"%");
        
    }
    /**
     * Devuelve por pantalla el saldo de este cuenta
     * dado un objeto Cuenta 
     * @param c objeto Cuenta
     */
    public void mostrarSaldo(Cuenta c){
        System.out.println("-------------------------------");
        System.out.println("MOSTRAR SALDO");
        System.out.println();
        System.out.println("Saldo cuenta"+ c.getNumCuenta()+"="+c.getSaldo());
    
    }
}
