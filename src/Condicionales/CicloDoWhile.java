/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionales;

/**
 *
 * @author Tomas
 */
public class CicloDoWhile {
    int contador = 10;
    
    // While -> 1. Se Evalua   2. Se ejecuta el bloque
    // Do While -> 1. Se ejecuta el bloque   2. Se evalua
    
    /*while (contador <10){
            System.out.println(contador);
            contador++;
} */
    public void getDoWhile() {  // Estructura del Do Whille
        do {
            System.out.println(contador);  // Primero imprime el valor luego lee la condicion
            contador++;
        } while (contador < 10);
    }
}
