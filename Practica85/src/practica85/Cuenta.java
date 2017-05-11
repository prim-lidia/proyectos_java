/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica85;

/**
 *
 * @author lidia
 */
public class Cuenta {
    private String nombre, apellido1, apellido2, numCuenta;
    private double tipoInt, saldo;
    /**
     * Constructor por defecto
     */
    public Cuenta(){
        nombre= "";
        apellido1="";
        apellido1="";
        numCuenta="";
        tipoInt=0;
        saldo=0;
    }
    /**
     * Constructor que asigna a las propiedasdes del objeto el valor
     * de los parametros introducidos
     * @param nombre
     * @param apellido1
     * @param apellido2
     * @param numCuenta
     * @param tipoInt
     */
    public Cuenta(String nombre, String apellido1, String apellido2, String numCuenta, double tipoInt, double saldo){
        this.nombre= nombre;
        this.apellido1=apellido1;
        this.apellido1=apellido2;
        this.numCuenta=numCuenta;
        this.tipoInt=tipoInt;
        this.saldo=saldo;
    }
    /**
     * Constructor copia, crea una nuevo objeto con las mismas
     * propiedasdes que el objeto Cuenta introducido como parametro
     * @param cuenta 
     */
    public Cuenta(Cuenta cuenta){
        this.nombre= cuenta.nombre;
        this.apellido1=cuenta.apellido1;
        this.apellido2=cuenta.apellido2;
        this.numCuenta=cuenta.numCuenta;
        this.tipoInt=cuenta.tipoInt;
        this.saldo=cuenta.saldo;
    }
    /**
     * Modifica el nombre del ttular de la cuenta
     * @param nombre 
     */
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    /**
     * Modifica el primera apellido del titular de la cuenta
     * @param apellido1 
     */
    public void setApellido1(String apellido1){
        this.apellido1=apellido1;
    }
    /**
     * Modifica el segundo apellido del titular de la cuenta 
     * @param apellido2  Segundo apellido del titular de la cuenta
     */
    public void setApellido21(String apellido2){
        this.apellido2=apellido2;
    }
    /**
     * 
     * @param numCuenta  número de la cuenta
     */
    public void setNumCuenta(String numCuenta){
        this.numCuenta=numCuenta;
    }
    /**
     * 
     * @param tipoInt tipo de interés aplicado a la cuenta
     */
    public void setTipoInt(double tipoInt){
        this.tipoInt=tipoInt ;
    }
    /**
     * 
     * @param saldo saldo de la cuenta con decimales
     */
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    public void setTrans(){
        
    }
    /**
     * El método devuelve el nombre del titular de la cuenta
     * @return el nombre del titular
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * El método devuelve el primer apellido del titular de la cuenta
     * @return  el primer apellido del titular
     */
    public String getApellido1(){
        return apellido1;
    }
    /**
     * El método devuelve el segundo apellido del titular de la cuenta
     * @return  el segundo apellido del titular
     */
    public String getApellido2(){
        return apellido2;
    }
    /**
     * El método devuelve el número de cuenta
     * @return  el numero de cuenta
     */
    public String getNumCuenta(){
        return numCuenta;
    }
    /**
     * El método devuelve el tipo de interés de la cuenta
     * @return  el tipo Interes de la cuenta
     */
    public double getTipoInt(){
        return tipoInt;
    }
    /**
     * El método devuelve el saldo de la cuenta
     * @return  el saldo  de la cuenta
     */
    public double getSaldo(){
        return saldo;
    }
    
    public boolean saldoSuficiente(float importe){
        return (saldo>=importe);
    }
    public void ingreso(float importe){
        this.saldo= saldo+importe;
    }
    public void reintegro(float importe){
        if(saldoSuficiente(importe)==true){
            this.saldo=saldo-importe;
        }else{
            System.out.println("No dispone de saldo suficiente para hace el reintegro");
        }
    }
    public void transferencia(float importe, Cuenta cuenta){
        if(saldoSuficiente(importe)==true){
            reintegro(importe);
            cuenta.ingreso(importe);
        }else{
            System.out.println("No dispone de saldo suficiente para hace el reintegro");
        }

    }
}