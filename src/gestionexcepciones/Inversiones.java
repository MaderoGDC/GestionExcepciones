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
public class Inversiones {

    public Inversiones() {  
        this.divisionCero();
        int x=10;
    }
    public void divisionCero(){
        int c =0;
        try{
        for(int i = 0; i< 10; i++)
            c = 5/i;    
        System.out.println("punto 1");
        }catch(ArithmeticException e){
            System.out.println("division por 0");
        }
        System.out.println("punto 2");
        }
    public static void main(String[] args) {
        Inversiones  i = new Inversiones();
    }
}
