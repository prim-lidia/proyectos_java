/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica83;
import java.util.Scanner;
/**
 *
 * @author lidia
 */
public class Practica83 {

    /**
     * El programa pide los valores de a, b, c y calcula el valro de x
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declarar objetos
        Ecuacion e1= new Ecuacion();
        Menu m1= new Menu();
        Transformador t1= new Transformador();
        //Pedir las constantes a,b,c
        
        m1.pedirA();
        e1.setA(t1.establecerNum(m1.leerString()));//Modificar a
        m1.pedirB();
        e1.setB(t1.establecerNum(m1.leerString()));//Modificar b
        m1.pedirC();
        e1.setC(t1.establecerNum(m1.leerString()));//Modificar c
        e1.setD(); //Calcular discriminante
         
        //Calcular resultado que depende del discriminante
        if(e1.getD()<0){ //no hay resultado
            System.out.println("No hay raices");
        }else{
            e1.setResult();
            if(e1.getD()==0){ //hay un solo resultado
                System.out.println("x= "+e1.getResult_i(0));
            }else{ // hay dos resultados
                System.out.println("x1= "+e1.getResult_i(0));
                System.out.println("x2= "+e1.getResult_i(1));
            }
        } 
        
    }
    
}
