/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author mecha
 */
public class Producto {
    private static int idProductoCounter = 1;
    private int idProducto;
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.idProducto = idProductoCounter++;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return "ID: " + idProducto + ", Nombre: " + nombre + ", Precio: $" + precio;
    }
}
