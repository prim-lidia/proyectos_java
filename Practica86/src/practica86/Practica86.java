/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica86;

/**
 *
 * @author lidia
 */
public class Practica86 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar objetos y variables
        Contador i = new Contador();
        Menu m = new Menu();
        String s, operacion;
        float limite, variacion;
        //Entrada al menú principal
        do{
            s=m.pedirDirección();   //pedir dirección del contador  
        }while(m.validarDir(s)==false); //Condición para salor del primer menú
        
        // Entrada al segundo menú       
        do{
            operacion=m.pedirOperacion(s); //pedir la operaciñón a realizar entre el contador y la variación
        }while(m.validarOperacion(operacion)==false);//Condición para salor del primer menú
        
        i.setContador(m.pedirContador()); //Pedir y modificar el contador
        variacion=m.pedirVar(operacion); //Pedir y modificar la variación
        
        //Pedir el límite
        do{
            limite=m.pedirLimite();
        }while(m.validarLimite(i.getContador(),limite, operacion)==false);
        
        //Realizar la operación elegida
        switch(operacion){
            case "I+": //Incrementar sumando
                while(i.getContador()<limite){
                    i.incrementarSuma(variacion);
                }
                break;
            case "IX": // Incrementar multiplicando
                while(i.getContador()<limite){
                    System.out.println(i.getContador());
                }
                break;
            case "I-":// Decrementar restanto
                while(i.getContador()>limite){
                    i.decrementarResta(variacion);
                }
                break;
            case "I/": // Decrementar dividiendo
                while(i.getContador()>limite){
                    i.decrementarDiv(variacion);
                }
                break;
        }
        
    }
    
}
