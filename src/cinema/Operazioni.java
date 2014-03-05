/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

/**
 *
 * @author Capoferri.denis
 */
public class Operazioni {
    int i, j;
    char[][] cinema = new char[10][10];
    public synchronized void prenota(int PostoX, int PostoY){
        for(int i=0; i<PostoX; i++){
            for(int j=0; j<PostoY; j++){
                System.out.println(cinema[i][j] + " ");
            }
        }
    }
    public synchronized void acquista(int PostoX, int PostoY){
      for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                System.out.println(cinema[i][j] + " ");
            }
        }
    }
    public synchronized void annulla(int PostoX, int PostoY){
        
    }
    public synchronized void stampa(){
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                System.out.println(cinema[i][j] + " ");
            }
        }
    }
}
