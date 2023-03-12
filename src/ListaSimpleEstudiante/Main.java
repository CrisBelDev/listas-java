/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaSimpleEstudiante;

/**
 *
 * @author CHICHO
 */
public class Main {

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante(11, "juan", 25, 30);
        Estudiante e2 = new Estudiante(22, "ana", 30, 30);
        Estudiante e3 = new Estudiante(33, "pedro", 20, 20);
        LSEstudiante ls = new LSEstudiante();
        ls.adiFinal(e1);
        ls.adiFinal(e2);
        ls.adiFinal(e3);
        ls.mostrar();
        System.out.println("-------------------------------");
        Estudiante e4 = new Estudiante(44, "maria", 25, 30);
        ls.adiPrincipio(e4);
        ls.mostrar();
        System.out.println("---------------- A ---------------");
        buscarEstCarnet(ls, 33);
        System.out.println("---------------- B ---------------");
        mostrarEstAprobados(ls);
        System.out.println("---------------- C ---------------");
        Nodo e = eliminarEst(ls, 33);
        System.out.println("eliminado: ");
        e.getDato().mostrar();
        System.out.println("");
        ls.mostrar();
        System.out.println("---------------- D ---------------");
        Estudiante e5 = new Estudiante(55, "mirka", 35, 20);
        agregarEst(ls,2,e5);
        ls.mostrar();
    }
    //d)----agregar en cualquier posicion de la lista
    public static void agregarEst(LSEstudiante ls , int pos , Estudiante dato){
        Nodo q = ls.getP();
        Nodo r = q.getSig();
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);
        int c = 1;
        boolean sw = false;
        while(r != null){
            if(pos == 1){
                ls.adiPrincipio(dato);
                sw = true;
                break;
            }
            if(c == (pos-1)){
                q.setSig(nuevo);
                nuevo.setSig(r);
                sw = true;
                break;
            }
            q = q.getSig();
            r = q.getSig();
            c++;
        }
        if(!sw){
            ls.adiFinal(dato);
        }
        
    }
    //c)----
    public static Nodo eliminarEst(LSEstudiante ls, int ci) {
        Nodo q = ls.getP();
        Nodo r = ls.getP();
        Nodo s = ls.getP();
        while (s != null) {
            Estudiante x = s.getDato();
            if (x.getCarnet() == ci) {
                if (s == ls.getP()) {
                    s = ls.elimInicio();
                    return s;
                }
                q.setSig(r);
                s.setSig(null);
                return s;
            }
            q = s;
            s = s.getSig();
            r = s.getSig();
        }
        return s;

    }

    //b)----
    public static void mostrarEstAprobados(LSEstudiante ls) {
        Nodo q = ls.getP();
        while (q != null) {
            Estudiante x = q.getDato();
            int s = x.getNotaparcial() + x.getNotafinal();
            if (s >= 51) {
                x.mostrar();
                System.out.println(" aprobado y su nota: " + s);
            }
            q = q.getSig();
        }
        System.out.print("--null");
        System.out.println("");
    }

    //a)----
    public static void buscarEstCarnet(LSEstudiante ls, int ci) {
        Nodo q = ls.getP();
        boolean sw = false;
        while (q != null) {
            Estudiante x = q.getDato();
            if (x.getCarnet() == ci) {
                x.mostrar();
                int s = x.getNotafinal() + x.getNotaparcial();
                if (s >= 51) {
                    System.out.println("aprobado y su nota es: " + s);
                } else {
                    System.out.println("repobado y su nota es: " + s);
                }
                sw = true;
            }
            q = q.getSig();
        }
        if (!sw) {
            System.out.println("no existe estudiante");
        }
        System.out.println("");
    }
}
