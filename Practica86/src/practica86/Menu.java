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
    public float pedirContador(){
        System.out.println("Valor incial del contador:");
        return pedirFloat();
    }
    
    public String pedirString(){
      Scanner read= new Scanner(System.in);
      String s= read.nextLine();
      return s.toUpperCase();
    }
    public float pedirFloat(){
      Scanner read= new Scanner(System.in);
      float x= read.nextFloat();
      return x;
    }
    public String pedirDirección(){
        System.out.println("¿Quieres incermentar o decrementar[i/d]? ");
        String s= pedirString();
        if(validarDir(s)==false){
            s="";
        }
        return s;
    }
    
    public boolean validarDir(String s){
        boolean valido;
        valido=(s.equals("I")||s.equals("D"));
        return valido;
    }
    
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
    public boolean  validarOperacion(String s){
        boolean valido;
        valido=(s.equals("I+")||s.equals("IX")||s.equals("D-")||s.equals("D/"));
        return valido;
    }
    
    public float pedirVar(String s){
        if(s.equals("I+")||s.equals("IX")){
            System.out.println("Valor de incremento:");
        }else{
            System.out.println("Valor de decrementro:");
        }
        return Math.abs(pedirFloat());
    }
    public float pedirLimite(){
        System.out.println("Valor limite:");
        return pedirFloat();
    }
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
