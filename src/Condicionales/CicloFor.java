/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionales;

import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class CicloFor {
    int re;
    int num;
    Scanner datos = new Scanner(System.in);  // Para leer desde la entrada estandar del teclado
    //Ciclo For
    // for (Inicializacion, Condicion, Iteracion) {}
     public void getFor() {
         // Tabla de multiplicar de un numero
         System.out.println("Ingresa un numero entero");
         int num = datos.nextInt();
         for (int i = 1; i <= 10; i++) {
           re= num * i;  
             System.out.println(num + " * " + i + " = " + re);
         }
     }
     public void getFor2(){
         // Numeros pares del 1 al 100
         for (int i = 1; i < 101; i++) {
             if (i % 2 == 0) {
                 System.out.println(i);
             }
         }
     }
}
