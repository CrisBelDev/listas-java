/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E2;

/**
 *
 * @author CHICHO
 */
public class Supermercado {
    private String direccion;
    private int telefono;
    private LDCEmpleados ldc;

    public Supermercado() {
    }

    public Supermercado(String direccion, int telefono, LDCEmpleados ldc) {
        this.direccion = direccion;
        this.telefono = telefono;
        this.ldc = ldc;
    }
    public void mostrar(){
        System.out.println("dir: "+direccion+" tel:"+telefono);
        System.out.println("====LISTA DOBLE CIRCULAR");
        ldc.mostrar();
    }
    
    
}
