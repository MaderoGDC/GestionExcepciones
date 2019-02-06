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
public class GestionExcepciones {

    public GestionExcepciones() {
        divideByZero();
    }
        int divideByZero(){
        return 25/0;
        }
   
 
    public static void main(String[] args) {
        new GestionExcepciones();
    }
}
