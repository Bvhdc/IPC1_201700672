
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.Random;

public class Tablero {
    public int tam=0;
    public JPanel fondo=null;
    public Personaje per;
    public Personaje per2;
    public Personaje per3;
    public Personaje per4;
    public Personaje per5;
    public Personaje per6;
    public int[][]vecL;
    public JLabel[][]vecG;
    public int tambloquey=0;
    public int tambloquex=0;
    public Miv min;
    public Miv vid;
    
    public Tablero(int tam, JPanel panel){
        this.tam=tam;
        this.fondo=panel;
        llenar();
    }
    
    public void llenar(){

        tambloquey=600/tam;
        tambloquex=600/tam;
        vecL=new int[tam][tam];
        vecG=new JLabel[tam][tam];
        //1 persona, 0 casillas vacias
        //vecL[1][0]=1;
        per= new Personaje();
        per2= new Personaje();
        per3= new Personaje();
        per4= new Personaje();
        per5= new Personaje();
        per6= new Personaje();
        min= new Miv();
        vid= new Miv();
        
        //per.posper=0;
//        Personaje per =new Personaje();
        
        repintar();
    }
    public void generarelem(int tam){
    Integer G=tam;
        Double m = G.doubleValue()*G.doubleValue()*0.05;
        Double a = G.doubleValue()*G.doubleValue()*0.1;
        int v=m.intValue();
        int n=a.intValue();
        System.out.print(v);
    for(int i=0; i<=v; i++){
    Random random=new Random();
    int x= random.nextInt(tam);
    int y= random.nextInt(tam);
    vecL[x][y]=8;
 
    repintar();
    }
    for(int i=0; i<=a; i++){
    Random random=new Random();
    int x= random.nextInt(tam);
    int y= random.nextInt(tam);
    vecL[x][y]=7; 
    repintar();
    
    }
    repintar();
    
    }
    public void repintar(){
        JLabel casilla=null;
        for(int i=0;i<tam;i++){
            for(int j=0;j<tam;j++){
            
            if(vecL[i][j]==0){
                casilla= new JLabel();
                casilla.setIcon(null);
            } if(vecL[i][j]==1){
                casilla=new JLabel(this.per.obtenerImagen(tambloquex,tambloquey,1));
            } if(vecL[i][j]==2){
                casilla=new JLabel(this.per2.obtenerImagen(tambloquex,tambloquey,2));
            } if(vecL[i][j]==3){
                casilla=new JLabel(this.per3.obtenerImagen(tambloquex,tambloquey,3));
            } if(vecL[i][j]==4){
                casilla=new JLabel(this.per4.obtenerImagen(tambloquex,tambloquey,4));
                
            } if(vecL[i][j]==5){
                casilla=new JLabel(this.per5.obtenerImagen(tambloquex,tambloquey,5));
                
            } if(vecL[i][j]==6){
                casilla=new JLabel(this.per6.obtenerImagen(tambloquex,tambloquey,6));
                
            }
            if(vecL[i][j]==8){
                casilla=new JLabel(this.vid.obtenerimagenv(tambloquex,tambloquey));}
            if(vecL[i][j]==7){
                casilla=new JLabel(this.min.obtenerimagen(tambloquex,tambloquey));}
            
            casilla.setOpaque(false);
            casilla.setBorder(BorderFactory.createLineBorder(new Color(0,0,0)));
            casilla.setBounds(i*tambloquex,j*tambloquey,tambloquex,tambloquey);
            vecG[i][j]=casilla;
            fondo.add(vecG[i][j],BorderLayout.CENTER);
            fondo.repaint();
        }}
    }
 
}
