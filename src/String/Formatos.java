/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

/**
 *
 * @author Tomas
 */
public class Formatos {
    String msj = "    Hola, soy un String";
    
    // Metodos Formatos 2
    String mensaje = "";
    String curso = "Java";
    float valor = 3.141516f;
    float pi = 3.14159265359f;
    
    // Comprar Cadenas
    String cadena1  = "HOLA";
    String cadena2 = "hola";
    boolean re = cadena1.equalsIgnoreCase(cadena2);  // Dos formas de ignorar las mayusculas y minisculas en comparar dos String
    //boolean re = cadena1.toUpperCase().equals(cadena2.toUpperCase()); 
    
    public String getFormato (){
        // %.2f para decimales     // %d para enteros   // %s para String    // %b para booleano   // Orden usando %3$s - %2$s
        mensaje = String.format("El total de %d articulos es: %.2f %s",3 ,valor, "MX"); // %.2f (numero de decimales)
        return mensaje;
    }
     public String getFormato2 (){
        // %.2f para decimales     // %d para enteros   // %s para String    // %b para booleano   // Orden usando %3$s - %2$s
        String resultado = String.format("%1f - Decimales: %1$.2f", pi, pi);
        return resultado;
    }
}
