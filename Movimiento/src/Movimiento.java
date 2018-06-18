
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dfend
 */
public class Movimiento extends Thread{
    public int cantidad=0;
    public int cas=0;
    public int casm=0;
    public Tablero tab=null;
    public Juego vidas;
    public Movimiento(int cantidad, Tablero tablero,int cas,int casm){
        this.cantidad=cantidad;
        this.tab=tablero;
        this.casm=casm;
        this.cas=cas;
    }
    
    public boolean comprobarfin(){
        if(tab.per.getposper("y",cas)>=tab.tam-1||tab.per.getposper("x",cas)>=tab.tam-1){
            return true;
        }
        return false;
    }
    public boolean comprobarfin1(){
    if(tab.per.getposper("y",cas)<=0||tab.per.getposper("x",cas)<=0){
        return true;}
    return false;}
    
    public void moverAbajo(int cantidad){
        if(cantidad<=0){
            return;
        }
        if(comprobarfin()){
            int x=tab.per.getposper("x",cas);
            int y=tab.per.getposper("y", cas);
            tab.vecL[x][tab.tam-1]=0;
            tab.vecG[x][tab.tam-1].setIcon(null);
            
            tab.per.setposper(x,0,cas);
            tab.vecL[tab.per.getposper("x",cas)][tab.per.getposper("y", cas)]=cas;
            tab.repintar();
            cantidad--;
            moverAbajo(cantidad);
            return;
        }else{
            try {
                int x=tab.per.getposper("x",cas);
            int y=tab.per.getposper("y", cas);
                tab.vecL[x][y]=0;
                tab.vecG[x][y].setIcon(null);
                tab.repintar();
                tab.per.setposper(x,y+1,cas);
                tab.vecL[tab.per.getposper("x",cas)][tab.per.getposper("y",cas)]=cas;
                tab.repintar();
                cantidad--;
                Thread.sleep(50);
                
                moverAbajo(cantidad);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    public void moverArriba(int cantidad){
        if(cantidad<=0){
            return;
        }
        if(comprobarfin1()){
            int x=tab.per.getposper("x",cas);
            int y=tab.per.getposper("y", cas);
            tab.vecL[x][0]=0;
            tab.vecG[x][0].setIcon(null);
            tab.per.setposper(x,tab.tam-1,cas);
            tab.vecL[tab.per.getposper("x",cas)][tab.per.getposper("y", cas)]=cas;
            tab.repintar();
            cantidad--;
            moverArriba(cantidad);
            return;
        }else{
            try {
                //mover una posicion
                int x=tab.per.getposper("x",cas);
            int y=tab.per.getposper("y", cas);
                tab.vecL[x][y]=0;
                tab.vecG[x][y].setIcon(null);
                tab.repintar();
                tab.per.setposper(x,y-1,cas);
                tab.vecL[tab.per.getposper("x",cas)][tab.per.getposper("y",cas)]=cas;
                tab.repintar();
                cantidad--;
                Thread.sleep(50);
                
                moverArriba(cantidad);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    public void moverDerecha(int cantidad){
        if(cantidad<=0){
            return;
        }
        if(comprobarfin()){
            int x=tab.per.getposper("x",cas);
            int y=tab.per.getposper("y", cas);
            tab.vecL[tab.tam-1][y]=0;
            tab.vecG[tab.tam-1][y].setIcon(null);
            tab.per.setposper(0,y,cas);
            tab.vecL[0][tab.per.getposper("y",cas)]=cas;
            tab.repintar();
            cantidad--;
            moverDerecha(cantidad);
            return;
        }else{
            try {
                //mover una posicion
                int x=tab.per.getposper("x",cas);
            int y=tab.per.getposper("y", cas);
                tab.vecL[x][y]=0;
                tab.vecG[x][y].setIcon(null);
                tab.repintar();
                tab.per.setposper(x+1,y,cas);
                tab.vecL[tab.per.getposper("x",cas)][tab.per.getposper("y",cas)]=cas;
                tab.repintar();
                cantidad--;
                Thread.sleep(50);
                
                moverDerecha(cantidad);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    public void moverIzquierda(int cantidad){
        if(cantidad<=0){
            return;
        }
        if(comprobarfin1()){
            int x=tab.per.getposper("x",cas);
            int y=tab.per.getposper("y", cas);
            tab.vecL[0][y]=0;
            tab.vecG[0][y].setIcon(null);
            tab.per.setposper(tab.tam-1,y,cas);
            tab.vecL[tab.per.getposper("x",cas)][tab.per.getposper("y",cas)]=cas;
            tab.repintar();
            cantidad--;
            moverIzquierda(cantidad);
            return;
        }else{
            try {
                //mover una posicion
                int x=tab.per.getposper("x", cas);
                int y=tab.per.getposper("y", cas);
                tab.vecL[x][y]=0;
                tab.vecG[x][y].setIcon(null);
                tab.repintar();
                tab.per.setposper(x-1,y,cas);
                tab.vecL[tab.per.getposper("x",cas)][tab.per.getposper("y",cas)]=cas;
                tab.repintar();
                cantidad--;
                Thread.sleep(50);
                
                moverIzquierda(cantidad);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    public void atacar(){
    if((tab.per.getposper("x", cas)==tab.per.getposper("x", 1)+3)&&(tab.per.getposper("y", cas)==tab.per.getposper("y", 1)+3)){
    Juego vidas=new Juego();
    vidas.restarvidas(cas);
    }
    
    
    
    
    }
    public void run(){
        switch(casm){
            case 1: moverArriba(cantidad);
            break;
            case 2: moverDerecha(cantidad);
            break;
            case 3: moverAbajo(cantidad);
            break;
            case 4: moverIzquierda(cantidad);
            break;
            case 5: atacar();
        }
       
    
    }
}
