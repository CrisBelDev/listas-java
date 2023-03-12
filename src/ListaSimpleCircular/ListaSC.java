/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaSimpleCircular;

/**
 *
 * @author CHICHO
 */
public class ListaSC {

    private Nodo p;

    public ListaSC() {
        p = null;
    }

    public Nodo getP() {
        return p;
    }

    public void setP(Nodo p) {
        this.p = p;
    }

    public boolean esvacia() {
        if (getP() == null) {
            return true;
        } else {
            return false;
        }
    }

    public void adiPrimero(String x) {
        Nodo nuevo = new Nodo();
        nuevo.setDato(x);
        if (esvacia()) {
            setP(nuevo);
            nuevo.setSig(nuevo);
        } else {
            Nodo q = getP();
            while (q.getSig() != getP()) {
                q = q.getSig();
            }
            nuevo.setSig(getP());
            q.setSig(nuevo);
            setP(nuevo);
        }
    }

    public void mostrar() {
        Nodo q = getP();
        if(esvacia()){
            System.out.println("lista vacia");
        }else{
            while (q.getSig() != getP()) {
                System.out.println(" " + q.getDato());
                q = q.getSig();
            }
            System.out.println(" " + q.getDato());
        }
            
    }

    public int nroNodos() {
        Nodo q = getP();
        int c = 0;
        if(!esvacia()){
            while (q.getSig() != getP()) {
                c++;
                q = q.getSig();
            }
            c++;
        }
            
        return c;
    }

    public void mostrar2() {
        Nodo q = getP();
        if(esvacia()){
            System.out.println("lista vacia");
        }else{
            for (int i = 0; i < nroNodos(); i++) {
                System.out.println(" " + q.getDato());
                q = q.getSig();
            }
        }
            
    }

    public void adiFinal(String dato) {
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);
        if (esvacia()) {
            setP(nuevo);
            nuevo.setSig(nuevo);
        } else {
            Nodo q = getP();
            while (q.getSig() != getP()) {
                q = q.getSig();
            }
            q.setSig(nuevo);
            nuevo.setSig(getP());
        }
    }

    public Nodo eliPrimero() {
        Nodo aux = getP();
        Nodo q = getP();
        if (q.getSig() == getP()) {
            setP(null);
        } else {
            while (q.getSig() != getP()) {
                q = q.getSig();
            }
            setP(aux.getSig());
            q.setSig(getP());
            aux.setSig(null);
        }

        return aux;
    }
    public Nodo eliFinal(){
        Nodo aux = getP();
        Nodo q = getP();
        if(q.getSig() == getP()){
            setP(null);
        }else{
            while(aux.getSig() != getP()){
                q = aux;
                aux = aux.getSig();
            }
            q.setSig(p);
            aux.setSig(null);
            
        }
        return aux;
    }

}
