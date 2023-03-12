/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E1;

/**
 *
 * @author CHICHO
 */
public class Estudiante {
    private String nombreEst;
    private LDobleMaterias ld;
    private int semetre;
    private int gestion;

    public Estudiante() {
        ld = null;
    }

    public Estudiante(String nombreEst, LDobleMaterias ld, int semetre, int gestion) {
        this.nombreEst = nombreEst;
        this.ld = ld;
        this.semetre = semetre;
        this.gestion = gestion;
    }
    public void mostrar(){
        System.out.println("[ "+nombreEst+ " semestre: "+semetre+" "+gestion+" ]");
        System.out.println("------LISTA DE MATERIAS-----------");
        ld.mostrarLD();
    }

    public String getNombreEst() {
        return nombreEst;
    }

    public void setNombreEst(String nombreEst) {
        this.nombreEst = nombreEst;
    }

    public LDobleMaterias getLd() {
        return ld;
    }

    public void setLd(LDobleMaterias ld) {
        this.ld = ld;
    }

    public int getSemetre() {
        return semetre;
    }

    public void setSemetre(int semetre) {
        this.semetre = semetre;
    }

    public int getGestion() {
        return gestion;
    }

    public void setGestion(int gestion) {
        this.gestion = gestion;
    }
    
    
}
