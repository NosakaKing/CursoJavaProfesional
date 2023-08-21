/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.ClasesAbstractas;

/**
 *
 * @author Tomas
 */
public class Main {

    public static void main(String[] args) {
        // Principio de sustitucion
        Figura figuras [] = new Figura[2];
        Figura tr = new Triangulo(9.8f,8.9f);
        Figura cr = new Circulo (9f);
        // Array
        figuras[0] = cr;
        figuras[1] = tr;
        System.out.println(figuras[0].area());
        System.out.println(figuras[1].area());
    }
}
