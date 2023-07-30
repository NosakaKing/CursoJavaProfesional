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
    String msj2 = new String ("Texto");
    int cantidad;
    
    //Metodos para cadenas 
    public int getLongitud (){
        cantidad = msj.length();   // Cuenta los caracteres y espacios
        return cantidad;
    }
     public boolean getContains (){
       boolean contiene =  msj.contains("hola");  // Contiene el texto se puede buscar por caracteres o la plabara completa
        return contiene;
    }
     public boolean getInicia (){
       boolean inicia = msj.startsWith("Hola");  // Inican en
        return inicia;
    }
       public boolean getFinal (){
       boolean finaliza = msj.endsWith("String"); // Finaliza en
        return finaliza;
    }
       // Uso del concat String union = msj.concat( " ,bye");
}
