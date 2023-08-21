/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosMatrices;

/**
 *
 * @author Tomas
 */
public class Main {

    public static void main(String[] args) {
        int[][] matriz = new int[5][5]; 
        int [][] matrices = new int [5][4];
        int[] array = new int[10];
        String nombres[] = new String[3];
        int sueldo[] = new int[3];
        float iess[] = new float[3];
        float total[] = new float[3];
        // Imprimir matriz
        System.out.println("Numeros de la Matriz");
        MatricesEj.getMatrices(matriz);
        
        System.out.println("Numero Mayor en la matriz");
        MatricesEj.NumeroMayor(matriz);
        
        System.out.println("Numeros Primos");
        MatricesEj.mostrarNumerosPrimos(matriz);
        
        System.out.println("Numeros Pares");
        MatricesEj.mostrarNumerosPares(matriz);
        
        System.out.println("Promedio Total");
        MatricesEj.ObtenerPromedio(matriz); 
        
        System.out.println("Suma en Diagonal");
        MatricesEj.SumaDiagonales(matriz);
        
        System.out.println("Ultima Fila Suma");
        MatricesEj.SumaUltimaFila(matriz);

         if (MatricesEj.esCuadradoMagico(matriz)) {
        System.out.println("Cuadrado Mágico");
    }else{
             System.out.println("No es un cuadrado magico");
         }
        /*System.out.println("Multiplos del 5");
        MatricesEj.getMatriz(matrices);
        System.out.println("Ingrese numeros en el vector Ejercicio 2");
        MatricesEj.IngresoVector(array);
        System.out.println("EJERCICIO 3");
        MatricesEj.IngresarDatos(nombres, sueldo, iess, total);
        MatricesEj.imprimirTabla(nombres, sueldo, iess, total);
        MatricesEj.imprimirSumaTotal(total);
        MatricesEj.imprimirGanaMas(nombres, total);
        MatricesEj.imprimirGanaMenos(nombres, total); */
    }
}
