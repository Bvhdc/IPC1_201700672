package practica1;
public class NodoMantenimiento {
    public String estado;
    public int avion;
    public String tipo;
    public int pasajeros;
    public int desabordaje;
    public int mantenimiento;
    public int num;
    public NodoMantenimiento sig;
    public NodoMantenimiento ant;

    public NodoMantenimiento() {
        this.avion = 0;
        this.tipo = null;
        this.pasajeros = 0;
        this.desabordaje = 0;
        this.mantenimiento = 0;
        this.estado="vacio";
    }
    public void vaciar(){
    this.avion = 0;
        this.tipo = null;
        this.pasajeros = 0;
        this.desabordaje = 0;
        this.mantenimiento = 0;
        this.estado="vacio";
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getAvion() {
        return avion;
    }

    public void setAvion(int avion) {
        this.avion = avion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getDesabordaje() {
        return desabordaje;
    }

    public void setDesabordaje(int desabordaje) {
        this.desabordaje = desabordaje;
    }

    public int getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(int mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    public String getEstado() {
        return estado;
    }
    public void estado(){
    if(estado=="vacio")estado="lleno";
    if(estado=="lleno")estado="vacio";
    
    
    }    

    public void setEstado(String estado) {
        this.estado = estado;
    }
}