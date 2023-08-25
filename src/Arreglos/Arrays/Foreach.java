/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos.Arrays;

/**
 *
 * @author Tomas
 */
public class Foreach {

    // For each
    int calificaciones[] = {9, 8, 7, 10, 10, 9, 8, 8, 10, 9};
    int suma = 0;

    public void getForeach() {
        for (int valorPorIndice : calificaciones) {
            suma += valorPorIndice;

        }
        float prom = suma/calificaciones.length;
        System.out.println("El promedio es " + prom);
    }
}
