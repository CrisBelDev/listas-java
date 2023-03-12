/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E1;

/**
 *
 * @author CHICHO
 */
public class Materias {
    private Materia ma;
    //notas
    private int n1,n2,nfin,naux;

    public Materias() {
    }

    public Materias(Materia ma, int n1, int n2, int nfin, int naux) {
        this.ma = ma;
        this.n1 = n1;
        this.n2 = n2;
        this.nfin = nfin;
        this.naux = naux;
    }
    public void mostrar(){
        ma.mostrar();
        System.out.println("_  n1: "+n1+" n2: "+n2+" naux: "+naux+" nf: "+nfin);
    }

    public Materia getMa() {
        return ma;
    }

    public void setMa(Materia ma) {
        this.ma = ma;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getNfin() {
        return nfin;
    }

    public void setNfin(int nfin) {
        this.nfin = nfin;
    }

    public int getNaux() {
        return naux;
    }

    public void setNaux(int naux) {
        this.naux = naux;
    }
    
}
