/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosArrays;

import java.util.Arrays;

/**
 *
 * @author Tomas
 */
public class EjerciciosArray {

    int num[] = new int[101];
    int suma = 0;
    boolean existeCien = false;
    public void getArray100() {
        for (int i = 0; i < num.length; i++) {
            int numero = (int) (Math.random() * 101);
            num[i] = numero;
            suma = suma + num[i];
            if(numero == 100){
                existeCien = true;
            }
            System.out.println("num [ " + i + " ]" + " = " + num[i]);
        }
        // Promedio Total
        float prom = suma/num.length;
        System.out.println("El promedio de todo es: " + prom);
        
         // Suma del primer arreglo con el ultimo
        int suma = num[0] + num[num.length - 1]; // Suma del primer y último elemento
         // Imprimir la suma
        System.out.println("La suma del primer y último elemento es: " + suma);
        // Numero mayor
        int numeroMayor = num[0];
        int posicionMayor = 0;
        for (int i = 1; i < num.length; i++) {
            if (num[i] > numeroMayor) {
                numeroMayor = num[i];
                posicionMayor = i;
            }
        }
        System.out.println("El numero mayor es: " + "num [ " + posicionMayor + " ] " + " = " + numeroMayor);
        System.out.println("");
        // Numero Menor
        int numeroMenor = num[0];
        int posicionMenor = 0;
        for (int i = 1; i < num.length; i++) {
            if (num[i] < numeroMenor) {
                numeroMenor = num[i];
                posicionMenor = i;
            }
        }
        System.out.println("El numero menor es: " + "num [ " + posicionMenor + " ] " + " = " + numeroMenor);
        // Numero Primos
        System.out.println("");
        int numeroPrimos = num[0];
        int posicionPrimo = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 1) {
                numeroPrimos = num[i];
                posicionPrimo = i;
                System.out.println("El numero primo es: " + "num [ " + posicionPrimo + " ] " + " = " + numeroPrimos);
            }
        }
        System.out.println("");
        // Numeros Pares
        int numeroPares = num[0];
        int posicionPares = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                numeroPares = num[i];
                posicionPares = i;
                System.out.println("El numero par es: " + "num [ " + posicionPares + " ] " + " = " + numeroPares);
            }
        }
        if (existeCien) {
            System.out.println("Existe cien");
        } else {
            System.out.println("No existe cien");
        }
    }

}
