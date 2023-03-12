/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E1;

/**
 *
 * @author CHICHO
 */
public class LSimpleEstudiante {
     private NodoEstudiante p;

    public LSimpleEstudiante() {
        p = null;
    }

    public NodoEstudiante getP() {
        return p;
    }

    public void setP(NodoEstudiante p) {
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
        NodoEstudiante nuevo = new  NodoEstudiante();
        nuevo.setDato(x);
        if(esvacia()){
            setP(nuevo);
        }else{
            NodoEstudiante q = getP();
            while (q.getSig() != null){
                q = q.getSig();
            }
            q.setSig(nuevo); 
        }
    }
    public void adiPrincipio(Estudiante x){
        NodoEstudiante nuevo = new NodoEstudiante();
        nuevo.setDato(x);
        nuevo.setSig(p);
        setP(nuevo);
    }
    public void mostrar(){
        NodoEstudiante q = getP();
        while(q != null){
            Estudiante x = q.getDato();
            x.mostrar();
            q = q.getSig();
        }
        System.out.print("--null");
        System.out.println("");
    }
    public NodoEstudiante elimInicio(){
        NodoEstudiante q = getP();
        if(getP() == null){
            System.out.println("lista vacia");
        }else{
            
            p = p.getSig();
            q.setSig(null);
        }
        
        return q;
    }
    public NodoEstudiante elimFinal(){
        NodoEstudiante q = getP();
        NodoEstudiante r = getP();
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
