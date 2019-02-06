/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionexcepciones;

/**
 *
 * @author dmadero
 */
public class Excepcion2 {

    public Excepcion2() {
        int x = 0;
        try{
            this.divisionCero();
        }catch(ArithmeticException e){
        
        }
      
    }
   public void divisionCero(){
       int c=0;
       String x = null;
       for(int i=0;1<10; i++)
       try{
            c=5/i;
            x.length();
            System.out.println("punto control 1");
       }
       catch(ArithmeticException e){
           // System.out.println(e.getMessage());
           throw new ArithmeticException();
        }
       catch(NullPointerException e){
        throw new ArithmeticException();
       }
       finally{
           System.out.println("Finalizacion");
       }
       }

    public static void main(String[] args) {
        try{
        Inversiones  i = new Inversiones();
        }catch(ArithmeticException e){
            System.out.println("division por 0");
        }
    }
}
   
