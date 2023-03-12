/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E1;

/**
 *
 * @author CHICHO
 */
class Materia {
    private String sigla;
    private String nombreMat;

    public Materia() {
    }

    public Materia(String sigla, String nombreMat) {
        this.sigla = sigla;
        this.nombreMat = nombreMat;
    }
    public void mostrar(){
        System.out.println("-  sigla: "+sigla+ " "+nombreMat);
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNombreMat() {
        return nombreMat;
    }

    public void setNombreMat(String nombreMat) {
        this.nombreMat = nombreMat;
    }
    
}
