/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.RetornarValores;

/**
 *
 * @author Tomas
 */
public class Main {

    public static void main(String[] args) {
        // Retornar Valores
        Triangulo triangulo = new Triangulo();
        triangulo.base = 10;
        triangulo.altuta = 20;
        //Cuando retorno un valor debo imprimir
        System.out.println(triangulo.area()); 
    }
}
