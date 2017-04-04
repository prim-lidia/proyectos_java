/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica76;

import java.util.Scanner;

/**
 *
 * @author lidia
 */
public class Practica76 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Declarar objetos */
        Menu calc = new Menu();
        Operaciones operacion = new Operaciones();
        /*Declarar variable*/
        String cad;
        
        /*Mostrar menu*/
        calc.mostrarmenu();
        calc.leerOpcion();
        
        Scanner read= new Scanner(System.in); //Entrada teclado
        /*Pedir numeros solo si la opción es válida*/
        if(calc.validarOperacion(calc.getOpcion()) == true){
            System.out.println("Operador1:");
            cad=read.nextLine();//leer operadorA
            operacion.establecerNumA(cad);
            System.out.println("Operador2:");
            cad=read.nextLine(); //leer operadorB
            operacion.establecerNumB(cad);  
        }
        

        switch(calc.getOpcion()){
            case"+":
                operacion.suma(operacion.getOperadorA(), operacion.getOperadorB());
                break;
            case "-":
                operacion.resta(operacion.getOperadorA(),operacion.getOperadorB());
                break;
            case "x":
                operacion.multiplicacion(operacion.getOperadorA(),operacion.getOperadorB());
                break;
            case "/":
                operacion.division(operacion.getOperadorA(),operacion.getOperadorB());
                break;
            default:
                System.out.println("La operacioón no existe");
                break;
        }
        if(calc.validarOperacion(calc.getOpcion()) == true){
            System.out.println(operacion.getOperadorA()+" "+calc.getOpcion()+" "
                +operacion.getOperadorB()+" = "+operacion.getResult());
        }
    }
    
}
