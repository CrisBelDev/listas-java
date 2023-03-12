/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaSimpleEstudiante;

/**
 *
 * @author CHICHO
 */
public class LSEstudiante {
    private Nodo p;

    public LSEstudiante() {
        p = null;
    }

    public Nodo getP() {
        return p;
    }

    public void setP(Nodo p) {
        this.p = p;
    }
    public boolean esvacia(){
        if(getP() == null){
            return true;
        }else{
            return false;
        }
    }
    public void adiFinal(Estudiante x){
        Nodo nuevo = new  Nodo();
        nuevo.setDato(x);
        if(esvacia()){
            setP(nuevo);
        }else{
            Nodo q = getP();
            while (q.getSig() != null){
                q = q.getSig();
            }
            q.setSig(nuevo); 
        }
    }
    public void adiPrincipio(Estudiante x){
        Nodo nuevo = new Nodo();
        nuevo.setDato(x);
        nuevo.setSig(p);
        setP(nuevo);
    }
    public void mostrar(){
        Nodo q = getP();
        while(q != null){
            Estudiante x = q.getDato();
            x.mostrar();
            q = q.getSig();
        }
        System.out.print("--null");
        System.out.println("");
    }
    public Nodo elimInicio(){
        Nodo q = getP();
        if(getP() == null){
            System.out.println("lista vacia");
        }else{
            
            p = p.getSig();
            q.setSig(null);
        }
        
        return q;
    }
    public Nodo elimFinal(){
        Nodo q = getP();
        Nodo r = getP();
        if(q.getSig() == null){
            setP(null);
        }else{
            while(q.getSig() != null){
                r = q;
                q = q.getSig();
            }
            r.setSig(null);
            
        }
        return q;
    }
}
