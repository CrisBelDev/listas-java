/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaSimpleCircular;

/**
 *
 * @author CHICHO
 */
public class Nodo {
    private String dato;
    private Nodo sig;

    public Nodo() {
        sig = null;
    }
    public String getDato() {
        return dato;
    }
    public void setDato(String dato) {
        this.dato = dato;
    }
    public Nodo getSig() {
        return sig;
    }
    public void setSig(Nodo sig) {
        this.sig = sig;
    }
}
