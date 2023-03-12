/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E1;

/**
 *
 * @author CHICHO
 */
public class Principal {

    public static void main(String[] args) {
        //materia
        Materia ma1 = new Materia("INF131", "EDD");
        Materia ma2 = new Materia("LAB131", "LABO");
        Materia ma3 = new Materia("MAT134", "MATE");
        Materia ma4 = new Materia("EST125", "EST");
        
        //cristian
        //lista doble materias;
        LDobleMaterias ld1 = new LDobleMaterias();
        Materias a11 = new Materias(ma1, 10, 20, 20, 8);
        Materias a12 = new Materias(ma2, 10, 10, 10, 8);
        Materias a13 = new Materias(ma3, 10, 25, 20, 8);
        ld1.adiFinal(a11);
        ld1.adiFinal(a12);
        ld1.adiFinal(a13);
        
        //juan
        LDobleMaterias ld2 = new LDobleMaterias();
        Materias a21 = new Materias(ma1, 20, 27, 20, 8);
        Materias a22 = new Materias(ma4, 10, 15, 10, 8);
        ld2.adiFinal(a21);
        ld2.adiFinal(a22);
        
        //hugo
        LDobleMaterias ld3 = new LDobleMaterias();
        Materias a31 = new Materias(ma2, 10, 25, 25, 8);
        Materias a32 = new Materias(ma3, 10, 20, 30, 8);
        
        ld3.adiFinal(a31);
        ld3.adiFinal(a32);
        

        Estudiante e1 = new Estudiante("ana", ld1, 3, 2022);
        Estudiante e2 = new Estudiante("juan", ld2, 4, 2021);
        Estudiante e3 = new Estudiante("pedro", ld3, 4, 2022);

        LSimpleEstudiante ls = new LSimpleEstudiante();
        ls.adiPrincipio(e1);
        ls.adiPrincipio(e2);
        ls.adiPrincipio(e3);
        //ls.mostrar();

        System.out.println("============= 1 ===================");
        Materias_Apro_Repro(ls, "ana");
        System.out.println("============= 2 ===================");
        aprobadosMateria(ls, "INF131");
        System.out.println("============= 3 ===================");
        mejorEstudiante(ls);
        System.out.println("============= 4 ===================");
        mejorEstudianteMateria(ls, "EST125");

    }
    public static void mejorEstudianteMateria(LSimpleEstudiante ls,String mat){
        NodoEstudiante q = ls.getP();
        System.out.println(" "+mat);
        int c = 0;
        String ma="";
        Estudiante y = null;
        int max = Integer.MIN_VALUE;
        while(q != null){
            Estudiante x = q.getDato();
            NodoMaterias aux = x.getLd().getP();
            while(aux!=null){
                if(aux.getDato().getMa().getSigla().equals(mat)){
                    int s = aux.getDato().getN1()+aux.getDato().getN2()+aux.getDato().getNaux()+aux.getDato().getNfin();
                    if(s>max){
                        max = s;
                        y = x;
                        ma = aux.getDato().getMa().getNombreMat();
                    }
                }
                    
                aux = aux.getSig();
            }
            q = q.getSig();
        }
        System.out.print(" "+y.getNombreEst()+" "+y.getGestion());
        System.out.println("  Materia: "+ma+"  Nota: "+max);
        
    } 
    public static void mejorEstudiante(LSimpleEstudiante ls){
        NodoEstudiante q = ls.getP();
        int c = 0;
        String ma="";
        Estudiante y = null;
        int max = Integer.MIN_VALUE;
        while(q != null){
            Estudiante x = q.getDato();
            NodoMaterias aux = x.getLd().getP();
            while(aux!=null){
                int s = aux.getDato().getN1()+aux.getDato().getN2()+aux.getDato().getNaux()+aux.getDato().getNfin();
                if(s>max){
                    max = s;
                    y = x;
                    ma = aux.getDato().getMa().getNombreMat();
                }
                aux = aux.getSig();
            }
            q = q.getSig();
        }
        System.out.print(" "+y.getNombreEst()+" "+y.getGestion());
        System.out.println("  Materia: "+ma+"  Nota: "+max);
        
    } 

    public static void aprobadosMateria(LSimpleEstudiante ls, String mat) {
        NodoEstudiante q = ls.getP();
        System.out.println("----MATERIA : "+mat);
        while (q != null) {
            Estudiante x = q.getDato();
            NodoMaterias aux = x.getLd().getP();
            
            while (aux != null) {
                if(aux.getDato().getMa().getSigla().equals(mat)){
                    
                    int nota = aux.getDato().getN1()+aux.getDato().getN2()+aux.getDato().getNaux()+aux.getDato().getNfin();
                    if (nota >=51){
                        System.out.print("estudiante: "+x.getNombreEst()+" _aprobo "+ nota);
                        System.out.println("");
                    }
                    
                }
                aux = aux.getSig();
                
            }
            

            q = q.getSig();
        }
        System.out.println("");
    }

    public static void Materias_Apro_Repro(LSimpleEstudiante ls, String nom) {
        NodoEstudiante q = ls.getP();
        while (q != null) {
            Estudiante x = q.getDato();
            String nombrex = x.getNombreEst();

            if (nombrex.equals(nom)) {
                System.out.println("Estudiante : " + x.getNombreEst() + " ");
                Materias_Aprobadas(x.getLd());
            }
            q = q.getSig();
        }
        //System.out.println("");
    }

    public static void Materias_Aprobadas(LDobleMaterias ld) {
        NodoMaterias q = ld.getP();
        int nota = 0;
        int materiasAprobas = 0, materiasReprobadas = 0;
        String aprobadas = "", reprobadas = "";
        while (q != null) {
            nota = q.getDato().getN1() + q.getDato().getN2() + q.getDato().getNaux() + q.getDato().getNfin();

            if (nota >= 51) {
                aprobadas = aprobadas + q.getDato().getMa().getNombreMat() + " | Nota: " + nota + " APROBO \n";
                materiasAprobas++;
            } else {
                reprobadas = reprobadas + q.getDato().getMa().getNombreMat() + " | Nota: " + nota + " REPROBO \n";
                materiasReprobadas++;
            }

            q = q.getSig();
            //System.out.println("---------------");
        }
        System.out.println("materias aprobadas : " + materiasAprobas);
        System.out.println(aprobadas);
        System.out.println("materias reprobadas : " + materiasReprobadas);
        System.out.println(reprobadas);
        
    }

}
