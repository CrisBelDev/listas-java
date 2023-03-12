/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E1;

/**
 *
 * @author CHICHO
 */
class LDobleMaterias {
    private NodoMaterias p;

    public LDobleMaterias() {
        p = null;
    }

    public NodoMaterias getP() {
        return p;
    }

    public void setP(NodoMaterias p) {
        this.p = p;
    }

    public boolean esvacia() {
        if (getP() == null) {
            return true;
        } else {
            return false;
        }
    }

    public void adiPrimero(Materias dato) {
        NodoMaterias nuevo = new NodoMaterias();
        nuevo.setDato(dato);
        if (esvacia()) {
            setP(nuevo);
        } else {
            nuevo.setSig(getP());
            p.setAnt(nuevo);
            setP(nuevo);
        }
    }

    
    public void adiFinal(Materias dato){
        NodoMaterias nue=new NodoMaterias();
        nue.setDato(dato);
        
        if(getP()==null)
            setP(nue);
        else{
            NodoMaterias r=getP();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nue);
            nue.setAnt(r);
        }
    }

    public NodoMaterias eliPrimero() {
        NodoMaterias q = getP();
        if (p.getSig() == null) {
            setP(null);
        } else {
            p = p.getSig();
            q.setSig(null);
            p.setAnt(null);
        }
        return q;
    }
    public NodoMaterias eliFinal(){
        NodoMaterias q = getP();
        if(p.getSig() == null){
            setP(null);
        }else{
            while(q.getSig() != null){
                q = q.getSig();
            }
            NodoMaterias r  = q.getAnt();
            r.setSig(null);
            q.setAnt(null);
        }
        return q;
    }
    public void mostrarLD() {
        NodoMaterias q = getP();
        while (q != null) {
            q.getDato().mostrar();
            q = q.getSig();
            System.out.println("---------------");
        }
        System.out.println("");
    }
}
