/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package POO.HerenciaInterfaces;

/**
 *
 * @author Tomas
 */
public interface InterfaceB {
    public void mostrarMensaje();
    // Metodo default, Posse un cuerpo y un comportamiento
    public default void saludar() {
        System.out.println("Hola mundo, desde una interface!");
    }
}
