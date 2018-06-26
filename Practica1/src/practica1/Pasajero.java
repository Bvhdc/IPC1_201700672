
package practica1;

import java.util.Random;

public class Pasajero {
   public int maletas;
   public int num;
   public int docs;
   public Pasajero sig;
   public int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public Pasajero() {
        Random random=new Random();
        this.maletas = random.nextInt(4)+1;
      
        this.docs = random.nextInt(10)+1;
    }

    public int getMaletas() {
        return maletas;
    }
    public int getDocs() {
        return docs;
    }
    
    public void generar(int numero){
    this.num=numero;
    }

    public int getNum() {
        return num;
    }
    
}
