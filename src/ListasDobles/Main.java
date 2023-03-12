
package ListasDobles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaD ld = new ListaD();
        ld.adiPrimero("mouse");
        ld.adiFinal("monitor");
        ld.adiFinal("teclado");
        //ld.mostrarLD();
        //System.out.println("----------");
        ld.adiFinal("ana");
        ld.adiFinal("scanner");
        //ld.mostrarLD();
        /*
        System.out.println("-------------");
        NodoD el = ld.eliFinal();
        System.out.println("eliminado: "+el.getDato());
        el = ld.eliFinal();
        System.out.println("eliminado: "+el.getDato());
        el = ld.eliFinal();
        System.out.println("eliminado: "+el.getDato());
        el = ld.eliFinal();
        System.out.println("eliminado: "+el.getDato());
        el = ld.eliFinal();
        System.out.println("eliminado: "+el.getDato());
        */
        //System.out.println("************");
        ld.mostrarLD();
        System.out.println("************");
        //modifica(ld, "ploter");
        //ld.mostrarLD();
        System.out.println("************");
        ordenar(ld);
        ld.mostrarLD();
    }
    //ordenar lista
    public static void ordenar(ListaD ld){
        int cn = cantidadNodos(ld);
        for (int i = 0; i <cn; i++){
            NodoD q = ld.getP();
            NodoD r = ld.getP();
            while(r.getSig() != null){
                q = r.getSig();
                if (r.getDato().compareTo(q.getDato())>0){
                    String aux = q.getDato();
                    q.setDato(r.getDato());
                    r.setDato(aux);
                }
                r = r.getSig();
            }
        }
    }
    public static int cantidadNodos(ListaD ld){
        NodoD q = ld.getP();
        int c = 0;
        while (q != null) {
            c++;
            q = q.getSig();
        }
        return c;
    }
    //modificar cadena de la lista
    public static void modifica(ListaD ld,String x){
        NodoD q = ld.getP();
        Scanner leer = new Scanner(System.in);
        boolean sw = false;
        while (q != null) {
            if(q.getDato().equals(x)){
                System.out.print("ingrese nuevo dato: ");
                q.setDato(leer.next());
                sw = true;
            }
            
            q = q.getSig();
        }
        if(!sw){
            System.out.println("cadena no encontrada");
        }
        System.out.println("");
    }
}
