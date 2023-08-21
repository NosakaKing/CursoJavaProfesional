/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.SobrecargaConstructores;

/**
 *
 * @author Tomas
 */
public class Main {
    public static void main (String [] args) {
    Usuario User1 = new Usuario();
    Usuario User2 = new Usuario("Raul");
    Usuario User3 = new Usuario("Raul", "namiswam");
    User1.saluda();
    User2.saluda();
    User3.saluda();
    }
}
