/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionales;

/**
 *
 * @author Tomas
 */
public class CicloWhile {
    //While
    int contador = 0;
    int num = 550;
    
    public String getHolaMundo() {
        while(num > 0){
            num /= 10;
            contador++;
        }
        return ("El numero posee " + contador + " digitos");
    }
}
