/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcoli;

/**
 * qua avviene la somma dei valori dei thread con un valore assegnato
 * @author Scarpari Mattia
 */
public class CalcoloEdInserisco implements Runnable{
       private double B;
       private GestCalcoli gc;
       
          /**
        * @param b = quantità da sommare al risultato
        * @param gc = risultato e possibili modifiche ad esso grazie all'istanza della classe GestCalcoli
        * @see GestCalcoli
        */
       
       public CalcoloEdInserisco (double b, GestCalcoli gc){
           B = b;
           this.gc = gc;
       }
    
       public void run(){
           gc.setRisultato(gc.getRisultato()+B);
           System.out.println(Thread.currentThread().getName()+ " " + gc.getRisultato());
       }
       /**
        * run stampa il nuovo risultato ottenuto dalla somma del valore più il risultato vecchio nell'istante corrente,ed il proprio nome
        */
}