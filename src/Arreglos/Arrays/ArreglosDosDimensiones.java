/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos.Arrays;

/**
 *
 * @author Tomas
 */
public class ArreglosDosDimensiones {
    //Matrices               Filas Colummnas
    int matriz [][] = new int [4][3];
    
    public void getMatriz() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = j + 1;
                System.out.println("La matriz " + "[ " + i + " ]" + " [ " + j + " ] " + " = " + matriz[i][j]);
            }
  
        }
    }
    public void getMatrizEach() {
        for(int [] fila : matriz) {
            for(int celda : fila) {
                System.out.println(celda);
            }
        }
    }
}
