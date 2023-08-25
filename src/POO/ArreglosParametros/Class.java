/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.ArreglosParametros;

/**
 *
 * @author Tomas
 */
public class Class {
    // En Java nosotros podemos trabajar con métodos los cuales reciban como parámetros arreglos.
    //Tipo dato [] nombre parámetros
    public static void showElements(String[] array) {
        for (int i = 0; i < array.length; i++) {
            String sentencia = array[i];
            System.out.println(sentencia);
        }
         
        /*for (String sentencia : array) {
        System.out.println(sentencia);
        // El bucle "for-each" itera automáticamente a través de cada elemento en la colección y asigna ese elemento a la variable que especificaste. No necesitas preocuparte por el índice del elemento ni por el rango del bucle, ya que Java se encarga de eso por ti.
    } */
    }
}
