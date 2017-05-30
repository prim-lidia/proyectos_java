/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica84;

/**
 *
 * @author lidia
 */
public class Practica84 {

    /**
     * El programa trabaja con dos cuentas y realiza ciertas operaciones con estas.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declarar variables y objetos
        Menu m = new Menu();
        Cuenta c1 = new Cuenta("Pedro","Lopez","Mato","157484213", 0.03, 2000);
        Cuenta c2 = new Cuenta("Patricia","Martinez","Caudet","157484223", 0.05, 3500);
        String cuenta, auxCuenta, opcion="0";
        
        cuenta = m.pedirCuenta(); //Pedir numero de cuenta
        
        //Menu
        while(! opcion.equals("7")){
            m.mostrarMenu();
            opcion=m.pedirString();
            switch(opcion){
                case "1": // Ingreso
                    if(cuenta.equals("1")){ 
                        c1.ingreso(m.pedirImporte());
                        System.out.println("Saldo final: "+c1.getSaldo());
                    }else{ 
                        c2.ingreso(m.pedirImporte());
                        System.out.println("Saldo final: "+c2.getSaldo());
                    }
                    break;
                case "2":// Reintegro
                    if(cuenta.equals("1")){ 
                        c1.reintegro(m.pedirImporte());
                        System.out.println("Saldo final: "+c1.getSaldo());
                    }else{ 
                        c2.reintegro(m.pedirImporte());
                        System.out.println("Saldo final: "+c2.getSaldo());
                    }
                    break;
                case "3": //Transferencia
                    if(cuenta.equals("1")){ 
                        c1.transferencia(m.pedirImporte(),c2);
                        System.out.println("Saldo final: "+c1.getSaldo());
                        System.out.println("Saldo beneficiario: "+c2.getSaldo());
                    }else{ 
                        c2.transferencia(m.pedirImporte(),c1);
                        System.out.println("Saldo final: "+c2.getSaldo());
                        System.out.println("Saldo beneficiario: "+c1.getSaldo());
                    }
                    break;
                case "4"://Mostrar saldo
                    if(cuenta.equals("1")){
                        m.mostrarSaldo(c1);
                    }else{
                        m.mostrarSaldo(c2);
                    }
                    break;
                case "5": //Mostrar datos
                    if(cuenta.equals("1")){
                        m.mostrarDatos(c1);
                    }else{
                        m.mostrarDatos(c2);
                    }
                    break;
                case "6":
                    break;
                default:
                    System.out.println("No existe la operación");
                    break;
            }
        }
        

        
    }
    
}
