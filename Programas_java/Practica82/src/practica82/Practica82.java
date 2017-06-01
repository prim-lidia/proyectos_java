/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica82;
import java.util.Scanner;
/**
 *
 * @author lidia
 */
public class Practica82 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Declarar objeto */
        Desglosador des = new Desglosador();
        
        /* Pedir dinero */
        Scanner leer = new Scanner(System.in);
        System.out.println("Dinero a desglosar:");
        des.setDinero(leer.nextInt());
        
        /* Calcular desglose */
        des.setCantidadMon(des.getDinero());
        
        System.out.println("\n DESGLOSE DE BILLETES/MONEDAS PARA "+des.getDinero()+"€");
        System.out.println("---------------------------------------------------------");
        /* Mostrar desglose */
        for(int i=0; i<des.getLenghtArray();i++){
            if(des.getValorIndex(i)>=5){
                System.out.print("Billetes de ");
            }else{
                System.out.print("Monedas de ");
            } 
            System.out.print(des.getValorIndex(i) + ": ");
            System.out.println(des.getCantidadIndex(i));
        }
        
        
    }
    
}
