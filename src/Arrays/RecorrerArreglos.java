/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Tomas
 */
public class RecorrerArreglos {
    int calificaciones[] = {9,8,7,10,10,9,8,8,10,9};
    int suma = 0;
    public void getRecorrerArreglos(){
        for (int i = 0; i < calificaciones.length ; i++) {
          //suma += calificaciones[i];
          suma =  suma + calificaciones[i];
        }
        float prom =  suma / calificaciones.length;
        System.out.println("La suma es de: " + suma  + " y su promedio es de: " + prom);
    }
}
