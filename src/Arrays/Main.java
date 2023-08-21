/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Tomas
 */
public class Main {

    public static void main(String[] args) {
        // Instancias
       Arreglos array = new Arreglos();
       RecorrerArreglos ra = new RecorrerArreglos();
       Foreach each = new Foreach();
       ArreglosDosDimensiones matriz = new ArreglosDosDimensiones();
       ArreglosMultidimensionales multi = new ArreglosMultidimensionales();
       
       // Imprimir arreglo
        System.out.println(array.getArray());
        
        // Imprimir recorrer Arreglo
        ra.getRecorrerArreglos();
        
         // Imprimir recorrer Arreglo con for each
        each.getForeach();
        
        // Imprimir insertar registros
        array.getInsertarRegistros();
        array.getRegistros();
        
        // Imprimir matriz
        matriz.getMatriz();
        matriz.getMatrizEach();
        
        // Imprimir arreglo multidimensional
        multi.getCalificaciones();
    }
}
