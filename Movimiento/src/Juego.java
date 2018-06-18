
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryan
 */
public class Juego {
    public int numdado;
    public JLabel displayd;
    public JLabel displayo;
    public Personaje per;
    public Personaje per2;
    public Personaje per3;
    public Personaje per4;
    public Personaje per5;
    public Personaje per6;
    public int v=5;
    public int v1=5;
    public int turno=1;
    
   
    public Juego(){
    }
    public boolean terminarturno(){
    return true;
    
    }
    public void Dado(JLabel displayd){
        this.displayd=displayd;
        Random random=new Random();
        numdado=random.nextInt(6)+1;
        displayd.setText((Integer.toString(numdado)));
        
        displayd.setOpaque(false);
        
        
    }
   public void mantenerjuego(){



}
   public void vidas(JLabel vidj,JLabel vidj2){
   vidj.setText((Integer.toString(v)));
vidj2.setText((Integer.toString(v1)));
   
   
   }
public void restarvidas(int cas){
if(cas>0&&cas<=3){
v1=v1-1;

}
if(cas>3&&cas<=6){
v=v-1;
}

}
   
  public int turnos(int x){
if(x==1){
this.turno=2;
}
if(x==2){
this.turno=1;
}
return 0;
}  
    
    
  
}
