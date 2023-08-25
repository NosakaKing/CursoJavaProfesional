/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.HerenciaInterfaces;

/**
 *
 * @author Tomas
 */
public class ClaseFinal implements InterfaceA {
    //Herencia entre interfaces
    // Se implementa lo quw tiene de Interfaz A, pero Interfaz A heredo el metodo de Interfaz B 
    @Override
    public void mostrarMensaje() {
        System.out.println("Hola");
    }
    
}
