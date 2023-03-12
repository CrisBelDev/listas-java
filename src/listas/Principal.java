/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listas;

/**
 *
 * @author CHICHO
 */
public class Principal {

    public static void main(String[] args) {
        ListaSimple ls = new ListaSimple();
        ls.adiFinal(10);
        ls.adiFinal(25);
        ls.adiFinal(18);
        ls.adiFinal(15);
        ls.mostrar();
        ls.adiPrincipio(4);
        ls.adiPrincipio(7);
        ls.mostrar();
        System.out.println(".................");
        Nodo eli = ls.elimInicio();
        System.out.println("eliminado: "+eli.getDato());
        eli = ls.elimInicio();
        System.out.println("eliminado: "+eli.getDato());
        eli = ls.elimInicio();
        System.out.println("eliminado: "+eli.getDato());
        ls.mostrar();
        
        eli = ls.elimFinal();
        System.out.println("eliminado: "+eli.getDato());
        eli = ls.elimFinal();
        System.out.println("eliminado: "+eli.getDato());  
        ls.mostrar();
    }
    
}
