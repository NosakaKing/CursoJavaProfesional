/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.ClasesAbstractas;

/**
 *
 * @author Tomas
 */
public class Triangulo extends Figura {

    private float base;
    private float altura;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
        //setNumeroLados(3);
    }

    @Override
    public float area() {
        return (base * altura) / 2;
        
    }
}
