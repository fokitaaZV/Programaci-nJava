/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.entornosentrega5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author javii
 */
public class EntornosEntrega5 {

    public static void main(String[] args) {

    }

    public static void ejercicio41() {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingrese un número: ");
            numero = sc.nextInt();
        } while (numero > 0);

        System.out.println("Programa terminado.");
    }

    public static void ejercicio42() {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int contador = 0;

        do {
            System.out.print("Ingrese un nombre en orden alfabético: ");
            nombre = sc.nextLine();
            contador++;
        } while (nombre.compareTo("LOPEZ") > 0);

        System.out.println("Se han leído " + (contador - 1) + " nombres después de 'LOPEZ'.");
    }

    public static void ejercicio43() {
        Scanner sc = new Scanner(System.in);
        int numero;
        int suma = 0;

        do {
            System.out.print("Ingrese un número entre 0 y 10: ");
            numero = sc.nextInt();
            if (numero >= 0 && numero <= 10) {
                suma += numero;
            }
        } while (numero >= 0 && numero <= 10);

        System.out.println("La suma de los números entre 0 y 10 es: " + suma);
    }

    public static void ejercicio44() {
        Scanner sc = new Scanner(System.in);
        int numero;
        int suma = 0;
        int contador = 0;

        do {
            System.out.print("Ingrese un número entre 0 y 100: ");
            numero = sc.nextInt();
            if (numero >= 0 && numero <= 100) {
                suma += numero;
                contador++;
            }
        } while (numero >= 0 && numero <= 100);

        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("La media de los números entre 0 y 100 es: " + media);
        } else {
            System.out.println("No se ingresaron números válidos.");
        }
    }

    public static void ejercicio45() {
        Scanner sc = new Scanner(System.in);
        int numero;
        int max = Integer.MIN_VALUE;

        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = sc.nextInt();
            if (numero > max) {
                max = numero;
            }
        } while (numero != 0);

        if (max != Integer.MIN_VALUE) {
            System.out.println("El número mayor ingresado fue: " + max);
        } else {
            System.out.println("No se ingresaron números.");
        }
    }

    public static void ejercicio46() {
        Scanner sc = new Scanner(System.in);
        int numero;
        int min = Integer.MAX_VALUE;

        do {
            System.out.print("Ingrese un número (par para terminar): ");
            numero = sc.nextInt();
            if (numero % 2 == 0 && numero < min) {
                min = numero;
            }
        } while (numero % 2 != 0);

        if (min != Integer.MAX_VALUE) {
            System.out.println("El número par más pequeño ingresado fue: " + min);
        } else {
            System.out.println("No se ingresaron números pares.");
        }
    }

    public static void ejercicio47() {
        Scanner sc = new Scanner(System.in);
        String key = "secreto";
        String entrada;

        do {
            System.out.print("Ingrese la clave para continuar: ");
            entrada = sc.nextLine();
        } while (!entrada.equals(key));

        System.out.println("Clave correcta. Puede continuar con el programa.");
    }

    public static void ejercicio48() {
        Scanner sc = new Scanner(System.in);
        int anio;

        System.out.print("Ingrese un año: ");
        anio = sc.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }
    }

    public static void ejercicio49() {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat formatoFecha = new SimpleDateFormat("DD/MM/YYYY");

        System.out.print("Ingrese una fecha (DD/MM/AAAA): ");
        String fechaUser = sc.nextLine();

        try {
            Date fecha = formatoFecha.parse(fechaUser);
            System.out.println("La fecha es válida.");
        } catch (Exception e) {
            System.out.println("La fecha no es válida.");
        }
    }

public static void ejercicio50() {
        Scanner sc = new Scanner(System.in);
        int numero;
        int suma = 0;
        int contador = 0;

        while (contador < 15) {
            System.out.print("Ingrese un número entre 1 y 20: ");
            numero = sc.nextInt();
            if (numero >= 1 && numero <= 20) {
                suma += numero;
                contador++;
            } else {
                System.out.println("Número fuera de rango. Intentelo de nuevo.");
            }
        }

        double media = (double) suma / contador;
        System.out.println("La media de los 15 números es: " + media);
    }

}
