/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.Static;

/**
 *
 * @author Tomas
 */
public class Circulo {
    // Static si no queremos instanciar 
    //  Uso de el sin necesidad de crear un nuevo objeto 
    public static final float pi = 3.1415926535f;   // A la clase (Le pertenece)
    public float radio = 0f;    // Elementos de instancia 
    
    public Circulo (float radio) {
        this.radio = radio;
    }
    public static float area(float radio) {
        return Circulo.pi * (radio * radio);
    }
}
