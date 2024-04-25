/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author mecha
 */
public class Orden {
    private static int idOrdenCounter = 1;
    private static final int maxProductos = 10;
    private int idOrden;
    private Producto[] productos;
    private int cuentaProducto;

    public Orden() {
        this.idOrden = idOrdenCounter++;
        this.productos = new Producto[maxProductos];
        this.cuentaProducto = 0;
    }

    public void agregarProducto(Producto producto) {
        if (cuentaProducto < 10) {
            this.productos[cuentaProducto++] = producto;
        } else {
            System.out.println("No se pueden agregar más productos a esta orden.");
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < cuentaProducto; i++) {
            total += productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("Orden #" + idOrden);
        for (int i = 0; i < cuentaProducto; i++) {
            System.out.println(productos[i]);
        }
        System.out.println("Total: $" + calcularTotal());
    }
}
