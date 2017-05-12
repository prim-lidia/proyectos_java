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
        do{
            s=m.pedirDirección();   
            
        }while(m.validarDir(s)==false);
                
        do{
            operacion=m.pedirOperacion(s);
        }while(m.validarOperacion(operacion)==false);
        System.out.println(operacion);
        i.setContador(m.pedirContador());
        variacion=m.pedirVar(operacion);
        
        do{
            limite=m.pedirLimite();
        }while(m.validarLimite(i.getContador(),limite, operacion)==false);

        switch(operacion){
            case "I+":
                while(i.getContador()<limite){
                    i.incrementarSuma(variacion);
                }
                break;
            case "IX":
                while(i.getContador()<limite){
                    System.out.println(i.getContador());
                }
                break;
            case "I-":
                while(i.getContador()>limite){
                    i.decrementarResta(variacion);
                }
                break;
            case "I/":
                while(i.getContador()>limite){
                    i.decrementarDiv(variacion);
                }
                break;
        }
        int j;
        
        /*for(j=1;j<9;j=j+2){
        System.out.println(j);
        }*/
        
    }
    
}
