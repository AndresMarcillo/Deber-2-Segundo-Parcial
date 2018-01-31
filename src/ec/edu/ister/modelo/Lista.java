package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class Lista {
    private Nodo Lista;
    
    public Lista() {
        Lista = null;
    }
    
    public boolean ListaVacia(){
        if(Lista==null){
            JOptionPane.showMessageDialog(null,"La lista esta vacia");
        }
        return true;
    }
    
    public Lista crearLista() {
        int x;
        Lista = null;
        do {
            x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato para "
                    + "el nodo"));
            if (x != -1) {
                Lista = new Nodo(x, Lista);
            }
        } while (x != -1);
        return this;
    }
    
    public void imprimir(){
        Nodo n;
        n = Lista;
        String acu="";
        while (n != null){
            acu += n.dato + " ";
            n = n.enlace;  
        }
        JOptionPane.showMessageDialog(null, acu);
    }
    
    public void menu(){
        int opcion=1;
        opcion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion que se desea realizar:"
                + "\n1) Llenar la lista"
                + "\n2) Imprimir la lista"
                + "\n3) Salir"));
        if(opcion!=3){
            switch (opcion){
                case 1:
                    crearLista();
                    break;
                case 2:
                    if(ListaVacia()==true){
                        imprimir();
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opcion incorrecta!!");
            }
            menu();             
        }
        else
            JOptionPane.showMessageDialog(null,"Adios!!");
    }
}
