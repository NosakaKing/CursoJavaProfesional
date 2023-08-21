/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.Pilas;

import java.util.Stack;

/**
 *
 * @author Tomas
 */
public class Main {
    public static void main(String[] args) {
    // Crear una pila (stack)
    Stack<String> stack = new Stack<>();
    // Pilas
    // Agregar elementos a la pila
    stack.push("Manzana");
    stack.push("Naranja");
    stack.push("Pera");

    // Acceder a los elementos de la pila
    System.out.println("Elementos de la pila:");
    while (!stack.empty()) {
      System.out.println(stack.pop());
    }
  }
}
