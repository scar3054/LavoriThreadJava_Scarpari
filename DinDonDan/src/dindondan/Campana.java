/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dindondan;

/**
 *
 * @author Scarpari Mattia
 */
public class Campana implements Runnable {
    String suono;
    int volte;
    /**
     * 
     * @param suono rumore della campana
     * @param volte numero di volte che la  campana suona
     */
    public Campana(String suono,int volte){
        this.suono = suono;
        this.volte = volte;
    }
    /**
     * stampa numero di volte che la campana deve suonare e il suono che  fa
     */
    public void run(){
        for(int k = 0; k < volte;k++){
            System.out.print ((k + 1) + suono + " ");
        }
    }
    
}
