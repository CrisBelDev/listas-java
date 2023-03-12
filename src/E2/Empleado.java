/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E2;

/**
 *
 * @author CHICHO
 */
class Empleado {
    private String nombreEmp;
    private int edad;
    private LCVentas lc;

    public Empleado() {
    }

    public Empleado(String nombreEmp, int edad, LCVentas lc) {
        this.nombreEmp = nombreEmp;
        this.edad = edad;
        this.lc = lc;
    }
    public void mostrar(){
        System.out.println("nombre: "+nombreEmp +" - "+edad);
        System.out.println("-------LISTA CIRCULAR VENTAS");
        lc.mostrar();
    }

    public String getNombreEmp() {
        return nombreEmp;
    }

    public void setNombreEmp(String nombreEmp) {
        this.nombreEmp = nombreEmp;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LCVentas getLc() {
        return lc;
    }

    public void setLc(LCVentas lc) {
        this.lc = lc;
    }
    
}
