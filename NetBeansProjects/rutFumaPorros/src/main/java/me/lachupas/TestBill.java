/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package me.lachupas;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Scanner;

public class TestBill {

    static Scanner sc = new Scanner(System.in);
    static final int NUMPRODUCTOS = 3;

    public static void main(String[] args) {
        Productos[] productosFactura = preguntarProductos();
        System.out.println(Arrays.toString(productosFactura));

        float[] preciosFactura = preguntarPrecios();
        System.out.println(Arrays.toString(preciosFactura));

        LocalDate fechaFactura = preguntarFecha();
        System.out.println(fechaFactura);

        Bill factura = new Bill(productosFactura, preciosFactura, fechaFactura);
        float subtotal = 0;
        final float IVA = 0.21f;
        float descuentoIVA = 0;
        float precioConIVA = 0;
        System.out.println("Factura del " + fechaFactura);
        System.out.println("-Producto-      -Precio-");
        for (int i = 0; i < NUMPRODUCTOS; i++) {
            System.out.println(productosFactura[i] + "      " + preciosFactura[i]);
            subtotal += preciosFactura[i];
        }
        System.out.println("Subtotal: " + subtotal);
        descuentoIVA = subtotal * IVA;
        precioConIVA = descuentoIVA + subtotal;
        System.out.println("IVA (21%): " + descuentoIVA + "€");
        System.out.println("Total: " + precioConIVA + "€");
        System.out.println("");
        
        float limite = 25.0f;
        System.out.println("Productos con precios mayores a " + limite + "€:");
        for (int i = 0; i < NUMPRODUCTOS; i++) {
            if (preciosFactura[i] > limite) {
                System.out.println(productosFactura[i] + ": " + preciosFactura[i] + "€");
            }
        }

        System.out.println("\nProductos que terminan en 'o':");
        for (int i = 0; i < NUMPRODUCTOS; i++) {
            if (productosFactura[i].toString().toLowerCase().endsWith("o")) {
                System.out.println(productosFactura[i] + ": " + preciosFactura[i] + "€");
            }
        }

        System.out.println("\nProductos que terminan en 'as':");
        for (int i = 0; i < NUMPRODUCTOS; i++) {
            if (productosFactura[i].toString().toLowerCase().endsWith("as")) {
                System.out.println(productosFactura[i] + ": " + preciosFactura[i] + "€");
            }
        }

        System.out.println("\nProductos que empiezan por 'T' y terminan en 'a':");
        for (int i = 0; i < NUMPRODUCTOS; i++) {
            String nombreProducto = productosFactura[i].toString().toLowerCase();
            if (nombreProducto.startsWith("t") && nombreProducto.endsWith("a")) {
                System.out.println(productosFactura[i] + ": " + preciosFactura[i] + "€");
            }
        }

    }

    public static Productos[] preguntarProductos() {
        Productos[] productosArray = new Productos[NUMPRODUCTOS];
        for (int i = 0; i < productosArray.length; i++) {
            try {
                System.out.println("Type a product");
                String pr = sc.next();
                productosArray[i] = Productos.valueOf(pr.toUpperCase());

            } catch (IllegalArgumentException error) {
                System.out.println("The product doesnt exist.");
                i--;
            }
        }

        return productosArray;
    }

    public static float[] preguntarPrecios() {
        float[] preciosArray = new float[NUMPRODUCTOS];
        for (int i = 0; i < preciosArray.length; i++) {
            try {
                System.out.println("Type a price");
                preciosArray[i] = sc.nextFloat();
                if (preciosArray[i] < 0) {
                    preciosArray[i] = 0;
                }
            } catch (IllegalArgumentException error) {
                System.out.println("The price is wrong");
                i--;
            }
        }

        return preciosArray;
    }

    public static LocalDate preguntarFecha() {
        LocalDate fecha = null;
        try {
            System.out.println("Type a date(yyyy-mm-dd)");
            String fe = sc.next();
            fecha = LocalDate.parse(fe);
        } catch (DateTimeParseException error) {
            System.out.println("Wrong date!");
            fecha = null;
        }

        return fecha;
    }
}
