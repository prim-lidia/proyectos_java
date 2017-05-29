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
        Cuenta auxAccount;
        Menu m = new Menu();
        String auxOption="", numCuenta;
        int i,index, index2;
        
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
                    index=-1;
                    for(i=0; i<bank.size();i++){
                        auxAccount= bank.get(i);
                        if(numCuenta.equals(auxAccount.getNumCuenta())){
                            index=i;
                        }
                    }
                    if(index==-1){
                        System.out.println("No existe la cuenta");
                    }else{  //Empieza el segundo menú
                        auxOption="";
                        while(! auxOption.equals("6")){
                            m.MenuOperaciones();
                            auxOption=m.pedirString();
                        
                            switch(auxOption){
                                case"1":
                                    bank.get(index).ingreso(m.pedirImporte());
                                    System.out.println("Operación realizada");
                                    System.out.println("Saldo final: "+bank.get(index).getSaldo());
                                    break;
                                case"2":
                                    bank.get(index).reintegro(m.pedirImporte());
                                    System.out.println("Operación realizada");
                                    System.out.println("Saldo final: "+bank.get(index).getSaldo());
                                    break;
                                case"3":
                                    /* Buscar cuenta para hacer la transferencia */
                                    numCuenta=m.pedirCuenta2();
                                    index2=-1;
                                    for(i=0; i<bank.size();i++){
                                        auxAccount= bank.get(i);
                                        if(numCuenta.equals(auxAccount.getNumCuenta())){
                                        index2=i;
                                        }
                                    }
                                    if(index2==-1){
                                        System.out.println("No existe la cuenta.");
                                        System.out.println("No se puede realizar la operación.");
                                    }else{ //Transferencia
                                        bank.get(index2).transferencia(m.pedirImporte(),bank.get(index2));
                                        System.out.println("Operación realizada");
                                        System.out.println("Saldo final: "+bank.get(index2).getSaldo());
                                        System.out.println("Saldo beneficiario: "+bank.get(index2).getSaldo());
                                    }
                                    break;
                                case"4":
                                    m.mostrarSaldo(bank.get(index));
                                    break;
                                case"5":
                                    m.mostrarDatos(bank.get(index));
                                    break;
                                case"6":
                                    auxOption="";
                                    while(! auxOption.equals("5")){
                                        m.menuModificar();
                                        auxOption=m.pedirString();
                                        switch(auxOption){
                                            case "1":
                                                bank.get(index).setNombre(m.pedirNombre());
                                                break;
                                            case "2":
                                                bank.get(index).setApellido1(m.pedirApellido1());
                                                break;
                                            case "3":
                                                bank.get(index).setApellido2(m.pedirApellido2());
                                                break;
                                            case "4":
                                                bank.get(index).setTipoInt(m.pedirInteres());
                                                break;
                                            case "5":
                                                break;
                                            default:
                                                System.out.println("La operación no existe");
                                                break;  
                                        }
                                    }
                                    break;
                                case "7":
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
