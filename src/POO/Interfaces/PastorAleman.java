/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.Interfaces;

/**
 *
 * @author Tomas
 */
// Multiples Interfaces
public class PastorAleman implements Canino, Mascota {

    @Override
    public void aullar() {
        System.out.println("El pastor Aleman Aulla");
    }
    @Override
    public void esMascota(){
        System.out.println("El es una mascota");
    }
}
