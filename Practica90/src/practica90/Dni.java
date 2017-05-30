/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica90;

/**
 *
 * @author lidia
 */
public class Dni {
    /**
     * Numero del dni
     */
    private int numero;
    /**
     * letra del dni
     */
    private String letra;
    /**
     * Constructor de clase
     */
    public Dni(){
        /**
         * Numero de dni
         */
         numero=0;
         /**
          * Letra de dni
          */
         letra="";
    }
    /**
     * Constructor de clase especificando el numero del dni
     * @param numero numero del dni
     */
    public Dni(int numero){
        this.numero=numero;
        letra=definirLetra();
    
    }
    /**
     * Asigna la letra del dni mediante el resto del numero del objeto Dni
     * dividio por 23 y la coincidencia con el indice del listado de letras
     * @return letra letra del dni
     */
    public String definirLetra(){
        String[] Letras={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        int i;
        
        i= numero%23;
        return Letras[i];
    }
    /**
     * Modifica el numero del dni mediante un número entero introducido por parametro
     * comprobando si el número tiene 8 ditigos.
     * @param numero número del dni
     */
    public void setNumero(int numero){
        if(validarDigitos(numero)== true){
            this.numero=numero;
        }
        this.numero=numero;
    }
    /**
     * Modifica la letra del dni utilizando la funciñon definirLetra
     */
    public void setLetra(){
        letra=definirLetra();
    }
    /**
     * Devuelve el numero del dni
     * @return numero numero del dni
     */
    public int getNumero(){
        return numero;
    }
    /**
     * Devuelve la letra del dni
     * @return letra letra del dni
     */
    public String getLetra(){
        return letra;
    }
    /**
     * Comprueba que un número n tiene 8 dígitos
     * @param n numero de dni
     * @return Devuelve true si el número tiene 8 dígitos
     */
    public boolean validarDigitos(int n){
        boolean valido=false;
        if(n/10000000 > 0){
            valido=true;
        }
        return false;
    }
}
