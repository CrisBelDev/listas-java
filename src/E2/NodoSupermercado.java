/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E2;

/**
 *
 * @author CHICHO
 */
public class NodoSupermercado {
    private Supermercado dato;
    private NodoSupermercado sig;

    public NodoSupermercado() {
        sig = null;
    }

    public Supermercado getDato() {
        return dato;
    }

    public void setDato(Supermercado dato) {
        this.dato = dato;
    }

    public NodoSupermercado getSig() {
        return sig;
    }

    public void setSig(NodoSupermercado sig) {
        this.sig = sig;
    }
    
    
}
