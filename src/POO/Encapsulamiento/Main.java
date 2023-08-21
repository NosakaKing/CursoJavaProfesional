/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.Encapsulamiento;

/**
 *
 * @author Tomas
 */
public class Main {
   public static void main (String [] args){
       Usuario User = new Usuario("Codi", "Pass");
       System.out.println(User.getPassword());
       //User.password = "pass";
   } 
}
