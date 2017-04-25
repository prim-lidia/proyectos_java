/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaex1;

/**
 *
 * @author lidia
 */
public class PracticaEX1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu m1= new Menu();
        m1.mostrarMenu();
        String opcion=m1.leerString();
        
        TrianguloR teorema = new TrianguloR();
        
        switch(opcion){
            case "A":
                teorema.setB(m1.pedirB());
                teorema.setC(m1.pedirC());
                teorema.calcA();
                System.out.println("RESULTADO: a = "+teorema.getA());
                break;
            case "B":
                teorema.setA(m1.pedirA());
                teorema.setC(m1.pedirC());
                teorema.calcB();
                System.out.println("RESULTADO: b = "+teorema.getB());
                break;
            case "C":
                teorema.setA(m1.pedirA());
                teorema.setB(m1.pedirB());
                teorema.calcC();
                System.out.println("RESULTADO: c = "+teorema.getC());
                break;
                
        }
        
   
    }
    
}
