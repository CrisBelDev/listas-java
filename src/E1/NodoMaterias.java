/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E1;

/**
 *
 * @author CHICHO
 */
public class NodoMaterias {
    private Materias dato;
    private NodoMaterias sig,ant;

    public NodoMaterias() {
        sig = null;
        ant = null;
    }

    public Materias getDato() {
        return dato;
    }

    public void setDato(Materias dato) {
        this.dato = dato;
    }

    public NodoMaterias getSig() {
        return sig;
    }

    public void setSig(NodoMaterias sig) {
        this.sig = sig;
    }

    public NodoMaterias getAnt() {
        return ant;
    }

    public void setAnt(NodoMaterias ant) {
        this.ant = ant;
    }
    
    
}
