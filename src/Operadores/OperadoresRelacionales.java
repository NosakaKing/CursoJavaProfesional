/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operadores;

/**
 *
 * @author Tomas
 */
public class OperadoresRelacionales {
    int variable1 = 200, variable2 = 200;
    boolean re;
    public boolean getRelacional() {
        re = variable1 != variable2;  // < menor, > mayor, <=, >= mayor (menor) o igual, != "Diferente" , == "Igual" 
        return re;
    }
}
