/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntradaDatos.Scanner;


import java.util.Scanner;

/**
 *
 * @author Tomas
 */
public class Main {
    public static void main (String [] args) {
        //System.out.println("Mensaje con salto de linea");
        //System.out.print("Mensaje sin salto de linea");
        //System.out.printf("\nMensaje con %s", "Formato");
        // Obtener Tipos de datos
        Scanner sc  =  new Scanner (System.in);
        System.out.println("Cual es tu nombre?");
        String nombre  = sc.nextLine();
        
        System.out.println("Cual es tu edad?");
        //int edad = Integer.parseInt(sc.nextLine());
        int edad = sc.nextInt();
        
        System.out.println("Cual es su altura?");
        float altura = sc.nextFloat();
         
        sc.nextLine(); // Captura el salto de nextFloat
        
        System.out.println("Te gustan los videojuegos (si/no)?");
        //boolean valor = sc.nextBoolean();
         boolean valor = sc.nextLine().equals("si");
        System.out.println("Hola " + nombre + " " + edad + " " + altura + " " + valor);
        sc.close();  // No podremos tener datos de la consola
    }
}
