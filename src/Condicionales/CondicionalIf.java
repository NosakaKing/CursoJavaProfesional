/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionales;

/**
 *
 * @author Tomas
 */
public class CondicionalIf {

    String colorLuz = "Verde";

    public String getIf() {
        if (colorLuz.equals("Azul")) {
            return "Puede continuar";
        } else {
            return "Alto Total";
        }
    }
}
