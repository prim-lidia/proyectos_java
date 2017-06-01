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
        this.apellido2=apellido2;
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
    public void setApellido2(String apellido2){
        this.apellido2=apellido2;
    }
    /**
     * Modifica el número de la cuenta
     * @param numCuenta  número de la cuenta
     */
    public void setNumCuenta(String numCuenta){
        this.numCuenta=numCuenta;
    }
    /**
     * Modifica el tipo de interé de la cuenta
     * @param tipoInt tipo de interés aplicado a la cuenta
     */
    public void setTipoInt(double tipoInt){
        this.tipoInt=tipoInt ;
    }
    /**
     * Modifica el saldo de la cuenta
     * @param saldo saldo de la cuenta con decimales
     */
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    /**
     * Devuelve el nombre del titular de la cuenta
     * @return el nombre del titular
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Devuelve el primer apellido del titular de la cuenta
     * @return  el primer apellido del titular
     */
    public String getApellido1(){
        return apellido1;
    }
    /**
     * Devuelve el segundo apellido del titular de la cuenta
     * @return  el segundo apellido del titular
     */
    public String getApellido2(){
        return apellido2;
    }
    /**
     * Devuelve el número de cuenta
     * @return  el numero de cuenta
     */
    public String getNumCuenta(){
        return numCuenta;
    }
    /**
     * Devuelve el tipo de interés de la cuenta
     * @return  el tipo Interes de la cuenta
     */
    public double getTipoInt(){
        return tipoInt;
    }
    /**
     * Devuelve el saldo de la cuenta
     * @return  el saldo  de la cuenta
     */
    public double getSaldo(){
        return saldo;
    }
    /**
     * Comprueba si hay saldo suficiente en la cuenta para
     * poder realizar una retirada de dinero. 
     * @param importe dinero para realizar la operación
     * @return saldo suficiente (true/false)
     */
    public boolean saldoSuficiente(float importe){
        return (saldo>=importe);
    }
    /**
     * Modifica la propiedad saldo de la cuenta 
     * añadiendo el importe que se introduce como parámetro
     * @param importe dinero para realizar la operación
     */
    public void ingreso(float importe){
        this.saldo= saldo+importe;
    }
    /**
     * Modifica la propiedad saldo de la cuenta 
     * restando el importe introducido como parámetro
     * siempre y cuando haya saldo suficiente en la cuenta
     * @param importe dinero para realizar la operación
     */
    public void reintegro(float importe){
        if(saldoSuficiente(importe)==true){
            this.saldo=saldo-importe;
        }else{
            System.out.println("No dispone de saldo suficiente para hace el reintegro");
        }
    }
    /**
     * Modifica la propiedad saldo de la cuenta 
     * restando el importe introducido como parámetro
     * y añade el mismo importe a la cuenta introducida como parametro
     * @param importe importe de la transferencia
     * @param cuenta de destino de la trasnferencia
     */
    public void transferencia(float importe, Cuenta cuenta){
        if(saldoSuficiente(importe)==true){
            reintegro(importe);
            cuenta.ingreso(importe);
        }else{
            System.out.println("No dispone de saldo suficiente para hace el reintegro");
        }

    }
}