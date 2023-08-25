/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntradaDatos.OptionPane;

import javax.swing.JOptionPane;

/**
 *
 * @author Tomas
 */
public class Main {
    public static void main (String [] args) {
        // Siempre retorna en String el showInputDialog
        String nombre = JOptionPane.showInputDialog(null, "Cual es tu nombre");
        
        int edad = Integer.parseInt( JOptionPane.showInputDialog(null, "Cual es tu edad"));
        // Dar salida datos
        String msj = "Hola " + nombre + " con una edad de " + edad;
        JOptionPane.showMessageDialog(null, msj);
        
        
    }
}
