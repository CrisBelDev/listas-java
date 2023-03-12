/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E2;

/**
 *
 * @author CHICHO
 */
public class Principal {
    public static void main(String[] args) {
        Ventas venta1 = new Ventas("jamon", 30, 50);
        Ventas venta2 = new Ventas("queso", 10, 80);
        Ventas venta3 = new Ventas("cereal", 30, 50);
        Ventas venta4 = new Ventas("pepsi", 13, 70);
        Ventas venta5 = new Ventas("vino", 23, 89);
        
        
        LCVentas lscventa1 = new LCVentas();
        lscventa1.adiFinal(venta1);
        lscventa1.adiFinal(venta2);
        lscventa1.adiFinal(venta3);
        
        Empleado empleado1 = new Empleado("juan", 22, lscventa1);
        LDCEmpleados emp1 = new LDCEmpleados();
        emp1.adiFinal(empleado1);
        emp1.adiFinal(empleado1);
        
        Supermercado super1 = new Supermercado("obrajes", 224423, emp1);
        Supermercado super2 = new Supermercado("achumani", 224423, emp1);
        Supermercado super3 = new Supermercado("miraflores", 224423, emp1);
        
        LSCSucursales_Mercado lsc = new LSCSucursales_Mercado();
        lsc.adiFinal(super1);
        lsc.adiFinal(super2);
        lsc.adiFinal(super3);
        lsc.mostrar();
    }
}
