package com.mycompany.entornosentrega1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author diurno
 */
public class EntornosEntrega1 {

    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
        ejercicio10();
    }

    public static void ejercicio1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        int max = num1 > num2 ? num1 : num2;

        System.out.println("El número mayor es: " + max);
    }

    public static void ejercicio2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de a: ");
        double a = sc.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        double b = sc.nextDouble();

        System.out.print("Ingrese el valor de c: ");
        double c = sc.nextDouble();

        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            System.out.println("Las soluciones son: x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);

            System.out.println("La solución es: x = " + x);
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
    }

    public static void ejercicio3() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int num3 = sc.nextInt();

        int max = Math.max(Math.max(num1, num2), num3);

        System.out.println("El número mayor es: " + max);
    }
    
    public static void ejercicio4() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();
        
        System.out.print("Ingrese el tercer número: ");
        int num3 = sc.nextInt();
        
        int[] nums = {num1, num2, num3};
        Arrays.sort(nums);
        
        System.out.println("Los números ordenados de mayor a menor son: " + nums[2] + ", " + nums[1] + ", " + nums[0]);
    }
    
    public static void ejercicio5() {
        int[] numeros = {5, 2, 3}; // Aquí debes ingresar los tres números que desees ordenar

        Arrays.sort(numeros);

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
    
    public static void ejercicio6() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int numero1 = sc.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int numero2 = sc.nextInt();

        if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
            System.out.println("Uno de los números es múltiplo del otro.");
        } else {
            System.out.println("Ninguno de los números es múltiplo del otro.");
        }
    
    }
    
    public static void ejercicio7() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la nota: ");
        int nota = sc.nextInt();

        if (nota < 5) {
            System.out.println("Suspenso");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Aprobado");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }
    }
    
    public static void ejercicio8() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 3; i++) {
            int multiplo = numero * i;
            System.out.println(multiplo);
        }
    }
    
    public static void ejercicio9() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int numero1 = sc.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int numero2 = sc.nextInt();

        System.out.println("Ingrese el tercer número: ");
        int numero3 = sc.nextInt();

        System.out.println("Ingrese el cuarto número: ");
        int numero4 = sc.nextInt();

        int menor = Math.min(Math.min(numero1, numero2), Math.min(numero3, numero4));
        System.out.println("El número menor es: " + menor);
    }
    
    public static void ejercicio10() {
        Scanner sc = new Scanner(System.in);

        int suma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingrese el número " + i + ": ");
            int numero = sc.nextInt();
            suma += numero;
        }

    }
    }

