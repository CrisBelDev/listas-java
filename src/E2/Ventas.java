/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E2;

/**
 *
 * @author CHICHO
 */
class Ventas {
    private String nombreProd;
    private int precio, cantidad;

    public Ventas() {
    }

    public Ventas(String nombreProd, int precio, int cantidad) {
        this.nombreProd = nombreProd;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public void mostrar(){
        System.out.println(nombreProd + " - "+precio+ " -cant:"+cantidad);
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
