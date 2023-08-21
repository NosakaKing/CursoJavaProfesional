/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.Herencia_Super;

/**
 *
 * @author Tomas
 */
public class Perro extends Mascota {
     // La clase padre tiene un constructor con parametros
     public Perro(String nombre, String raza, int edad){
       super(nombre,raza,edad);
   } 
     // Anotacion cuando sobreescribimos un metodo siempre un @Override
     @Override
     public void dormir() {
         // Sobre escritura de metodos
         // Super hace referencia a la clase Padre (Mascota)
            super.dormir();
            System.out.println("El perro duerme!");
     }
}
