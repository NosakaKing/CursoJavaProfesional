/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operadores;

/**
 *
 * @author Tomas
 */
public class OperadoresLogicos {
    // Operadores Logicos
    // and (y), or (o) y not (no)
    // and = &&   ;   or = ||
    boolean re;
    
    public boolean getAnd (){
        re = 5 >= 5 && 10 >= 10 && 10 > 9;   // Si todas las  condiciones son verdaderas el resultado es true
        return re;
    }
    public boolean getOr (){
        re = 5 >= 5 || 10 > 10 || 10 < 9;   // Si uno de las condiciones es verdadera el resultado es true
        return re;
    }
    public boolean getNot (){
        re = false;   // Si el operador es verdadero es falso y inverso
        return re;
    }
     public boolean getMezcla (){
        re = (5 >= 10 && 10 < 5) && (15 <= 20 || (10*5) < (2 * 7));   //    Mezcla los parentesis se hacen primero
        return re;
    }
}
