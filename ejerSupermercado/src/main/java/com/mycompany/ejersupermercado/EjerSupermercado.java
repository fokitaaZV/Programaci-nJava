package com.mycompany.ejersupermercado;

import java.util.Scanner;

public class EjerSupermercado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenidxs a Fokinha SuperMarket");

        System.out.print("Ingrese el número de clientes: ");
        int nClientes = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= nClientes; i++) {
            System.out.println("\nCliente " + i + ":");
            System.out.print("Nombre del cliente: ");
            String nombreCliente = sc.nextLine();

            double iva = 0;
            double precioTotal = 0;

            System.out.println("Artículos en Stock:");
            System.out.println("1. Pan a 1.25€");
            System.out.println("2. Aceite a 8€");
            System.out.println("3. Patatas a 2.30€");
            System.out.println("4. Aceitunas a 3.5€");
            System.out.println("5. Nestea a 1.80€");
            System.out.println("6. Whiskey a 14.90€");
            System.out.println("7. Hielos a 3.50€");

            int numCompras = 0;
            int op;
            boolean terminar = false;

            while (numCompras < 3 || terminar != true) {
                System.out.print("Ingrese numero de articulo. (0 para terminar): ");
                op = sc.nextInt();
                sc.nextLine();

                if (op == 0) {
                    terminar = true;
                } else if (op < 1 || op > 7) {
                    System.out.println("Intentelo de nuevo.");
                } else {
                    double precioArticulo = calcularPrecioArticulo(op);
                    iva += calcularIVA(precioArticulo);
                    precioTotal += precioArticulo;
                    numCompras++;
                }

                sc.close();

            }

            System.out.println("\nCompra de " + nombreCliente + ":");
            System.out.println("Compra realizada: " + numCompras);
            System.out.println("IVA total: " + iva + "€");
            System.out.println("Precio total (con IVA): " + precioTotal + "€");
        }
    }

    public static double calcularPrecioArticulo(int op) {
        double precio;

        precio = switch (op) {
            case 1 -> 1.25;
            case 2 -> 8.0;
            case 3 -> 2.30;
            case 4 -> 3.5;
            case 5 -> 1.80;
            case 6 -> 14.90;
            case 7 -> 3.50;
            default -> 0;
        };

        return precio;
    }

    public static double calcularIVA(double precio) {
        double iva = precio * 0.21;
        return iva;
    }
}
