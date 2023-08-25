/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.Excepciones;

/**
 *
 * @author Tomas
 */
public class Excepciones {

    public static void main(String[] args) {
        int a = 30;
        int b = 0;

        try{
            int c = a / b; // Intento de division por cero
        }catch (ArithmeticException e)   {
            System.out.println("Error: No se puede dividir por cero");
        }
    }
}
