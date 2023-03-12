/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E2;

/**
 *
 * @author CHICHO
 */
class NodoEmpleado {
    //nodo doble
    private Empleado dato;
    private NodoEmpleado ant,sig;

    public NodoEmpleado() {
        ant = sig = null;
    }

    public Empleado getDato() {
        return dato;
    }

    public void setDato(Empleado dato) {
        this.dato = dato;
    }

    public NodoEmpleado getAnt() {
        return ant;
    }

    public void setAnt(NodoEmpleado ant) {
        this.ant = ant;
    }

    public NodoEmpleado getSig() {
        return sig;
    }

    public void setSig(NodoEmpleado sig) {
        this.sig = sig;
    }
    
    
}
