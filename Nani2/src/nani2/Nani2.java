/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nani2;

/**
 * si creano un certo numero di thread adibiti al conteggio dei nani
 * @author Scarpari Mattia
 */
public class Nani2 {
    public static void main(String[] args) {
        Thread thr1 = new ContaINani2("Scarpari");
        Thread thr2 = new ContaINani2("Santana");
        thr1.start();
        thr2.start();
    }
}
