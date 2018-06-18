
import java.awt.Image;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryan
 */
public class Miv {
    public int minas;
    public int vidas;
    
    public ImageIcon obtenerimagen(int tammx,int tammy){
    ImageIcon min=new ImageIcon(getClass().getResource("/Imagenes/mina.jpg"));
    
    Image imagenm=min.getImage();
    Image tamimagen=imagenm.getScaledInstance(tammx,tammy,Image.SCALE_SMOOTH);
    min= new ImageIcon(tamimagen);
    return min;
    }
    public ImageIcon obtenerimagenv(int tammx,int tammy){
    ImageIcon vid=new ImageIcon(getClass().getResource("/Imagenes/vida.png"));
    
    Image imagenv=vid.getImage();
    Image tamimagenv=imagenv.getScaledInstance(tammx,tammy,Image.SCALE_SMOOTH);                                 
    
    vid= new ImageIcon(tamimagenv);
    return vid;
    }
}
