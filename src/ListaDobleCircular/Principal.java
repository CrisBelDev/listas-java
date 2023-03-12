/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaDobleCircular;

/**
 *
 * @author CHICHO
 */
public class Principal {
    public static void main(String[] args) {
        ListaDC lsc = new ListaDC();
        
        lsc.adiPrimero("d1");
        lsc.adiPrimero("d2");
        lsc.adiPrimero("d3");
        lsc.adiPrimero("d4");
        lsc.mostrar();
        
        System.out.println("---------------");
        lsc.adiFinal("f1");
        lsc.adiFinal("f2");
        lsc.mostrar();
        /*
        Nodo el = lsc.eliPrimero();
        System.out.println("eliminado: "+ el.getDato());
      
        el = lsc.eliPrimero();
        
        System.out.println("eliminado: "+ el.getDato());
        lsc.mostrar();
        */
        Nodo ep = eliminarPos(lsc, 1);
        System.out.println("eliminado: "+ ep.getDato());
        lsc.mostrar();

    }
    public static Nodo eliminarPos(ListaDC ld, int pos){
        Nodo aux = ld.getP();
        if(ld.nroNodos() == 1){
            ld.setP(null);
        }
        for(int i = 1;i<= ld.nroNodos();i++){
            if(i == pos){
                if(pos == 1){
                    ld.setP(aux.getSig());
                }
                Nodo q = aux.getSig();
                Nodo r = aux.getAnt();
                aux.setAnt(null);
                aux.setSig(null);
                r.setSig(q);
                q.setAnt(r);
                break;
            }
            aux = aux.getSig();
            
            
        }
        return aux;
    }
}
