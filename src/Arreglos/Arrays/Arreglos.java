/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos.Arrays;

/**
 *
 * @author Tomas
 */
public class Arreglos {
    // Es una estrcutura de datos
    // Permite almacenar datos del mismo tipo
    // La logitud es inmutable

    //Arreglos
    String nombres[] = new String[3];
    // String nombres [] = { "Justin", "Raul", "Wendy"};
    // Clase de array
    int valores[] = new int[10];
    public String getArray() {
        nombres[0] = "Justin";
        nombres[1] = "Raul";
        nombres[2] = "Wendy";
        return nombres[0];
    }
    
    public void getInsertarRegistros() {
        for(int i = 0; i < valores.length ; i++){
            valores[i] = i;
            System.out.println(i);
            
        }
    }
     public void getRegistros(){
        for(int valor : valores) {
            System.out.println(valor);
        }
    }
}
