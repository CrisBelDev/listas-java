/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E2;

/**
 *
 * @author CHICHO
 */
class LCVentas {
    private NodoVentas p;

    public LCVentas() {
        p = null;
    }

    public NodoVentas getP() {
        return p;
    }

    public void setP(NodoVentas p) {
        this.p = p;
    }

    public boolean esvacia() {
        if (getP() == null) {
            return true;
        } else {
            return false;
        }
    }

    public void adiPrimero(Ventas x) {
        NodoVentas nuevo = new NodoVentas();
        nuevo.setDato(x);
        if (esvacia()) {
            setP(nuevo);
            nuevo.setSig(nuevo);
        } else {
            NodoVentas q = getP();
            while (q.getSig() != getP()) {
                q = q.getSig();
            }
            nuevo.setSig(getP());
            q.setSig(nuevo);
            setP(nuevo);
        }
    }

    public void mostrar() {
        NodoVentas q = getP();
        if(esvacia()){
            System.out.println("lista vacia");
        }else{
            while (q.getSig() != getP()) {
                q.getDato().mostrar();
                q = q.getSig();
            }
            q.getDato().mostrar();
        }
            
    }

    public int nroNodos() {
        NodoVentas q = getP();
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
        NodoVentas q = getP();
        if(esvacia()){
            System.out.println("lista vacia");
        }else{
            for (int i = 0; i < nroNodos(); i++) {
                q.getDato().mostrar();
                q = q.getSig();
            }
        }
            
    }

    public void adiFinal(Ventas dato) {
        NodoVentas nuevo = new NodoVentas();
        nuevo.setDato(dato);
        if (esvacia()) {
            setP(nuevo);
            nuevo.setSig(nuevo);
        } else {
            NodoVentas q = getP();
            while (q.getSig() != getP()) {
                q = q.getSig();
            }
            q.setSig(nuevo);
            nuevo.setSig(getP());
        }
    }

    public NodoVentas eliPrimero() {
        NodoVentas aux = getP();
        NodoVentas q = getP();
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
    public NodoVentas eliFinal(){
        NodoVentas aux = getP();
        NodoVentas q = getP();
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
