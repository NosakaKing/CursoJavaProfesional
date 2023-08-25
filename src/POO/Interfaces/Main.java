/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.Interfaces;

/**
 *
 * @author Tomas
 */
public class Main {
    public static void main (String []args){
        // Interfaces
        // No es posible la herencia multiple en Java, Una clase Hija solo heredera de una clase Padre
        
        PastorAleman Al = new PastorAleman();
        Al.aullar();
        Al.esMascota();
    }
}
