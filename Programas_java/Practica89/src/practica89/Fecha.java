/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica89;
import java.util.Calendar; // Necesario para pedir la fecha del sistema
import java.util.GregorianCalendar;
/**
 *
 * @author lidia
 */
public class Fecha {
    /**
     * Dia de la fecha
     */
    private int dia;
    /**
     * Mes de la fecha
     */
    private int mes;
    /**
     * Año de la fecha
     */
    private int año;
    /**
     * Constructor por defecto.
     */
    public Fecha(){
        dia=0;
        mes=0;
        año=0;    
    }
    /**
     * Constructor que inicializa fecha con los valores introducidos
     * para dia, mes y año
     * @param dia dia de la fecha
     * @param mes mes de la fecha
     * @param año año de la fecha
     */
    public Fecha(int dia,int mes,int año){
        if(fechaValida(dia,mes, año)==true){
            this.dia=dia;
            this.mes=mes;
            this.año=año;
        }else{
            System.out.println("Fecha no válida");
        }
    }
    /**
     * Metodo que devuelve el valor del atributo día
     * @return día dia de la fecha
     */
    public int getDia(){
        return dia;
    }
    /**
     * Método que devuelve el valor de la atributo mes
     * @return mes mes de la fecha
     */
    public int getMes(){
        return mes;
    }
    /**
     * Método que devuelve el valor de la atributo año
     * @return año año de la fecha
     */
    public int getAño(){
        return año;
    }
    /**
     * Método para modificar el valor del atributo año dado
     * el valor introducido como parametro
     * @param año año de la fecha
     */
    public void setAño(int año){
        this.año=año;
    }
    /**
     * Método para modificar el valor del atributo dia dado
     * el valor introducido como parametro
     * @param dia dia de la fecha
     */
    public void setDia(int dia){
        this.dia=dia;
    }
    /**
     * Método para modificar el valor del atributo mes dado
     * el valor introducido como parametro
     * @param mes mes de la fecha
     */
    public void setMes(int mes){
        this.mes=mes;
    }
    /**
     * Metodo que devuelve el mes en formato texto.
     * @return mes mes en formato texto
     */
    public String getMesTexto(){
        String mesTexto="";
        switch(mes){
            case 1:
                mesTexto="Enero";
                break;
            case 2:
                mesTexto="Febrero";
                break;
            case 3:
                mesTexto="Marzo";
                break;
            case 4:
                mesTexto="Abril";
                break;
            case 5:
                mesTexto="Mayo";
                break;
            case 6:
                mesTexto="Junio";
                break;
            case 7:
                mesTexto="Julio";
                break;
            case 8:
                mesTexto="Agosto";
                break;
            case 9:
                mesTexto="Septiembre";
                break;
            case 10:
                mesTexto="Octubre";
                break;
            case 11:
                mesTexto="Noviembre";
                break;
            case 12:
                mesTexto="Dice";
                break;
        }
        return mesTexto;
    }
    /**
     * Método que devulve la fecha del sistema en un listado.
     * Valor 1 dia, valor 2 mes, valor 3 año.
     * @return fecha del sistema en un listado de numeros enteros
     */
    public int[] fechaSistema(){
        int diaSy,mesSy,añoSy;
        Calendar fecha = new GregorianCalendar();
        diaSy = fecha.get(Calendar.DAY_OF_MONTH);
        mesSy = fecha.get(Calendar.MONTH)+1;
        añoSy = fecha.get(Calendar.YEAR);        
        
        return new int[]{diaSy, mesSy, añoSy};
    }
    /**
     * Metodo para saber si el año es bisiesto
     * @param mes mes de la fecha
     * @param año año de la fecha
     * @return boolean (true/false) año bisiesto 
     */
    public boolean bisiesto(int mes, int año){
       boolean bisiesto=false;
       if(mes==2){
           if(año%4==0){
               if(año%100==0 && año%400!=0){
               }else{
                   bisiesto=true;
               }
           }
       }
       
       return bisiesto;
    }
    /**
     * Metodo para saber si la fehca es válida
     * @param dia día de la fecha
     * @param mes mes de la fecha
     * @param año año de la fecha
     * @return boolean (true/false) fecha valida
     */
    public final boolean fechaValida(int dia,int mes,int año){
        boolean valida, bisiesto;
        bisiesto= bisiesto(mes, año);
        
        int[] fechaSistema = fechaSistema();
        if(año>fechaSistema[2]){ //año de nacimiento mayor que el actual
            valida=false;   
        } else if(año==fechaSistema[2] && mes>fechaSistema[1]){ //mismo año, mes de nacimiento 
            valida=false;
        } else if(año==fechaSistema[2] && mes==fechaSistema[1] && dia>fechaSistema[0]){
            valida=false;
        } else if(dia<1 || dia>31 || mes<1 || mes>12){
            valida=false;
        } else if(bisiesto==true && dia>29){
            valida=false;
        } else if(bisiesto==false && dia>28){
            valida=false;
        }else if((mes==4||mes==6||mes==9||mes==11) && dia>30){
            valida=false;
        
        }else{
            valida=true;
        }
        
        
        return valida;
    }
    
    
}
