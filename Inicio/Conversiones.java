public class Conversiones {

    public static void main(String[] args) {
        int a = 5000;
        long b = 5000000;

        System.out.println("\nEl valor del int: " + a);
        System.out.println("El valor del long: " + b);

        // Convertimos de un int a long: conversion implicita
        b = a;
        System.out.println("\nEl valor del long después de la conversion implicito: " + b);

        // Convertimos un double a int: conversion explicita
        double num = 100.85;
        int c;
        c = (int)num;
        System.out.println("\nEl valor del int despues de la conversion explicita es: " + c);

        // Otro ejemplo más de conversion explicita
        System.out.println("\n¿Que resultado da 9/5? " + 9/5);
        System.out.println("Necesitamos una conversion explicita (double)9/5 para que nos de el resultado correcto: " + (double)9/5);
    }
}

