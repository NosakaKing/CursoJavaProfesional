/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CiclosCondicionales.CiCon;

/**
 *
 * @author Tomas
 */
public class BreakAndContinue {
    // Break And Continue
    
    public void getBreakC() {
        for (int i = 0; i < 3; i++) {
            System.out.print("Siguiente " + i + ": " );
            for (int j = 0; j < 100; j++) {
                if(j == 10){
                    break;  // Si la condicion es true el break salta y termina el ciclo
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Ciclo Completado!");
    }
    public void getContinue(){
        for (int i = 0; i < 10; i++) {
            if(i == 5) {
                continue;   // Saltar a la siguiente iteracion
            }
            System.out.println(i);
        }
    }
}
