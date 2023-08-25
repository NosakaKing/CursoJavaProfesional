/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos.EjerciciosMatrices;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class MatricesEj {

    public static void getMatrices(int[][] matriz) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int numero = (int) (Math.random() * 100);
                matriz[i][j] = numero;
                System.out.printf("%4d ", matriz[i][j]);
            }
            System.out.println("");
            // Mostrar las matrices 
        }
    }

    public static void NumeroMayor(int[][] matriz) {
        // Mostrar el numero mayor y cuantas veces se repite
        int NumeroMayor = matriz[0][0];
        int posicionMayorFila = 0;
        int posicionMayorColumnna = 0;
        int repeticiones = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] > NumeroMayor) {
                    NumeroMayor = matriz[i][j];
                    posicionMayorFila = i;
                    posicionMayorColumnna = j;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == NumeroMayor) {
                    repeticiones++;
                }
            }
        }
        System.out.println("El numero mayor es: " + "[ " + posicionMayorFila + " ] " + " [ " + posicionMayorColumnna + " ]" + " = " + NumeroMayor + " el numero se repite " + repeticiones + " veces");
    }

    // Método para calcular el promedio
    public static void ObtenerPromedio(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                suma += matriz[i][j];
            }
        }
        float prom = suma / 25;
        System.out.println("El promedio total es de: " + prom);
    }

    // Método para mostrar el promedio
    // Método para mostrar números primos
    public static void mostrarNumerosPrimos(int[][] matriz) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] % 2 == 1) {
                    System.out.println("[ " + i + " ] " + " [ " + j + " ]" + " = " + matriz[i][j]);
                }
            }
        }
    }

    // Método para mostrar números pares
    public static void mostrarNumerosPares(int[][] matriz) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] % 2 == 0) {
                    System.out.println("[ " + i + " ] " + " [ " + j + " ]" + " = " + matriz[i][j]);
                }
            }
        }
    }

    public static void SumaDiagonales(int[][] matriz) {
        int sumaPrincipal = 0;
        int sumaSecundaria = 0;
        for (int f = 0; f < 5; f++) {
            sumaPrincipal = sumaPrincipal + matriz[f][f];
            sumaSecundaria = sumaSecundaria + matriz[f][(-f + 4)];

        }
        System.out.println("La suma de la diagonal principal es de: " + sumaPrincipal);
        System.out.println("La suma de la diagonal secundaria es de: " + sumaSecundaria);
    }

    public static void SumaUltimaFila(int[][] matriz) {
        int sumauF = 0;
        for (int c = 0; c < 5; c++) {
            sumauF = sumauF + matriz[4][c];
        }
        System.out.println("La suma de la ultima fila es de: " + sumauF);
    }

    public static boolean esCuadradoMagico(int[][] matriz) {
        int sumaFila = 0;
        int sumaColumna = 0;

        // Calcular la suma de la primera fila y la primera columna para usar como referencia
        for (int i = 0; i < 5; i++) {
            sumaFila += matriz[0][i];
            sumaColumna += matriz[i][0];
        }

        // Verificar si las sumas de las filas y columnas son iguales a la suma de referencia
        for (int i = 1; i < 5; i++) {
            int sumaFilaActual = 0;
            int sumaColumnaActual = 0;
            for (int j = 0; j < 5; j++) {
                sumaFilaActual += matriz[i][j];
                sumaColumnaActual += matriz[j][i];
            }
            if (sumaFilaActual != sumaFila || sumaColumnaActual != sumaColumna) {
                return false;
            }
        }

        return true;
    }

    public static void getMatriz(int[][] matrices) {
        // Multiplos del 5
        for (int f = 0; f < 5; f++) {
            for (int c = 0; c < 4; c++) {
                int numero = ((f * 4) + c + 1) * 5;
                matrices[f][c] = numero;
                System.out.print(matrices[f][c] + "   ");
            }
            System.out.println("");
            // Mostrar las matrices 
        }

    }

    public static void IngresoVector(int[] array) {
        Scanner datos = new Scanner(System.in);
        int num = 0;
        for (int f = 0; f < array.length; f++) {

            System.out.println("Ingrese el valor " + f + " :");
            num = datos.nextInt();
            array[f] = num;

        }
        // Imprimir vector
        for (int f = 0; f < array.length; f++) {
            System.out.println(f + "  " + array[f]);
        }

    }

    public static void IngresarDatos(String[] nombres, int[] sueldo, float[] iess, float[] total) {
        Scanner datos = new Scanner(System.in);
        for (int f = 0; f < nombres.length; f++) {
            System.out.println("Ingrese el nombre del empleado numero: " + f);
            nombres[f] = datos.nextLine();
            System.out.println("Ingrese el sueldo del empleado " + f);
            sueldo[f] = Integer.parseInt(datos.nextLine());
            System.out.println("Ingrese el IESS del empleado " + f);
            iess[f] = Float.parseFloat(datos.nextLine());
            total[f] = sueldo[f] - iess[f];
        }

    }

    public static void imprimirTabla(String[] nombres, int[] sueldo, float[] iess, float[] total) {
        System.out.println("Imprimir Tabla de empleados:");
        System.out.println("Empleado   Nombre    Sueldo    IESS    Total");
        for (int f = 0; f < 3; f++) {
            System.out.printf("%-10d %-10s %-8d %-8.2f %-8.2f%n", f, nombres[f], sueldo[f], iess[f], total[f]);
        }
        System.out.println("");
    }

    public static void imprimirSumaTotal(float[] total) {
        float sumaTotal = 0;
        for (int f = 0; f < 3; f++) {
            sumaTotal += total[f];
        }
        System.out.println("La suma total de los sueldos es de: " + sumaTotal);
    }

    public static void imprimirGanaMas(String[] nombres, float[] total) {
        float ganaMas = total[0];
        String nombreGanaMas = nombres[0];
        for (int f = 0; f < 3; f++) {
            if (total[f] > ganaMas) {
                ganaMas = total[f];
                nombreGanaMas = nombres[f];
            }
        }
        System.out.println("El que gana más es: " + nombreGanaMas + " con un total de: " + ganaMas);
    }

    public static void imprimirGanaMenos(String[] nombres, float[] total) {
        float ganaMenos = total[0];
        String nombreGanaMenos = nombres[0];
        for (int f = 0; f < 3; f++) {
            if (total[f] < ganaMenos) {
                ganaMenos = total[f];
                nombreGanaMenos = nombres[f];
            }
        }
        System.out.println("El que gana menos es: " + nombreGanaMenos + " con un total de: " + ganaMenos);
    }
}
