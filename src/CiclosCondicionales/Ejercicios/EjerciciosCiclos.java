/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CiclosCondicionales.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class EjerciciosCiclos {

    int num1 = 9, num2 = 50, num3 = 4;
    int num = 10;
    int n = 14;
    int res = 1;
    int x;

    public void Aprobado() {
        // Mostrar en consola el mensaje de "Aprobado" en caso la calificación de un alumno sea mayor igual a 70, en caso contrario mostrar el mensaje "Reprobado".

        if (num >= 70) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }

    public void Asc() {
        //Si el menor es el primero
        //Dado 3 números enteros, mostrar en consola los números de forma ascendente, de menor a mayor. Ejemplo Números = 9, 50, 4 Salida = 4, 9, 50
        if (num1 < num2 && num1 < num3) {
            if (num2 < num3) {
                System.out.println(num1 + " , " + num2 + " , " + num3);
            }
        }
        //Si el menor es el segundo
        if (num2 < num1 && num2 < num3) {
            if (num1 < num3) {
                System.out.println(num2 + " , " + num1 + " , " + num3);
            } else {
                System.out.println(num2 + " , " + num3 + " , " + num1);
            }
        }
        //Si el menor es el tercero
        if (num3 < num1 && num3 < num2) {
            if (num1 < num2) {
                System.out.println(num3 + " , " + num1 + " , " + num2);
            } else {
                System.out.println(num3 + " , " + num2 + " , " + num1);
            }
        }
    }

    public void getTabla9() {
        //Imprimir en consola la tabla de multiplicar del número 9.
        for (int i = 1; i < 11; i++) {
            int re = 9 * i;
            System.out.println("9" + " * " + i + " = " + re);
        }
    }

    public void getSalida() {
        //Ejercicio de los asteriscos
        for (int i = 0; i < 6; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void getSalidaNavidad() {
        //Ejercicio del arbolito de navidad
        for (int i = 5; i >= 1; i--) {

            int ciclosExtra = 5 - i;

            for (int j = 0; j <= 5 + ciclosExtra; j++) {

                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }

    public void getFibonacci() {
        //Imprimir en consola los primero diez números de la serie Fibonacci.
        int serie = 11, n1 = 0, n2 = 1, suma = 1;
        System.out.println(n1);
        for (int i = 1; i < serie; i++) {
            System.out.println(suma);
            suma = n1 + n2;
            n1 = n2;
            n2 = suma;
        }
    }

    public String getPrimo() {
        if (n % 2 == 1) {
            return "Es primo";
        } else {
            return "No es primo";
        }
    }

    /*public void getMultiplos() {
        //Imprimir en consola todos los números múltiplos de 2. El ciclo finalizará cuando el último múltiplo sea menor a 4570
        for (int i = 0; i < 4570; i++) {
            if(i % 2 == 0){
                System.out.print(i + ",");
            } 
        }
    }*/
    public void getFactorial() {
        //Dado un número entero obtener su factorial.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero para sacar su factorial:");
        x = scanner.nextInt();
        for (int i = 1; i <= x; i++) {
            res = res * i;
        }
        System.out.println("El factorial de: " + x + " es igual a " + res);
    }
}
