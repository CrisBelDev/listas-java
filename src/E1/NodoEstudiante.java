/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E1;

/**
 *
 * @author CHICHO
 */
public class NodoEstudiante {
    private Estudiante dato;
    private NodoEstudiante sig;

    public NodoEstudiante() {
        sig = null;
    }

    public Estudiante getDato() {
        return dato;
    }

    public void setDato(Estudiante dato) {
        this.dato = dato;
    }

    public NodoEstudiante getSig() {
        return sig;
    }

    public void setSig(NodoEstudiante sig) {
        this.sig = sig;
    }
    
    
    
}
