/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E2;

/**
 *
 * @author CHICHO
 */
class NodoVentas {
    private Ventas dato;
    private NodoVentas sig;

    public NodoVentas() {
        sig = null;
    }

    public Ventas getDato() {
        return dato;
    }

    public void setDato(Ventas dato) {
        this.dato = dato;
    }

    public NodoVentas getSig() {
        return sig;
    }

    public void setSig(NodoVentas sig) {
        this.sig = sig;
    }
    
    
}
