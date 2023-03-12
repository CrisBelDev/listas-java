/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E2;

/**
 *
 * @author CHICHO
 */
class LDCEmpleados {
     private NodoEmpleado p;

    public LDCEmpleados() {
        p = null;
    }

    public NodoEmpleado getP() {
        return p;
    }

    public void setP(NodoEmpleado p) {
        this.p = p;
    }
    public boolean esvacia(){
        if(getP() == null){
            return true;
        }else{
            return false;
        }
    }
    public void adiPrimero(Empleado dato){
        NodoEmpleado nuevo = new NodoEmpleado();
        nuevo.setDato(dato);
        if(esvacia()){
            setP(nuevo);
            nuevo.setSig(nuevo);
            nuevo.setAnt(nuevo);
        }else{
            NodoEmpleado q = p.getAnt();
            nuevo.setSig(getP());
            p.setAnt(nuevo);
            q.setSig(nuevo);
            nuevo.setAnt(q);
            setP(nuevo);
        }
    }
    public void adiFinal(Empleado dato){
        NodoEmpleado nuevo = new NodoEmpleado();
        nuevo.setDato(dato);
        if(esvacia()){
            setP(nuevo);
            nuevo.setSig(nuevo);
            nuevo.setAnt(nuevo);
        }else{
            NodoEmpleado q = getP().getAnt();
            q.setSig(nuevo);
            nuevo.setAnt(q);
            nuevo.setSig(getP());
            p.setAnt(nuevo);
        }
    }
    public NodoEmpleado eliFinal(){
        NodoEmpleado aux = getP();
        if(aux.getSig() == getP()){
            setP(null);
        }else{
            aux = p.getAnt();
            NodoEmpleado q = aux.getAnt();
            aux.setSig(null);
            aux.setAnt(null);
            q.setSig(getP());
            p.setAnt(q);
        }
        return aux;
    }
    public NodoEmpleado eliPrimero(){
        NodoEmpleado aux = getP();
        if(aux.getSig() == getP()){
            setP(null);
        }else{
            NodoEmpleado q = p.getAnt();
            setP(aux.getSig());
            aux.setSig(null);
            aux.setAnt(null);
            q.setSig(getP());
            p.setAnt(q);
        }
        return aux;
    }
    
    public int nroNodos(){
        int c=0;
        NodoEmpleado q = getP();
        if(!esvacia()){
            while(q.getSig() != getP()){
                c++;
                q = q.getSig();
            }
            c++;
        }
        return c;
    }
    public void mostrar(){
        NodoEmpleado q = getP();
        if(esvacia()){
            System.out.println("lista vacia");
        }else{
            for(int i=0;i<nroNodos();i++){
                q.getDato().mostrar();
                q = q.getSig();
            }
        }  
    }
    
}
