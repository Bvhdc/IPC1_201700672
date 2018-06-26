
package practica1;

import javax.swing.JTextArea;

public class ListaEspera {
  public NodoAvion primero;
 
  
  public void insertar(NodoAvion nuevo){
      if(primero==null){
      primero=nuevo;
      }else{
          nuevo.sig=primero;
            primero=nuevo;
        }
  }
  public void remover(Mantenimiento m){
      if(primero!=null){
      NodoAvion aux=primero;
      NodoAvion ant=null;
      while(aux!=null&&m.est==true){
          ant=aux;
          //m.setData(aux);
          aux=aux.sig;
      }if(aux==null){
          return;
      }if(ant==null){
          primero=primero.sig;
          m.setData(aux);
          
          aux.sig=null;
          aux=null;
      }else{
          ant.sig=aux.sig;
          aux.sig=null;
          aux=null;
      }
      
      }else{return;}
  
  }
  
  public void recorrer(JTextArea consola){
      consola.append("********ListaEspera*********************"+"\n");
        if(primero==null){
            consola.append("LISTA VACIA"+"\n");
        }else{
            NodoAvion aux=primero;
            while (aux!=null){
                
                consola.append("*******Avion"+aux.getNavion()+"*********"+"\n");
                consola.append("Tipo:"+aux.getTipo()+"\n");
                consola.append("Pasajeros:"+"\n");
                consola.append("Desabordaje:"+"\n");
                aux=aux.sig;
            }
        }
    
       }
}
      
  
  

