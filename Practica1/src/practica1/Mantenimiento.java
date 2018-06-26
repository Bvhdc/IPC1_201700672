package practica1;

import javax.swing.JTextArea;

public class Mantenimiento {
    public NodoMantenimiento primero;
    public int na=1;
    public int man;
    public boolean est;
    public int search;
   

    public void setMan(int man) {
        this.man = man;
    }
    
    public void insertar(){
    
    for(int i=0;i<man;i++){
        NodoMantenimiento nuevo=new NodoMantenimiento();
        {if(primero==null){
      primero=nuevo;
      nuevo.setNum(na);
      }else{
        na=na+1;
          nuevo.sig=primero;
            primero=nuevo;
            nuevo.setNum(na);
        }
    
    }}}
    public void remover(NodoMantenimiento aux){
    aux.vaciar();/*if(primero!=null){
                  aux.vaciar();
                   NodoMantenimiento ant=null;
                   //ubicamos a aux en el nodo que vamos a eliminar
                   while((aux.getMantenimiento()==0)){
                            aux.vaciar();
                   } if(aux==null){
                            System.out.println("No existe el elemento");   
                   }
                   if(ant==null){
                            aux.vaciar();
                   }else{
                            aux.vaciar();
                   }
         }else{
            return;
         }*/
    
    
    
    
    }
    public void setData(NodoAvion aux1){
        search=0;
    if(primero==null){
            return;
        }else{
            NodoMantenimiento aux=primero;
            while (aux!=null&&search==0){
                
                if(aux.getEstado()=="vacio"){
                    search=1;
                aux.setAvion(aux1.getNavion());
                aux.setMantenimiento(aux1.getMantenimiento());
                aux.setTipo(aux1.getTipo());
                aux.setEstado("LLeno");
                
                }
                
                aux=aux.sig;
            }
           
        }
    
    }
    
    public void imprimir(JTextArea consola){
       consola.append("***********Estaciones Mantenimiento*************\n");
       if(primero==null){
            consola.append("LISTA VACIA");
        }else{
            NodoMantenimiento aux=primero;
            
            while (aux!=null){
                if(aux.getMantenimiento()==0){remover(aux);}
                if(aux.getMantenimiento()!=0)aux.setMantenimiento(aux.getMantenimiento()-1);
                consola.append("Estacion:"+aux.getNum()+"\n");
                consola.append("    "+"Estado:"+aux.getEstado()+"\n");
                consola.append("    "+"Avion:"+aux.getAvion()+"\n");
                consola.append("    "+"Tipo:"+aux.getTipo()+"\n");
                consola.append("    "+"Pasajeros:"+"\n");
                consola.append("    "+"Desabordaje:"+aux.getDesabordaje()+"\n");
                consola.append("    "+"Mantenimiento:"+aux.getMantenimiento()+"\n");
                if(aux.getEstado()=="vacio")est=false;
                else est=true;
                
                aux=aux.sig;
            }
           
        }
    
       }
    
    }
