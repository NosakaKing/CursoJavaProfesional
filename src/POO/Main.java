/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author Tomas
 */
public class Main {
     public static void main(String[] args) {
        Automovil autoGenerico = new Automovil("Toyota", "Rojo", "ABC123");
        System.out.println(autoGenerico.ObtenerInfo());

        Carro carroEspecifico = new Carro("Chevrolet", "Rojo", "GMY-043", 200);
        System.out.println(carroEspecifico.ObtenerInfo(false));
        System.out.println(carroEspecifico.ObtenerInfo(true)); // Llamada a la versión sobrecargada con aceleración
    }
}
