/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUIZPAULA;

/**
 *
 * @author jeisson
 */
public class Venta {

    private Producto[] producto;
    private String fecha;
    private int [] cantidad;

    public Venta(Producto[] producto, String fecha, int [] cantidad) {
        this.producto = producto;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }

    public double TotalVenta() {
        double TotalVenta = 0;
        for (int i = 0; i < 5; i++) {
            if(producto[i]!=null){
            TotalVenta += (this.producto[i].getPrecio()) * this.cantidad[i];
        
            }
        }    
        return TotalVenta;
    }

    public void ImpFactura() {
        System.out.println("Fecha: " + this.getFecha());
        System.out.println("Cantidad = " + this.getCantidad());
        System.out.println("El total de la venta es = " + this.TotalVenta());
        for (int i = 0; i < producto.length; i++) {
            if(producto[i]!=null){
            System.out.println("El producto vendido es " + this.producto[i].getNombre());
        }}
        
    }

    public Producto[] getProducto() {
        return producto;
    }

    public void setProducto(Producto[] producto) {
        this.producto = producto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int[] getCantidad() {
        return cantidad;
    }

    public void setCantidad(int [] cantidad) {
        this.cantidad = cantidad;
    }

}
