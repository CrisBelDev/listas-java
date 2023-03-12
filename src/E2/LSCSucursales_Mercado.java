/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E2;

/**
 *
 * @author CHICHO
 */
public class LSCSucursales_Mercado {
    private NodoSupermercado p;

    public LSCSucursales_Mercado() {
        p = null;
    }

    public NodoSupermercado getP() {
        return p;
    }

    public void setP(NodoSupermercado p) {
        this.p = p;
    }

    public boolean esvacia() {
        if (getP() == null) {
            return true;
        } else {
            return false;
        }
    }

    public void adiPrimero(Supermercado x) {
        NodoSupermercado nuevo = new NodoSupermercado();
        nuevo.setDato(x);
        if (esvacia()) {
            setP(nuevo);
            nuevo.setSig(nuevo);
        } else {
            NodoSupermercado q = getP();
            while (q.getSig() != getP()) {
                q = q.getSig();
            }
            nuevo.setSig(getP());
            q.setSig(nuevo);
            setP(nuevo);
        }
    }

    public void mostrar() {
        
        NodoSupermercado q = getP();
        if(esvacia()){
            System.out.println("lista vacia");
        }else{
            while (q.getSig() != getP()) {
                System.out.println("++++++++++++++++++++++++++++++++++++");
                q.getDato().mostrar();
                q = q.getSig();
            }
            System.out.println("++++++++++++++++++++++++++++++++++++");
            q.getDato().mostrar();
        }
            
    }

    public int nroNodos() {
        NodoSupermercado q = getP();
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
        NodoSupermercado q = getP();
        if(esvacia()){
            System.out.println("lista vacia");
        }else{
            for (int i = 0; i < nroNodos(); i++) {
                q.getDato().mostrar();
                q = q.getSig();
            }
        }
            
    }

    public void adiFinal(Supermercado dato) {
        NodoSupermercado nuevo = new NodoSupermercado();
        nuevo.setDato(dato);
        if (esvacia()) {
            setP(nuevo);
            nuevo.setSig(nuevo);
        } else {
            NodoSupermercado q = getP();
            while (q.getSig() != getP()) {
                q = q.getSig();
            }
            q.setSig(nuevo);
            nuevo.setSig(getP());
        }
    }

    public NodoSupermercado eliPrimero() {
        NodoSupermercado aux = getP();
        NodoSupermercado q = getP();
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
    public NodoSupermercado eliFinal(){
        NodoSupermercado aux = getP();
        NodoSupermercado q = getP();
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
