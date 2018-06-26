package practica1;

import javax.swing.JTextArea;

public class ListaMaletas {
    Maleta primero;
    public void insertarinicio(int id){
    Maleta nuevo=new Maleta(id);
    if(primero==null){
                   primero=nuevo;
                   primero.sig=nuevo;
                   primero.ant=primero;
         }else{
                   Maleta aux=primero;
                   while(aux.sig!=primero)
                            aux=aux.sig;
                            aux.sig=nuevo;
                            nuevo.ant=aux;
                            nuevo.sig=primero;
                            primero.ant=nuevo;
                            primero=nuevo;
                  
         }
    
    }
    public void eliminar(Integer id){
    if(primero!=null){
    Maleta aux=primero;
    Maleta ant=null;
    while(aux.sig!=primero){
    if(aux.getId()==id){
    if(ant==null){
    if(aux.sig==primero)
    primero=null;
    else{
    ant=aux.ant;
    ant.sig=aux.sig;
    aux=aux.sig;
    aux.ant=ant;
    primero=aux;
    ant=null;
    }
      }else{
      aux.ant=null;
      ant.sig=aux.sig;
      aux=aux.sig;
      aux.ant=ant;
    }
}else{
    ant=aux;
    aux=aux.sig;
     }
         }   
               if(aux.getId()==id){
                    ant.sig=primero;
                    primero.ant=ant;
                    aux=null;
            }
                   
         }else
                   System.out.println("LISTA VACIA");
       }
    public void recorrer(JTextArea consola){
         if(primero==null)
                   System.out.println("<-->NULL<-->");
         else{
                   Maleta aux=primero;
                   consola.append("<--> Inicio");
                   do{
                            consola.append("Maleta:"+aux.getId()/*+" , "+aux.getDpi()+" ]"*/+"\n");
                            aux=aux.sig;
                   }while(aux!=primero);
                   System.out.println(" <-->NULL<-->");
         }
       }
}
