/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operadores;

/**
 *
 * @author Tomas
 */
public class Casting {
    int variableX = 50 , variableY = 10;
    float variableZ = 5.5f;
    int re;
    public int getResultado(){
        re = variableX + (int)variableZ; //Cambiamos la variable a entero de lo que era float
        return re;
    }
}

