/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica90;
import java.util.Scanner;
/**
 *
 * @author lidia
 */
public class Practica90 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dni dni= new Dni();
        Scanner sc =  new Scanner(System.in);
        
        System.out.println("Digitos del dni:");
        dni.setNumero(sc.nextInt());
        
        if(dni.getNumero()!=0){
            System.out.println("Letra:"+dni.getLetra());
        }else{
            System.out.println("El numero introducido no es válido");
        }
    }
    
}
