/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.Vector;

import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author Tomas
 */
public class Main {
    public static void main(String[] args) {
    // Crear un vector de enteros es con Integer
    // int = Integer; String = String; y lo demas igual
    Vector<Integer> vector = new Vector<>();

    // Agregar elementos al vector
    vector.add(10);
    vector.add(20);
    vector.add(30);

     // Obtener un iterador del Vector
    Iterator<Integer> iterator = vector.iterator();

    // Recorrer los elementos del Vector utilizando el iterador
    System.out.println("Elementos del Vector:");
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}
