/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.Herencia_Super;

/**
 *
 * @author Tomas
 */
public class Main {
    public static void main (String [] args ){
        Gato Tomas = new Gato("Tomas", "Tigre", 2);
        Perro Prins = new Perro("Princesa", "Lobo", 6);
        System.out.println(Tomas.getNombre());
        Tomas.dormir();
        Prins.dormir();
    }
}
