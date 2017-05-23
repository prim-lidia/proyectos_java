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
    /**
     * Metodo que lee un string por teclado y lo devuelve
     * @return cadena de texto
     */
    public String pedirString(){
        Scanner read= new Scanner(System.in);
        return read.nextLine();
    }
    /**
     * Metodo que lee un número por teclado y lo devuelve
     * @return número decimal
     */
    public Float pedirFloat(){
        Scanner read= new Scanner(System.in);
        return read.nextFloat();
    }
    /**
     * Método que muestra por pantalla el menú incial
     */
    public void MenuCuenta(){
        System.out.println("-------------------------------");
        System.out.println("MENU CUENTA:");
        System.out.println("1.- Crear cuenta");
        System.out.println("2.- Operar con cuenta existente");
        System.out.println("3.- Salir del programa");
    }
    /**
     * Método que pide por pantalla el número de cuenta
     * y devuelve la cadena de texto introducida por teclado.
     * @return  cadena de texto 
     */
    public String pedirCuenta1(){
        System.out.println("Numero de cuenta:");
        return pedirString();
    }
    /**
     * Método que pide por pantalla número de cuenta para una transferencia
     * y devuelve la cadena de texto introducida por teclado.
     * @return cadena de texto
     */
    public String pedirCuenta2(){
        System.out.println("Numero de cuenta beneficiario:");
        return pedirString();
    }
    /**
     * Método que pide por pantalla el nombre del titular
     * y devuelve la cadena de texto introducida por teclado.
     * @return  cadena de texto 
     */
    public String pedirNombre(){
        System.out.println("Nombre:");
        return pedirString();
    }
    /**
     * Método que pide por pantalla el primer apellido del titular
     * y devuelve la cadena de texto introducida por teclado.
     * @return  cadena de texto 
     */
    public String pedirApellido1(){
        System.out.println("Primer apellido:");
        return pedirString();
    }
    /**
     * Método que pide por pantalla el segundo apellido del titular
     * y devuelve la cadena de texto introducida por teclado.
     * @return  cadena de texto 
     */
    public String pedirApellido2(){
        System.out.println("Segundo apellido:");
        return pedirString();
    }
    /**
     * Método que pide por pantalla el tipo de interesa
     * y devuelve el numero decimal introducida por teclado.
     * @return  numero decimal 
     */
    public float pedirInteres(){
        System.out.println("Tipo de interés:");
        return pedirFloat();
    }
    /**
     * Método que pide por pantalla el saldo incial
     * y devuelve el numero decimal introducida por teclado.
     * @return  numero decimal 
     */
    public float pedirSaldo(){
        System.out.println("Saldo inicial:");
        return pedirFloat();
    }
    /**
     * Método que pide por pantalla el importe para la operación
     * y devuelve el numero decimal introducida por teclado.
     * @return  numero decimal 
     */
    public float pedirImporte(){
        System.out.println("Importe:");
        return pedirFloat();
    }
    /**
     * Método que muestra por pantalla el submenú operaciones
     */
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
    /**
     * Método que muestra por pantalla el submenú modificar datos
     */
    public void menuModificar(){
        System.out.println("MENU MODIFICAR DATOS:");
        System.out.println("1.- Nombre");
        System.out.println("2.- Primer apellido");
        System.out.println("3.- Segundo apellido");
        System.out.println("4.- Tipo de interés");
        System.out.println("5.- Volver al menú anterior");
    }
    /**
     * Método que muestra por pantalla un encabezado
     * para la operacion transferencia
     */
    public void mostrarTrans(){
        System.out.println("-------------------------------");
        System.out.println("TRANSFERENCIA");
    }
    /**
     * Método que muestra por pantalla un encabezado
     * para la operacion ingreso
     */
    public void mostrarIngreso(){
        System.out.println("-------------------------------");
        System.out.println("INGRESO");
    }
    /**
     * Método que muestra por pantalla un encabezado
     * para la operacion reintegro
     */
    public void mostrarReintegro(){
        System.out.println("-------------------------------");
        System.out.println("REINTEGRO");
        System.out.println();
    }
    /**
     * Método que dado un objeto cuenta 
     * devuelve por pantalla los datos de este cuenta .
     * @param c objeto cuenta
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
     *  Método que dado un objeto cuenta 
     * devuelve por pantalla el saldo de este cuenta.
     * @param c 
     */
    public void mostrarSaldo(Cuenta c){
        System.out.println("-------------------------------");
        System.out.println("MOSTRAR SALDO");
        System.out.println();
        System.out.println("Saldo cuenta"+ c.getNumCuenta()+"="+c.getSaldo());
    
    }
    
}
