/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

public class Main {
    public static void main (String [] args) {
        Cadenas cd = new Cadenas();
        Formatos fm = new Formatos();
        System.out.println(cd.msj);
        System.out.println(cd.msj2);
        // Metodos para cadenas
        System.out.println("Metodos para cadenas");
        System.out.println(cd.getLongitud() + " caracteres");
        System.out.println(cd.getContains());
        System.out.println(cd.getInicia());
        System.out.println(cd.getFinal());
        cd.getLenght();
        cd.getChar();
        cd.getIndexOf();
        cd.getILastndexOf();
        cd.getBusqueda();
        cd.getsubStringInicial();
        cd.getsubStringFinal();
        
        // Metodos de Formato
        System.out.println("Metodos Formatos");
        System.out.println(fm.msj.toUpperCase());  //Texto en Mayuscula
        System.out.println(fm.msj.toLowerCase());  //Texto en Minuscula
        System.out.println(fm.msj.trim());   // Elimina los espacios en blanco
        
        // Metodos Formatos 2
        System.out.println(fm.getFormato());
        //System.out.printf("El total de %d articulos es: %.2f %s",3 ,fm.valor, "MX"); Imprimir directamente en format
        
        System.out.println(fm.getFormato2());
        
        // Comparar cadenas (String)
        System.out.println("Comparar cadenas (String)");
        System.out.println(fm.re);
    }
}
