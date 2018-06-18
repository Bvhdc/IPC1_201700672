
import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dfend
 */
public class Personaje {
    public int pospery=1;
    public int posperx=3;
    public int posper1y=5;
    public int posper1x=6;
    public int posper2y=2;
    public int posper2x=1;
    public int posper3y=7;
    public int posper3x=1;
    public int posper4y=6;
    public int posper4x=3;
    public int posper5y=9;
    public int posper5x=8;
    public int posper6y=7;
    public int posper6x=2;
    public void posicionesiniciales(int tam){
    Random random=new Random();
this.posper1x=random.nextInt(tam-1);
this.posper1y=random.nextInt(tam-1);
this.posper2x=random.nextInt(tam-1);
this.posper2y=random.nextInt(tam-1);
this.posper3x=random.nextInt(tam-1);
this.posper3y=random.nextInt(tam-1);
this.posper4x=random.nextInt(tam-1);
this.posper4y=random.nextInt(tam-1);
this.posper5x=random.nextInt(tam-1);
this.posper5y=random.nextInt(tam-1);
this.posper6x=random.nextInt(tam-1);
this.posper6y=random.nextInt(tam-1);

}
    
   public ImageIcon obtenerImagen(int tamx,int tamy,int jug){
    if(jug==1){ImageIcon per=new ImageIcon(getClass().getResource("/Imagenes/PrincesaJugador1.png"));
    Image imagen= per.getImage();
    Image tamimagen=imagen.getScaledInstance(tamx,tamy,Image.SCALE_SMOOTH);
    per= new ImageIcon(tamimagen);
        return per;}
    if(jug==2){ImageIcon per=new ImageIcon(getClass().getResource("/Imagenes/caballerojugador1.jpg"));
    Image imagen= per.getImage();
    Image tamimagen=imagen.getScaledInstance(tamx,tamy,Image.SCALE_SMOOTH);
    per= new ImageIcon(tamimagen);
        return per;}
    if(jug==3){ImageIcon per=new ImageIcon(getClass().getResource("/Imagenes/magojugador1.png"));
    Image imagen= per.getImage();
    Image tamimagen=imagen.getScaledInstance(tamx,tamy,Image.SCALE_SMOOTH);
    per= new ImageIcon(tamimagen);
        return per;}
    if(jug==4){ImageIcon per=new ImageIcon(getClass().getResource("/Imagenes/Possessed_Zelda.png"));
    Image imagen= per.getImage();
    Image tamimagen=imagen.getScaledInstance(tamx,tamy,Image.SCALE_SMOOTH);
    per= new ImageIcon(tamimagen);
        return per;}
    if(jug==5){ImageIcon per=new ImageIcon(getClass().getResource("/Imagenes/Dark_Link.jpg"));
    Image imagen= per.getImage();
    Image tamimagen=imagen.getScaledInstance(tamx,tamy,Image.SCALE_SMOOTH);
    per= new ImageIcon(tamimagen);
        return per;}
    if(jug==6){ImageIcon per=new ImageIcon(getClass().getResource("/Imagenes/DarkS.png"));
    Image imagen= per.getImage();
    Image tamimagen=imagen.getScaledInstance(tamx,tamy,Image.SCALE_SMOOTH);
    per= new ImageIcon(tamimagen);
        return per;}
    return null;
    }
   public void setposper(int posx,int posy,int pers){
   if(pers==1){
   posper1x=posx;
   posper1y=posy;
   }
   if(pers==2){
   posper2x=posx;
   posper2y=posy;
   }
   if(pers==3){
   posper3x=posx;
   posper3y=posy;
   }
   if(pers==4){
   posper4x=posx;
   posper4y=posy;
   }
   if(pers==5){
   posper5x=posx;
   posper5y=posy;
   }
   if(pers==6){
   posper6x=posx;
   posper6y=posy;
   }
   }
public int getposper(String eje, int pers){
if(eje=="x"){
switch(pers){
   case 1: return posper1x;
      
   case 2: return posper2x;
      
   case 3: return posper3x;
      
   case 4: return posper4x;
      
   case 5: return posper5x;
      
   case 6: return posper6x; 
}}
if(eje=="y"){
switch(pers){
   case 1: return posper1y;
      
   case 2: return posper2y;
      
   case 3: return posper3y;
      
   case 4: return posper4y;
      
   case 5: return posper5y;
      
   case 6: return posper6y; 
}}

        return 0;
}
/*public int atacar(int numjug){
if()




}*/

}
   
   

