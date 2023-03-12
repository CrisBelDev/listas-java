/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaSimpleEstudiante;

/**
 *
 * @author CHICHO
 */
public class Estudiante {
    private int carnet;
    private String nombre;
    private int notaparcial;
    private int notafinal;

    public Estudiante() {
    }

    public Estudiante(int carnet, String nombre, int notaparcial, int notafinal) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.notaparcial = notaparcial;
        this.notafinal = notafinal;
    }
    public void mostrar(){
        System.out.println("Ci: "+carnet + " nom:"+nombre+" parcial:"+notaparcial+" final:"+notafinal);
    }
    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNotaparcial() {
        return notaparcial;
    }

    public void setNotaparcial(int notaparcial) {
        this.notaparcial = notaparcial;
    }

    public int getNotafinal() {
        return notafinal;
    }

    public void setNotafinal(int notafinal) {
        this.notafinal = notafinal;
    }
    
    
}
