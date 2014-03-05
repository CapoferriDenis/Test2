/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

/**
 *
 * @author Capoferri.denis
 */
public class MyThread extends Thread {
    String nome, azione;
    int  PostoX;
    int PostoY;
    int operazione;
    Operazioni op1 = new Operazioni();
    
    MyThread(String nome, String azione, int PostoX, int PostoY){
        this.nome = nome;
        this.azione = azione;
        this.PostoX = PostoX;
        this.PostoY = PostoY;
        Thread thrd = new Thread();
        thrd.start();
    }
    public void run(){
        if(azione.equals("prenota")){
            op1.prenota(PostoX,PostoY);
        }
        if(azione.equals("acquista")){
            op1.acquista(PostoX, PostoY);
        }
        if(azione.equals("annulla")){
            op1.annulla(PostoX, PostoY);
        }
        if(azione.equals("stampa")){
            op1.stampa();
        }
    }
}
