/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.ClasesYObjetos;

/**
 *
 * @author Tomas
 */
public class Main {
   public static void main(String[]args){
       Perro lassie = new Perro();   // Instanciar
       // Argumentos
       lassie.establecerAtributos("Lukas", "Lobo", 3);
       System.out.println("El nombre es: " + lassie.nombre);
       System.out.println("El raza es: " + lassie.raza);
       System.out.println("El edad es: " + lassie.edad);
       lassie.comer();     //Metodos
       lassie.dormir();
       lassie.ladrar();
   } 
}
