/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica86;
import java.util.Scanner;
/**
 *
 * @author lidia
 */
public class Menu {
    /**
     * Pide el contador por pantalla y devuelve el valor introducido por teclado
     * @return número decimal introducido por teclado
     */
    public float pedirContador(){
        System.out.println("Valor incial del contador:");
        return pedirFloat();
    }
    /**
     * Devuelve una cadena de texto en mayusculas
     * @return cadena de texto intorducida por teclado en mayusculas
     */
    public String pedirString(){
      Scanner read= new Scanner(System.in);
      String s= read.nextLine();
      return s.toUpperCase();
    }
    /**
     * Devuelve el valor introducido por teclado
     * @return número decimal introducido por teclado
     */
    public float pedirFloat(){
      Scanner read= new Scanner(System.in);
      float x= read.nextFloat();
      return x;
    }
    /**
     * Pide la driección del cambio(Incrementar o decrementar) y devuelve el valor introducido por teclado
     * @return letra mayuscula que indica la dirección del contador
     */
    public String pedirDirección(){
        System.out.println("¿Quieres incermentar o decrementar[i/d]? ");
        String s= pedirString();
        if(validarDir(s)==false){
            s="";
        }
        return s;
    }
    /**
     * Comprueba si la dirección del contador existe
     * @param s dirección del contador
     * @return Devuvle true si la dirreción es valida
     */
    public boolean validarDir(String s){
        boolean valido;
        valido=(s.equals("I")||s.equals("D"));
        return valido;
    }
    /**
     * Pide  operaciñón de incremento (+,x) o decremento (-,/) 
     * y dvuelve la operación concreta añadiendole al parametro introducido es valido.
     * @param s
     * @return cadena de dos letras que indica la operación a realizar
     */
    public String pedirOperacion(String s){
        if(s.equals("I")){
            System.out.println("¿Incermentar mediante suma o multiplicacion?");
            System.out.println("+  Incrementar mediante suma");
            System.out.println("x  Incermentar mediante multiplicacion");
        }else{
            System.out.println("¿Decrementar mediante resta o división?");
            System.out.println("-  Incrementar mediante suma");
            System.out.println("/  Incermentar mediante multiplicacion");
        }
        String aux= pedirString();
        aux=s.concat(aux);
        if(validarOperacion(aux)==true){
            s=aux;
        }
        return s;
    }
    /**
     * Comprueba si la operación elegida es valida.
     * @param s sentido del contador
     * @return Devuelve true si la operación elegida es valida
     */
    public boolean  validarOperacion(String s){
        boolean valido;
        valido=(s.equals("I+")||s.equals("IX")||s.equals("D-")||s.equals("D/"));
        return valido;
    }
    /**
     * Pide por pantalla el valor de variación y devuelve el valor introducido por teclado
     * @param s operación de incremento/decremento
     * @return numero decimal
     */
    public float pedirVar(String s){
        if(s.equals("I+")||s.equals("IX")){
            System.out.println("Valor de incremento:");
        }else{
            System.out.println("Valor de decrementro:");
        }
        return Math.abs(pedirFloat());
    }
    /**
     * Pide por pantalla el valor límite del contador y devuelve el valor introducido por teclado
     * @return numero decimal
     */
    public float pedirLimite(){
        System.out.println("Valor limite:");
        return pedirFloat();
    }
    /**
     * Comprueba si el limite es válido teniendo en cuenta la operación s elegida 
     * y valor del contador.
     * @param contador numero inicial del contador
     * @param limite número final al que llega el contador
     * @param s operación de incremento/decremento elegida
     * @return Devuelve true si el limite es valida
     */
    public boolean validarLimite(float contador, float limite, String s){
        boolean valido;
        if((s.equals("I+")||s.equals("IX"))&& contador >= limite){
            valido=false;
        }else {
            valido = !((s.equals("I-")||s.equals("I/X"))&& contador <= limite);
        }
        return valido;
    }
    
}
