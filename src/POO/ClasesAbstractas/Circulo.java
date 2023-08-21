/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.ClasesAbstractas;

/**
 *
 * @author Tomas
 */
public class Circulo extends Figura {
    public static final float pi = 3.1415f;
    private float radio;
    
    public Circulo(float radio) {
        this.radio = radio;
    }
    @Override
    public float area() {
        return Circulo.pi * (this.radio * this.radio);
    }
}
