/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nani2;

/**
 * crea un conta nani e gli da un nome
 * @author Scarpari Mattia
 */
public class ContaINani2 extends Thread{
    public ContaINani2(String nome){
        super();
        setName(nome);
    }
/**
 * run stampa il numero del nano e il suo nome
 */
public void run(){
    for (int i = 0; i < 7; i++) 
        System.out.println((i+1) + " "+ getName());
    }   
}
