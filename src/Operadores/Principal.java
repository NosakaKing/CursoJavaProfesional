/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operadores;

/**
 *
 * @author Tomas
 */
public class Principal {
    public static void main (String[] args){
        Aritmeticos ar = new Aritmeticos ();
        Casting ca = new Casting ();
        OperadoresRelacionales relacional = new OperadoresRelacionales();
        OperadoresLogicos log = new OperadoresLogicos ();
        OperadorTernario Te =  new OperadorTernario();
        // Suma, Resta, Multiplicacion, Division
        System.out.println("La suma de: " + ar.variableX + " + " + ar.variableY + " es igual a: " + ar.getSuma());
        System.out.println("La resta de: " + ar.variableX + " - " + ar.variableY + " es igual a: " + ar.getResta());
        System.out.println("La multiplicacion de: " + ar.variableX + " * " + ar.variableY + " es igual a: " + ar.getMultiplicacion());
        System.out.println("La division de: " + ar.variableX + " / " + ar.variableY + " es igual a: " + ar.getDivision());
        System.out.println(ar.getIncremento());
        System.out.println(ar.getOperacion());
        
        //Casting
        System.out.println("Casting");
        System.out.println(ca.getResultado());
        System.out.println((int)ca.variableZ);
        
        //OPERADORES RELACIONALES
        System.out.println("Operadores Relacionales");
        System.out.println(relacional.getRelacional());
        
        //OPERADORES LOGICOS
        System.out.println("Operadores Logicos");
        System.out.println(log.getAnd());
        System.out.println(log.getOr());
        System.out.println(log.getMezcla());
        System.out.println(!log.getNot());
        
        //Operador Terneario
        System.out.println("Terneario");
        System.out.println(Te.msj);
        System.out.println(Te.enteros);
        
        
    }
}
