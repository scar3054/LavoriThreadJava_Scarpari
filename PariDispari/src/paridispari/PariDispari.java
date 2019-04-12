/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paridispari;

/**
 * il programma sfrutta i thread per contare i numeri pari e quelli dispari per poi stamparli
 * @author Scarpari Mattia
 */
public class PariDispari extends Thread{
  private int massimo;
  private boolean pari;
  private int ritardo = 500;
  
  /**
   * @param finale numero di volte in cui viene effettuato un output
   * @param pari indica se il valore è pari
   */
  
  public PariDispari (int finale, boolean pari){
    massimo   = finale;
    this.pari = pari;
  }
      

  
  public void run(){
    String chisono;
    chisono = Thread.currentThread().getName();
    for (int xx = 0; xx < massimo; xx++){
      if(pari){              // se è il thread che deve stampare i numeri pari 
        if(xx % 2 == 0)      // numero pari 
          System.out.println(chisono+"-pari "+xx);
      }  
      else                   // se è il thread che deve stampare i numeri dispari 
        if (xx % 2 != 0)     // numero dispari 
          System.out.println(chisono+"-dispari "+xx);
      try {Thread.sleep(ritardo);} 
      catch (InterruptedException e){System.out.println(e);}
    }  
  }
  public static void main(String[] args){
    if (args.length != 1){
	  System.out.println("Dovresti passare il numero intero");
	  return;
    }    
    int n = Integer.parseInt(args[0]);
    Thread TP = new PariDispari (n + 1, true);  // thread che conta i pari
    Thread TD = new PariDispari (n + 1, false); // thread che conta i dispari
    System.out.println("->Contate fino a " + n);
    TP.start();                                 // avvio esecuzione thread
    TD.start();
    try{
      TP.join();                                // attesa terminazione thread
      TD.join();
    }
    catch(Exception e){}
    System.out.println("<-Fine conteggio!");   
  }
 }
