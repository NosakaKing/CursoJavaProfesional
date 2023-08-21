/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

/**
 *
 * @author Tomas
 */
public class Cadenas {

    // String = Clase
    // Dos maneras de declarar una variable de tipo Cadena (String)
    String msj = "Hola, soy un String";
    String msj2 = new String("Texto");
    int cantidad;

    //Metodos para cadenas 
    public int getLongitud() {
        cantidad = msj.length();   // Cuenta los caracteres y espacios
        return cantidad;
    }

    public boolean getContains() {
        boolean contiene = msj.contains("hola");  // Contiene el texto se puede buscar por caracteres o la plabara completa
        return contiene;
    }

    public boolean getInicia() {
        boolean inicia = msj.startsWith("Hola");  // Inican en
        return inicia;
    }

    public boolean getFinal() {
        boolean finaliza = msj.endsWith("String"); // Finaliza en
        return finaliza;
    }

    public void getLenght() {
        String mensaje = "Hola Mundo";
        System.out.println(mensaje.length());
    }

    public void getChar() {
        String mensaje = "Hola Mundo";
        char lentraH = mensaje.charAt(3);
        System.out.println(lentraH);
    }

    public void getIndexOf() {
        String mensaje = "Hola Mundo";
        int indice = mensaje.indexOf("M");    //Para buscar en que posicion de encuentra busca de izquierda a derecha
        System.out.println(indice);
    }

    public void getILastndexOf() {
        String mensaje = "Hola Mundo";
        int indice = mensaje.lastIndexOf("M");    //Para buscar en que posicion de encuentra busca derecha a izquierda
        System.out.println(indice);
    }

    public void getBusqueda() {
        String msj = "Este mensaje posee muchas letras a";
        int indicePrimerA = msj.indexOf("a");
        int indiceSegundaA = msj.indexOf("a", indicePrimerA + 1);
        int indiceTerceraA = msj.indexOf("a", indiceSegundaA + 1);
        System.out.println("Indice de la primera 'a': " + indicePrimerA);
        System.out.println("Indice de la segunda 'a': " + indiceSegundaA);
        System.out.println("Indice de la segunda 'a': " + indiceTerceraA);

    }

    public void getsubStringInicial() {
        String mensaje = "Hola Mundo Pelagato";
        int indiceLetraP = mensaje.indexOf("P");
        // String.substring(indiceInicial) retorna un sub String a partir del índice indicado hasta el último carácter del String.
        String subString = mensaje.substring(indiceLetraP);
        System.out.println(subString);
    }

    public void getsubStringFinal() {
        // String.substring(indiceInicial, indiceFinal) retornar un sub String a partir del índice indicado hasta el índice final.
        String mensaje = "Hola Mundo";
        int indiceLetraM = mensaje.indexOf("M");

        String subString = mensaje.substring(indiceLetraM, indiceLetraM + 3);
        System.out.println(subString);
    }
    // Uso del concat String union = msj.concat( " ,bye");
}
