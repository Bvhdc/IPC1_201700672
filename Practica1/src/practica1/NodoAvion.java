/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Random;

/**
 *
 * @author Bryan
 */
public class NodoAvion {
    String tipo;
    public NodoAvion sig;
    public NodoAvion ant;
    int desabordaje;
    int mantenimiento;
    int navion;
    int pasajeros;
    public NodoAvion(){
    Pasajero pasajero=new Pasajero();
    this.sig=null;
    this.ant=null;
    Random random=new Random();
    /*1=pq
    2=med
    3=gran
    */
    int i=random.nextInt(3)+1;
    if(i==1)
        tipo="pequeno";
    if(i==2)
        tipo="mediano";
    if(i==3)
        tipo="grande";
    
    if(tipo=="pequeno"){
    pasajero.generar(random.nextInt(10 - 5 + 1) + 5);
    pasajeros=pasajero.getNum();
    desabordaje=1;
    mantenimiento=random.nextInt(3) + 1;
    }
    if(tipo=="mediano"){
    pasajero.generar(random.nextInt(25 - 15 + 1) + 15);
    pasajeros=pasajero.getNum();
    desabordaje=2;
    mantenimiento=random.nextInt(4 - 2 + 1) + 2;
    }
    if(tipo=="grande"){
    pasajero.generar(random.nextInt(25 - 15 + 1) + 15);
    pasajeros=pasajero.getNum();
    desabordaje=2;
    mantenimiento=random.nextInt(4 - 2 + 1) + 2;
    }
    }

    public String getTipo() {
        return tipo;
    }

    public int getDesabordaje() {
        return desabordaje;
    }

    public int getMantenimiento() {
        return mantenimiento;
    }
    public void restarturno(){
    desabordaje=desabordaje-1;
    }

    public void setNavion(int navion) {
        this.navion = navion;
    }
    public int getNavion(){
    return navion;
    }

    public int getPasajeros() {
        return pasajeros;
    }
    
}
