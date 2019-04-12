/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nani;

/**
 *
 * @author Scarpari Mattia
 */
public class Nani {
    public static void main(String[] args) {
        ContaINani thr1 = new ContaINani();
        thr1.start();
        System.out.println(Thread.currentThread().getName());
    }
}
