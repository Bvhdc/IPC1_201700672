
package practica1;

import javax.swing.JTextArea;


public class Aereopuerto {
    public NodoAvion primero;
    public int num;
    int na=1;
    public void Aviones(int num){
        this.num=num;
    
    }

    public int getNum() {
        return num;
    }
    
    public void insertarInicio(ListaPasajero lista){
    num--;
    if(num<0){return;}
    NodoAvion nuevo=new NodoAvion();
    for(int i=1;i<(nuevo.getPasajeros()+1);i++){
    lista.insertar();
    }
    
    
    if(primero==null){
    nuevo.setNavion(na);
    primero=nuevo;
    na=na+1;
    }else{
    nuevo.sig=primero;
    primero.ant=nuevo;
    nuevo.setNavion(na);
    primero=nuevo;
    na=na+1;
    }
    }
    public void remover(ListaEspera es){
    //ListaEspera le=new ListaEspera();
    if(primero!=null){
            NodoAvion aux=primero;
            NodoAvion auxant=null;
            //lo recorremos hasta el último
            while(aux.sig!=null){
                if(aux.desabordaje==0){
                    if(auxant==null){
                        //primero
                        es.insertar(primero);
                        primero=primero.sig;
                        aux.sig=null;
                        aux=primero;
                        return;
                    }else{
                        auxant.sig=aux.sig;
                        aux.sig=null;
                        es.insertar(aux);
                        aux=auxant.sig;
                        aux.ant=auxant;
                        return;
                    }
                }else{
                    auxant=aux;
                    
                    aux=aux.sig;
                }
            }
            //eliminamos el último quitando la referencia del anterior
            if(aux.desabordaje==0){
                auxant.sig=null;
                es.insertar(aux);
                primero=null;
            }
            
        }
    else primero=null;
    }
    public void imprimir(JTextArea consola,int turno){
       consola.append("****************Turno"+turno+"******************\n");
       if(primero==null){
            consola.append("LISTA VACIA"+"\n");
        }else{
            NodoAvion aux=primero;
            while (aux!=null){
                consola.append("Avion"+aux.getNavion()+"***********\n");
                consola.append("tipo:"+aux.getTipo()+"\n");
                consola.append("Pasajeros:"+aux.getPasajeros()+"\n");
                consola.append("Desabordaje:"+aux.getDesabordaje()+"\n");
                consola.append("Mantenimiento:"+aux.getMantenimiento()+"\n");
                aux.restarturno();
                aux=aux.sig;
            }
        } 
        
    }
}
