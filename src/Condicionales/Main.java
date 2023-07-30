/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionales;

/**
 *
 * @author Tomas
 */
public class Main {
    public static void main (String [] args) {
    CondicionalIf ci = new CondicionalIf();
    CondicionalElseIf ce = new CondicionalElseIf ();
    CondicionesAnidadas ca = new CondicionesAnidadas();
    CondicionalSwitch cs = new CondicionalSwitch();
    CicloWhile cw = new CicloWhile();
    CicloDoWhile cd = new CicloDoWhile();
    
    // If
        System.out.println("If");
        System.out.println(ci.getIf());
    // Else if
        System.out.println("ElseIf");
        System.out.println(ce.getElseIf());
        
    // Condiciones Anidadas
        System.out.println("Condiciones Anidadas");
        System.out.println(ca.getProm());
        
    // Switch
        System.out.println("Uso del Swtich");
        System.out.println(cs.getSwitch());
        
        System.out.println(cs.getSwitch2());
    // Ciclo While
        System.out.println(cw.getHolaMundo());
        
    // Ciclo DoWhile
        cd.getDoWhile();
    }
}
