package com.mycompany.repasoexamen15nov;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RepasoExamen15Nov {

    public static void main(String[] args) {
        // Tipos de datos en Java
        tiposDeDatos();

        // PrintF
        printFExample();

        // JOptionPane
        jOptionPaneExample();

        // Operadores Matematicos
        operadoresMatematicos();

        // Random y ThreadLocalRandom
        numerosRandom();

        // Usando CHAR para sacar letras y demas...
        usandoChar();

        // Condicionales (If...Else y Switch)
        condicionales();

        // Bucles (While, Do...While y For)
        bucles();

        // Arrays (Sencillos y Bidimensionales)
        arraysSimple();

        // Matrices bidimensionales
        matrices();

        // Entrada de datos (Scanner)
        entradaDeDatos();

        // Dividir programa en funciones
        dividirEnFunciones();

        // Enums
        enums();

        // Fechas (LocalDate, LocalTime, LocalDateTime y DateTimeFormatter)
        fechas();

        // Sumar y restar Fechas
        sumaYRestaFecha();

        // Ejemplo bucle y condicional
        numeroPrimo();

        // Ejemplo de ForEach con Arrays
        usandoForE();

        // Ejemplo usando Enum y toUpperCase
        usandoEnumToUpperCase();

        // Ejemplo usando String
        usandoString();
    }

    // Tipos de datos en Java
    private static void tiposDeDatos() {
        int entero = 10;
        double decimal = 3.14;
        char caracter = 'A';
        boolean booleano = true;
        String cadena = "Hola, Mundo";

        System.out.printf("Entero: %d, Decimal: %.2f, Caracter: %c, Booleano: %b, Cadena: %s%n",
                entero, decimal, caracter, booleano, cadena);
    }

    // PrintF
    private static void printFExample() {
        double numero = 25.6;
        double raizCuadrada = Math.sqrt(numero);
        double potencia = Math.pow(numero, 2);
        double redondeo = Math.round(numero);

        System.out.printf("Número: %.2f, Raíz cuadrada: %.2f, Potencia: %.2f, Redondeo: %.2f%n",
                numero, raizCuadrada, potencia, redondeo);
    }

    // JOptionPane
    private static void jOptionPaneExample() {
        // Solicitar al usuario que ingrese su nombre
        String nombre = JOptionPane.showInputDialog("Por favor, ingresa tu nombre:");

        // Verificar si se ingresó un nombre
        if (nombre != null && !nombre.isEmpty()) {
            // Mostrar un mensaje de bienvenida
            nombre = nombre.trim();
            JOptionPane.showMessageDialog(null, "¡Hola, " + nombre + "!\nBienvenido a JOptionPane");
        } else {
            // Mostrar un mensaje si no se ingresó un nombre válido
            JOptionPane.showMessageDialog(null, "Nombre no válido. Adiós.");
        }
    }

    // Operadores Matematicos
    private static void operadoresMatematicos() {
        double numero = 25.6;

        // Operadores matemáticos básicos
        double suma = numero + 5;
        double resta = numero - 8;
        double multiplicacion = numero * 2;
        double division = numero / 4;

        // Operadores matemáticos avanzados
        double raizCuadrada = Math.sqrt(numero);
        double potencia = Math.pow(numero, 2);
        double redondeo = Math.round(numero);

        System.out.println("Número: " + numero);
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Raíz cuadrada: " + raizCuadrada);
        System.out.println("Potencia: " + potencia);
        System.out.println("Redondeo: " + redondeo);
    }

    // Random y ThreadLocalRandom
    private static void numerosRandom() {
        Random rndm = new Random();
        int rndm2 = 0;

        // Ejemplo de generación de números aleatorios con Random
        System.out.println("Números aleatorios con Random:");
        for (int i = 0; i < 5; i++) {
            rndm.nextInt(100);
            System.out.println();
        }

        // Ejemplo de generación de números aleatorios con ThreadLocalRandom
        System.out.println("\nNúmeros aleatorios con ThreadLocalRandom:");
        for (int i = 0; i < 5; i++) {
            rndm2 = ThreadLocalRandom.current().nextInt(100);
            System.out.println();
        }
    }

    // Usando CHAR para sacar letras y demas...
    private static void usandoChar() {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un nombre
        System.out.print("Ingresa un nombre: ");
        String nombre = scanner.nextLine();

        // Solicitar al usuario que ingrese la posición de la letra que desea extraer
        System.out.print("Ingresa la posición de la letra que deseas extraer: ");
        int posicion = scanner.nextInt();

        // Mostrar la letra en la posición especificada
        char letraExtraida = extraerLetra(nombre, posicion);
        if (letraExtraida != '\0') {
            System.out.println("La letra en la posición " + posicion + " es: " + letraExtraida);
        } else {
            System.out.println("Posición no válida en el nombre.");
        }
    }

    // Extraer letra (funcion complementaria de usandoChar())
    private static char extraerLetra(String nombre, int posicion) {
        if (posicion >= 0 && posicion < nombre.length()) {
            return nombre.charAt(posicion);
        } else {
            return '\0'; // Valor nulo de char para indicar posición no válida
        }
    }

    // Condicionales (If...Else y Switch)
    private static void condicionales() {
        int entero = 10;
        char caracter = 'A';

        if (entero > 0) {
            System.out.println("El entero es positivo");
        } else if (entero < 0) {
            System.out.println("El entero es negativo");
        } else {
            System.out.println("El entero es cero");
        }

        switch (caracter) {
            case 'A':
                System.out.println("La letra es A");
                break;
            case 'B':
                System.out.println("La letra es B");
                break;
            default:
                System.out.println("La letra no es ni A ni B");
        }
    }

    // Bucles (While, Do...While y For)
    private static void bucles() {
        int i = 0;

        // While
        while (i < 5) {
            System.out.println("While: " + i);
            i++;
        }

        // Do...While
        i = 0;
        do {
            System.out.println("Do...While: " + i);
            i++;
        } while (i < 5);

        // For
        for (i = 0; i < 5; i++) {
            System.out.println("For: " + i);
        }
    }

    // Arrays (Sencillos y Bidimensionales)
    private static void arraysSimple() {
        int[] arrayUni = new int[5];
        int[][] arrayBidi = new int[5][3];
        for (int i = 0; i <= 5; i++) {
            arrayUni[i] = i + 7;
        }

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 2; j++) {
                arrayBidi[i][j] = i + j + 6;
            }
        }
        int[] arrayUnidimensional = {1, 2, 3, 4, 5};
        int[][] matrizBidimensional = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    }

    // Matrices bidimensionales
    private static void matrices() {
        // Definir dos matrices para sumar
        int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matriz2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        // Realizar la suma de las matrices
        int[][] resultado = sumarMatrices(matriz1, matriz2);

        // Mostrar las matrices y el resultado
        System.out.println("Matriz 1:");
        mostrarMatriz(matriz1);

        System.out.println("\nMatriz 2:");
        mostrarMatriz(matriz2);

        System.out.println("\nResultado de la suma:");
        mostrarMatriz(resultado);
    }

    // Complemento a matrices()
    private static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return resultado;
    }

    // Complemento a matrices() y sumarMatrices()
    private static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Entrada de datos (Scanner)
    private static void entradaDeDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numeroIngresado = scanner.nextInt();
        System.out.println("Número ingresado: " + numeroIngresado);
    }

    // Dividir programa en funciones
    private static void dividirEnFunciones() {
        imprimirMensaje("Hola desde la función");
    }

    // Enums
    private static void enums() {
        TipoDato tipo = TipoDato.ENTERO;
        System.out.println("Enum: " + tipo);
    }

    // Fechas (LocalDate, LocalTime, LocalDateTime y DateTimeFormatter)
    private static void fechas() {
        LocalDate fechaActual = LocalDate.now();
        LocalTime horaActual = LocalTime.now();
        LocalDateTime fechaYHoraActual = LocalDateTime.now();

        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Fecha actual: " + fechaActual.format(formatoFecha));
        System.out.println("Hora actual: " + horaActual.format(formatoHora));
        System.out.println("Fecha y hora actual: " + fechaYHoraActual.format(formatoFecha) + " "
                + fechaYHoraActual.format(formatoHora));
    }

    // Sumar y restar Fechas
    private static void sumaYRestaFecha() {
        LocalDate fechaInicial = LocalDate.now();
        int diasAsumar = 7;
        int diasArestar = 3;

        LocalDate fechaSumada = sumarDiasAFecha(fechaInicial, diasAsumar);
        LocalDate fechaRestada = restarDiasAFecha(fechaInicial, diasArestar);

        System.out.println("Fecha inicial: " + fechaInicial);
        System.out.println("Fecha sumada: " + fechaSumada);
        System.out.println("Fecha restada: " + fechaRestada);
    }

    // Función para sumar días a una fecha
    private static LocalDate sumarDiasAFecha(LocalDate fecha, int diasASumar) {
        return fecha.plusDays(diasASumar);
    }

    // Función para restar días a una fecha
    private static LocalDate restarDiasAFecha(LocalDate fecha, int diasARestar) {
        return fecha.minusDays(diasARestar);
    }

    // Sout de manual
    private static void imprimirMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    // Ejemplo bucle y condicional
    private static void numeroPrimo() {
        int numero = 13;

        if (esPrimo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }

    //Complemento de numeroPrimo()
    private static boolean esPrimo(int num) {
        if (num <= 1) {
            return false; // 0 y 1 no son primos
        }

        // Verificar si el número es divisible por algún número entre 2 y su raíz cuadrada
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // No es primo si es divisible por algún número entre 2 y su raíz cuadrada
            }
        }

        return true; // Si no es divisible por ningún número entre 2 y su raíz cuadrada, es primo
    }

    // Ejemplo de ForEach con Arrays
    private static void usandoForE() {
        int[] numeros = {10, 5, 8, 15, 7};

        double promedio = calcularPromedio(numeros);

        System.out.println("Array de números:");
        mostrarArray(numeros);

        System.out.println("\nEl promedio de los números es: " + promedio);
    }

    // Función para calcular el promedio de un array de números
    private static double calcularPromedio(int[] array) {
        int suma = 0;

        // Utilizando un bucle foreach para sumar todos los elementos del array
        for (int numero : array) {
            suma += numero;
        }

        // Calcular el promedio dividiendo la suma por la cantidad de elementos
        return (double) suma / array.length;
    }

    // Función para mostrar un array de números
    private static void mostrarArray(int[] array) {
        for (int numero : array) {
            System.out.print(numero + " ");
        }
    }

    // Ejemplo usando Enum y toUpperCase
    private static void usandoEnumToUpperCase() {
        String palabraOriginal = "java";
        TipoDato tipo = TipoDato.CADENA;

        String palabraEnMayusculas = convertirAMayusculas(palabraOriginal);
        System.out.println("Palabra original: " + palabraOriginal);
        System.out.println("Palabra en mayúsculas: " + palabraEnMayusculas);

        System.out.println("\nTipo de dato: " + tipo);
    }

    // Función que utiliza toUpperCase y enum
    private static String convertirAMayusculas(String palabra) {
        return palabra.toUpperCase();
    }

    // Función que utiliza varios métodos de la clase String
    private static void usandoString() {
        String texto = "Hola, como estas";

        // length(): Obtener la longitud de la cadena
        int longitud = texto.length();
        System.out.println("Longitud de la cadena: " + longitud);

        // toLowerCase(): Convertir la cadena a minúsculas
        String enMinusculas = texto.toLowerCase();
        System.out.println("En minúsculas: " + enMinusculas);

        // toUpperCase(): Convertir la cadena a mayúsculas
        String enMayusculas = texto.toUpperCase();
        System.out.println("En mayúsculas: " + enMayusculas);

        // trim(): Eliminar espacios en blanco al principio y al final de la cadena
        String sinEspacios = texto.trim();
        System.out.println("Sin espacios al principio y al final: " + sinEspacios);

        // substring(): Obtener una subcadena de la cadena original
        String subcadena = texto.substring(7, 12);
        System.out.println("Subcadena entre las posiciones 7 y 12: " + subcadena);

        // replace(): Reemplazar parte de la cadena por otra
        String reemplazada = texto.replace("Mundo", "GPT-3");
        System.out.println("Cadena con reemplazo: " + reemplazada);

        // indexOf(): Encontrar la posición de una subcadena en la cadena original
        int posicion = texto.indexOf("Hola");
        System.out.println("Posición de 'Hola': " + posicion);

        // startsWith() y endsWith(): Verificar si la cadena comienza o termina con cierta subcadena
        boolean comienzaConHola = texto.startsWith("Hola");
        boolean terminaConExclamacion = texto.endsWith("!");
        System.out.println("Comienza con 'Hola': " + comienzaConHola);
        System.out.println("Termina con '!': " + terminaConExclamacion);

        // equals(): Comparar dos cadenas por contenido
        boolean sonIguales = texto.equals("   Hola, Mundo!   ");
        System.out.println("¿Son iguales?: " + sonIguales);

        // contains(): Verificar si una subcadena está presente en la cadena original
        boolean contieneHola = texto.contains("Hola");
        System.out.println("Contiene 'Hola': " + contieneHola);

        // concat(): Concatenar dos cadenas
        String concatenada = texto.concat(" ¡Qué buen día!");
        System.out.println("Cadena concatenada: " + concatenada);

        // compareTo(): Comparar dos cadenas lexicográficamente
        int comparacion = texto.compareTo("Hola");
        System.out.println("Comparación lexicográfica: " + comparacion);

        // compareToIgnoreCase(): Comparar dos cadenas sin distinguir mayúsculas y minúsculas
        int comparacionIgnoreCase = texto.compareToIgnoreCase("   HOLA, MUNDO!   ");
        System.out.println("Comparación sin distinguir mayúsculas y minúsculas: " + comparacionIgnoreCase);

        // split(): Dividir la cadena en un array de subcadenas
        String[] partes = texto.split(",");
        System.out.println("Partes divididas por coma:");
        for (String parte : partes) {
            System.out.println(parte.trim()); // trim() para eliminar espacios en blanco alrededor de cada parte
        }
    }

    // Enum usado en una funcion
    enum TipoDato {
        ENTERO, DECIMAL, CARACTER, BOOLEANO, CADENA
    }
}
