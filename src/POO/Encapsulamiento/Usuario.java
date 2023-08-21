/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.Encapsulamiento;

/**
 *
 * @author Tomas
 */
public class Usuario {
    public String username;
    private String password;    // Encapsulamiento
    // Modificadores de acceso
    // Default
    // Public
    // Private
    // Protected
    
    // Constructor
    //Similar a un metodo, nombre de la clase
    public Usuario(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public void saluda() {
        System.out.println("Hola mi username es " + this.username);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    } 
}
