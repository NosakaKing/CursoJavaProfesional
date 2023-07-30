/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiposdatos;

import java.text.DecimalFormat;

/**
 *
 * @author Tomas
 */
public class Variables {
    int versionJava = 9;     
    float versionEspecifica = 9.8f;
    
    char letra = 'a';
    char numero = 64;
     boolean valor = true;
     boolean valor2 = false;
     
     public String getVersionJava() {
         float pepe = versionJava * versionEspecifica;
         DecimalFormat decimalFormat = new DecimalFormat ("#.00");
         String numeroFormateado = decimalFormat.format(pepe);
         return numeroFormateado;
     }
}

