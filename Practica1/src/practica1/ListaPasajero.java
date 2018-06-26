
package practica1;

import javax.swing.JTextArea;


public class ListaPasajero {
    public Pasajero primero;
    public int ids=2;
    ListaMaletas lista=new ListaMaletas();
    public void insertar(){
        Pasajero nuevo=new Pasajero();
        
        if(primero==null){
             primero=nuevo;
             primero.setId(1);
             int i=nuevo.getMaletas();
            for(int j=0;j<i;j++)lista.insertarinicio(1);
             
         }else{
            nuevo.sig=primero;
            nuevo.setId(ids);
            int i=nuevo.getMaletas();
            for(int j=0;j<i;j++)lista.insertarinicio(ids);
            ids++;
            primero=nuevo;
         }
    
    
    }
    public void remover(){
    Pasajero aux1 = null,aux2;
    aux2=primero;
    
    if(primero.sig!=null){
    while(aux2.sig!=null){
        aux1=aux2;
        aux2=aux2.sig;
    }
    lista.eliminar(aux2.getId());
    aux1.sig=null;
    }
    else primero=null;
    }
    public void imprimir(JTextArea consola){
        consola.append("**********lista pasajeros**************\n");
    if(primero==null){
            consola.append("LISTA VACIA\n");
        }else{
            Pasajero aux=primero;
            while (aux!=null){
                consola.append("Pasajero:"+aux.getId()+"\n");
                consola.append("      "+"Maletas:"+aux.getMaletas()+"\n");
                consola.append("      "+"Documentos:"+aux.getDocs()+"\n");
                aux=aux.sig;
            }
            
        }
    consola.append("********final lista pasajeros***********\n");
    lista.recorrer(consola);
       }
    
    }

