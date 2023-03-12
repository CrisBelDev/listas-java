/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaSimpleCircular;

/**
 *
 * @author CHICHO
 */
public class Principal {
    public static void main(String[] args) {
        ListaSC lsc = new ListaSC();
        /*
        lsc.adiPrimero("d1");
        lsc.adiPrimero("d2");
        lsc.adiPrimero("d3");
        lsc.adiPrimero("d4");
        lsc.mostrar();
        */
        
        lsc.adiFinal("f1");
        lsc.adiFinal("f2");
        lsc.mostrar2();
        Nodo el = lsc.eliFinal();
        System.out.println("eliminado: "+ el.getDato());
      
        el = lsc.eliFinal();
        
        System.out.println("eliminado: "+ el.getDato());
        lsc.mostrar();
        
        
    
    
    
    
    
    }
}
