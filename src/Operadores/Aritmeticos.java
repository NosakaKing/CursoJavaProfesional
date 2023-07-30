/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operadores;

/**
 *
 * @author Tomas
 */
public class Aritmeticos {
    //Operadores Aritmeticos
    int variableX = 50, variableY = 10;
    int re;
    public int getSuma(){
       re = variableX + variableY;
       return re;
}
     public int getResta(){
       re = variableX - variableY;
       return re;
}
      public int getMultiplicacion(){
       re = variableX * variableY;
       return re;
}
       public int getDivision(){
       re = variableX / variableY;
       return re;
}
        public int getIncremento(){
        variableX++;   // variableX = variableX + 1;
       return variableX;
}
        public int getOperacion(){
        variableY *= 100;  // variableX = variableX * 100; /= , -= , +=
       return variableY;
}
}
    
