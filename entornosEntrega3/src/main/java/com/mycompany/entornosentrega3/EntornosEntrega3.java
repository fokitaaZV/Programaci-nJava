/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.entornosentrega3;

import java.util.Scanner;

/**
 *
 * @author javii
 */
public class EntornosEntrega3 {

    public static void main(String[] args) {

    }

    public static void sumaMultiplos201() {
        int suma = 0;
        for (int i = 4; i < 201; i += 4) {
            suma += i;
        }
        System.out.println(suma);
    }

    public static void sumaMultiplos7() {
        int suma = 0;
        for (int i = 14; i <= 77; i++) {
            if (i % 7 == 0) {
                suma += i;
            }
        }
        System.out.println(suma);
    }

    public static void producto20() {
        int producto = 1;
        for (int i = 1; i <= 20; i++) {
            producto *= i;
        }
        System.out.println(producto);
    }

    public static void menores30() {
        int producto = 1;
        for (int i = 1; i < 30; i++) {
            producto *= i;
        }
        System.out.println(producto);
    }

    public static void entre15y24() {
        int producto = 1;
        for (int i = 15; i <= 24; i++) {
            producto *= i;
        }
        System.out.println(producto);
    }

    public static void leer20num() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[20];
        for (int i = 0; i < 20; i++) {
            numeros[i] = sc.nextInt();
        }
    }

    public static void leer15numysuma() {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        for (int i = 0; i < 15; i++) {
            suma += sc.nextInt();
        }
        System.out.println(suma);
    }

    public static void leer10ymayor() {
        Scanner sc = new Scanner(System.in);
        int mayor = 0;
        for (int i = 0; i < 10; i++) {
            int numero = sc.nextInt();
            if (i == 0) {
                mayor = numero;
            }
            if (numero > mayor) {
                mayor = numero;
            }
        }
        System.out.println("El número mayor es: " + mayor);
    }

    public static void leer40ymayorque0() {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        for (int i = 0; i < 40; i++) {
            int numero = scanner.nextInt();
            if (numero > 0) {
                contador++;
            }
        }
        System.out.println("Hay " + contador + " números mayores que cero.");
    }

    public static void leer30ypares() {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        for (int i = 0; i < 30; i++) {
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                contador++;
            }
        }
        System.out.println("Hay " + contador + " números pares.");
    }
}
