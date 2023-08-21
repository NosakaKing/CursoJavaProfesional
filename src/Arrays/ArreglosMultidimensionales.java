/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Tomas
 */
public class ArreglosMultidimensionales {
    // Arreglos dinamicos

    int calificaciones[][] = new int[5][];
   //  Arreglo de dos dimensiones, especificamos cauntas filas tendra pero no se sabe el numero de columnas 
    public void getCalificaciones() {
        calificaciones[0] = new int[1];
        calificaciones[1] = new int[2];
        calificaciones[2] = new int[3];
        calificaciones[3] = new int[4];
        calificaciones[4] = new int[5];

        calificaciones[0][0] = 8;

        calificaciones[1][0] = 9;
        calificaciones[1][1] = 10;

        calificaciones[2][0] = 10;
        calificaciones[2][1] = 10;
        calificaciones[2][2] = 10;

        calificaciones[3][0] = 10;
        calificaciones[3][1] = 10;
        calificaciones[3][2] = 10;
        calificaciones[3][3] = 10;

        calificaciones[4][0] = 9;
        calificaciones[4][1] = 9;
        calificaciones[4][2] = 10;
        calificaciones[4][3] = 10;
        calificaciones[4][4] = 10;
        // Array for each una alternativa al for normal
        /*for(int [] calificacionesPorAlumno : calificaciones){
          for(int calificacion : calificacionesPorAlumno){
              System.out.print(calificacion  + " ");
          }
            System.out.println("");
        } */
        for (int i = 0; i < calificaciones.length; i++) {
            int[] calificacionesPorAlumno = calificaciones[i];
            for (int j = 0; j < calificacionesPorAlumno.length; j++) {
                int calificacion = calificacionesPorAlumno[j];
                System.out.print(calificacion + " ");
            }
            System.out.println("");
        }
    }

}
