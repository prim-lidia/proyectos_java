/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica85;
import java.util.ArrayList;

/**
 *
 * @author lidia
 */
public class Practica85 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Cuenta> bank = new ArrayList<>();
        Cuenta account = new Cuenta();
        Cuenta account2 = new Cuenta();
        Cuenta auxAccount;
        Menu m = new Menu();
        String auxOption="", numCuenta;
        int i,j;
        
        while(! auxOption.equals("3")){
            m.MenuCuenta();
            auxOption=m.pedirString();
            switch(auxOption){
                case "1": //Crear cuentas
                    String nombre, apellido1, apellido2;
                    double tipoInt, saldo;
                    /* Pedir datos */
                    nombre= m.pedirNombre();
                    apellido1=m.pedirApellido1();
                    apellido2=m.pedirApellido2();
                    numCuenta=m.pedirCuenta1();
                    tipoInt=m.pedirInteres();
                    saldo=m.pedirSaldo();
                    /*Inicializar cuenta*/
                    auxAccount = new Cuenta(nombre, apellido1, apellido2, numCuenta,tipoInt,saldo);
                    bank.add(auxAccount);
                    break;
                case "2": //Operar con cuentas
                    numCuenta=m.pedirCuenta1();
                    /**
                     * Bucle para buscar coincidencia en el numero de cuenta y guradar en variable el objeto
                     */
                    for(i=0; i<bank.size();i++){
                        auxAccount= bank.get(i);
                        if(numCuenta.equals(auxAccount.getNumCuenta())){
                            account=auxAccount;
                        }
                    }
                    if(account.getNumCuenta().equals("")){
                        System.out.println("No existe la cuenta");
                    }else{  //Empieza el segundo menú
                        auxOption="";
                        while(! auxOption.equals("6")){
                            m.MenuOperaciones();
                            auxOption=m.pedirString();
                        
                            switch(auxOption){
                                case"1":
                                    account.ingreso(m.pedirImporte());
                                    System.out.println("Operación realizada");
                                    System.out.println("Saldo final: "+account.getSaldo());
                                    break;
                                case"2":
                                    account.reintegro(m.pedirImporte());
                                    System.out.println("Operación realizada");
                                    System.out.println("Saldo final: "+account.getSaldo());
                                    break;
                                case"3":
                                    /* Buscar cuenta para hacer la transferencia */
                                    numCuenta=m.pedirCuenta2();
                                    for(i=0; i<bank.size();i++){
                                        auxAccount= bank.get(i);
                                        if(numCuenta.equals(auxAccount.getNumCuenta())){
                                        account2=auxAccount;
                                        }
                                    }
                                    if(account2.getNumCuenta().equals("")){
                                        System.out.println("No existe la cuenta.");
                                        System.out.println("No se puede realizar la operación.");
                                    }else{ //Transferencia
                                        account.transferencia(m.pedirImporte(),account2);
                                        System.out.println("Operación realizada");
                                        System.out.println("Saldo final: "+account.getSaldo());
                                        System.out.println("Saldo beneficiario: "+account2.getSaldo());
                                    }
                                    break;
                                case"4":
                                    m.mostrarSaldo(account);
                                    break;
                                case"5":
                                    m.mostrarDatos(account);
                                    break;
                                case"6":
                                    break;
                                default:
                                    System.out.println("La tarea no existe");
                            }
                        }
                        auxOption="3";
                    }
                    break;
                case "3":
                    break;
                default:
                    System.out.println("La tarea no existe");
                    
            }
        
        }
        
        
    }
   
}
