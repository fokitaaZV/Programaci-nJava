package com.mycompany.entregaentornos4;

import java.util.Scanner;

public class EntregaEntornos4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ejercicio31();

        int sumaPositivos = ejercicio32(sc);
        System.out.println("La suma de los números positivos es: " + sumaPositivos);

        int sumaDivisores = ejercicio33(sc);
        System.out.println("La suma de los divisores de 300 es: " + sumaDivisores);

        double media3Numeros = ejercicio34(sc);
        System.out.println("La media de los 3 números es: " + media3Numeros);

        double media400Numeros = ejercicio35(sc);
        System.out.println("La media de los 400 números es: " + media400Numeros);

        int menorNumero48 = ejercicio36(sc);
        System.out.println("El número menor de los 48 números es: " + menorNumero48);

        String ultimoNombre = ejercicio37(sc);
        System.out.println("El último nombre en orden alfabético es: " + ultimoNombre);

        String primerNombre = ejercicio38(sc);
        System.out.println("El primer nombre en orden alfabético es: " + primerNombre);

        String nombreMayor = ejercicio39(sc);
        System.out.println("El nombre del mayor es: " + nombreMayor);

        String paisMenorArea = ejercicio40(sc);
        System.out.println("El país con la menor área es: " + paisMenorArea);
    }

    public static void ejercicio31() {
        int contador = 0;
        for (int i = 1; i <= 81; i++) {
            if (i % 3 == 0) {
                contador++;
            }
        }
        System.out.println("Hay " + contador + " números múltiplos de 3 entre 1 y 81.");
    }

    public static int ejercicio32(Scanner sc) {
        int suma = 0;
        for (int i = 0; i < 24; i++) {
            System.out.print("Ingrese un número: ");
            int numero = sc.nextInt();
            if (numero > 0) {
                suma += numero;
            }
        }
        return suma;
    }

    public static int ejercicio33(Scanner sc) {
        int suma = 0;
        for (int i = 0; i < 35; i++) {
            System.out.print("Ingrese un número: ");
            int numero = sc.nextInt();
            if (300 % numero == 0) {
                suma += numero;
            }
        }
        return suma;
    }

    public static double ejercicio34(Scanner sc) {
        double suma = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese un número: ");
            suma += sc.nextDouble();
        }
        return suma / 3;
    }

    public static double ejercicio35(Scanner sc) {
        double suma = 0;
        for (int i = 0; i < 400; i++) {
            System.out.print("Ingrese un número: ");
            suma += sc.nextDouble();
        }
        return suma / 400;
    }

    public static int ejercicio36(Scanner sc) {
        int menor = 0;
        for (int i = 0; i < 48; i++) {
            System.out.print("Ingrese un número: ");
            int numero = sc.nextInt();
            if (i == 0) {
                menor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        return menor;
    }

    public static String ejercicio37(Scanner sc) {
        String[] nombres = new String[7];
        for (int i = 0; i < 7; i++) {
            System.out.print("Ingrese un nombre: ");
            nombres[i] = sc.next();
        }
        String ultimoNombre = nombres[0];
        for (int i = 1; i < 7; i++) {
            if (nombres[i].compareTo(ultimoNombre) > 0) {
                ultimoNombre = nombres[i];
            }
        }
        return ultimoNombre;
    }

    public static String ejercicio38(Scanner sc) {
        String[] nombres = new String[200];
        for (int i = 0; i < 200; i++) {
            System.out.print("Ingrese un nombre: ");
            nombres[i] = sc.next();
        }
        String primerNombre = nombres[0];
        for (int i = 1; i < 200; i++) {
            if (nombres[i].compareTo(primerNombre) < 0) {
                primerNombre = nombres[i];
            }
        }
        return primerNombre;
    }

    public static String ejercicio39(Scanner sc) {
        String nombreMayor = "";
        int edadMayor = 0;
        for (int i = 0; i < 8; i++) {
            System.out.print("Ingrese un nombre: ");
            String nombre = sc.next();
            System.out.print("Ingrese la edad de " + nombre + ": ");
            int edad = sc.nextInt();
            if (i == 0) {
                edadMayor = edad;
            }
            if (edad > edadMayor) {
                nombreMayor = nombre;
                edadMayor = edad;
            }
        }
        return nombreMayor;
    }

    public static String ejercicio40(Scanner sc) {
        String[] paises = new String[70];
        double[] areas = new double[70];
        for (int i = 0; i < 70; i++) {
            System.out.print("Ingrese el nombre de un país: ");
            paises[i] = sc.next();
            System.out.print("Ingrese el área de " + paises[i] + ": ");
            areas[i] = sc.nextDouble();
        }
        double menorArea = areas[0];
        String paisMenorArea = paises[0];
        for (int i = 1; i < 70; i++) {
            if (areas[i] < menorArea) {
                menorArea = areas[i];
                paisMenorArea = paises[i];
            }
        }
        return paisMenorArea;
    }
}
