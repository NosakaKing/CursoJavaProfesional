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

    public static void main(String[] args) {
        CondicionalIf ci = new CondicionalIf();
        CondicionalElseIf ce = new CondicionalElseIf();
        CondicionesAnidadas ca = new CondicionesAnidadas();
        CondicionalSwitch cs = new CondicionalSwitch();
        CicloWhile cw = new CicloWhile();
        CicloDoWhile cd = new CicloDoWhile();
        CicloFor cf = new CicloFor();
        BreakAndContinue bc = new BreakAndContinue();
        UnicaSentencia us = new UnicaSentencia();

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

        // Ciclo For
        System.out.println("Tabla del 9");
        cf.getFor();

        // Ciclo For2
        System.out.println("Ciclo For2");
        cf.getFor2();
        
        //Break
        System.out.println("Break Usos");
        bc.getBreakC();
        
        //Continue
        System.out.println("Continue");
        bc.getContinue();
        
        //Unica sentencia
        System.out.println("Unica Sentencia");
        us.getUs();
    }
}
