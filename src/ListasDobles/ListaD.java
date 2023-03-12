/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListasDobles;

/**
 *
 * @author CHICHO
 */
public class ListaD {

    private NodoD p;

    public ListaD() {
        p = null;
    }

    public NodoD getP() {
        return p;
    }

    public void setP(NodoD p) {
        this.p = p;
    }

    public boolean esvacia() {
        if (getP() == null) {
            return true;
        } else {
            return false;
        }
    }

    public void adiPrimero(String dato) {
        NodoD nuevo = new NodoD();
        nuevo.setDato(dato);
        if (esvacia()) {
            setP(nuevo);
        } else {
            nuevo.setSig(getP());
            p.setAnt(nuevo);
            setP(nuevo);
        }
    }

    public void adiFinal(String dato) {
        NodoD nuevo = new NodoD();
        nuevo.setDato(dato);
        if (esvacia()) {
            setP(nuevo);
        }
        NodoD q = getP();
        while (q.getSig() != null) {
            q = q.getSig();
        }
        q.setSig(nuevo);
        nuevo.setAnt(q);

    }

    public NodoD eliPrimero() {
        NodoD q = getP();
        if (p.getSig() == null) {
            setP(null);
        } else {
            p = p.getSig();
            q.setSig(null);
            p.setAnt(null);
        }
        return q;
    }
    public NodoD eliFinal(){
        NodoD q = getP();
        if(p.getSig() == null){
            setP(null);
        }else{
            while(q.getSig() != null){
                q = q.getSig();
            }
            NodoD r  = q.getAnt();
            r.setSig(null);
            q.setAnt(null);
        }
        return q;
    }
    public void mostrarLD() {
        NodoD q = getP();
        while (q != null) {
            System.out.print(" " + q.getDato());
            q = q.getSig();
        }
        System.out.println("");
    }

}
