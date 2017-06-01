/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.ex3;
/**
 *
 * @author lidia
 */
public class PracticaEX3 {

    /**
     * Programa para realizar la conversion de una longitud dada en pies 
     * a yardas, pulgadas y centimetros
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar objetos
        Menu m1 = new Menu();
        Conversor conv= new Conversor();
        
        conv.setFt(m1.pedirFt());
        m1.mostrarMenu();
        m1.setOpcion();
        
        switch(m1.getOpcion()){
            case "1": //De pies a yardas
               conv.setResult(conv.ftYd());
               System.out.println(conv.getFt()+"ft = "+conv.getResult()+"yd");
               break;
            case "2": // De pies a Pulgadas
                conv.setResult(conv.ftIn());
                System.out.println(conv.getFt()+"ft = "+conv.getResult()+"in");
                break;
            case "3": // De pies a Cm
                conv.setResult(conv.ftCm());
                System.out.println(conv.getFt()+"ft = "+conv.getResult()+"cm");
                break;
            default:
                System.out.println("No existe esa opción");
                break;
        }
        
        
    }
    
}
