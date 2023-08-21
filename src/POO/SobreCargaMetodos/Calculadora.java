/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.SobreCargaMetodos;

/**
 *
 * @author Tomas
 */
public class Calculadora {

    // Sobrecarga de metodos. 3 metodos con el nombre suma, los metofdos tiene parametros diferentes
    // Enteros
    public int suma(int valor1, int valor2) {
        return valor1 + valor2;
    }

    // Flotantes
    public float suma(float valor1, float valor2) {
        return valor1 + valor2;
    }
    // Doubles

    public double suma(double valor1, double valor2) {
        return valor1 + valor2;
    }

    public int suma(int valor1, int valor2, int valor3) {
        return valor1 + valor2 + valor3;
    }

    public int suma() {
        return 0;
    }
}
