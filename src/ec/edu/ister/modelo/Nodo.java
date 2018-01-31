package ec.edu.ister.modelo;

/**
 *
 * @author Andres
 */
public class Nodo {
    int dato;
    Nodo enlace;

    public Nodo(int a) {
        dato = a;
        enlace = null;
    }

    public Nodo(int a, Nodo x) {
        dato = a;
        enlace = x;
    }
    
    public int getDato() {
        return dato;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
}
