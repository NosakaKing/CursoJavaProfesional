/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.Herencia_Super;

/**
 *
 * @author Tomas
 */
public class Mascota {
    public String nombre = " ";
    public String raza = " ";
    public int edad;
    // Sobre escritura del constructor
    public Mascota (String nombre, String raza, int edad){
       this.nombre = nombre;
       this.raza = raza;
       this.edad = edad;
    }
    public void dormir(){
        System.out.println("La mascota duerme");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
