/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.ClasesAnidadas;

/**
 *
 * @author Tomas
 */
public class Main {
    public static void main (String [] args){
        Usuario user =  new Usuario("Tomas");
        System.out.println(user.username);
        user.establecerRol();
    }
}
