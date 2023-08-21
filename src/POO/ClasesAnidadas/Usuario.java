/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.ClasesAnidadas;

/**
 *
 * @author Tomas
 */
public class Usuario {
    public String username;
    public Usuario (String username ){
        this.username = username;
    }
    public void establecerRol() {
        Administrado admin = new Administrado();
        admin.trabajar();     // Puede hacer uso de los atributos y metodos de la clase principal y vicerversa 
        
    }
    public class Administrado {
        public void trabajar() {
            System.out.println("El adminsitrador " + username  + " se encuentra trabajando ");
        }
    }
}
    