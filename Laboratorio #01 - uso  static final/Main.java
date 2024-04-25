/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author mecha
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Producto producto1 = new Producto("Camisa", 500);
        Producto producto2 = new Producto("Pantalon", 800);

        Orden orden = new Orden();
        orden.agregarProducto(producto1);
        orden.agregarProducto(producto2);

        orden.mostrarOrden();
    }
    
}
