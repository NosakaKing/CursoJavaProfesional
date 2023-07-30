/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionales;

/**
 *
 * @author Tomas
 */
public class CondicionesAnidadas {
    // El promedio minimo para aprobar es de 7.
    // Si el promedio es diez = Muchas felicidades
    // Si el promedio es aprobatorio pero menor a diez = Felicidades
    // Si el promedio no es aprobatorio = Es necesario repasar bloques
    // Scope o Alcance si una variable esta en un if solo se puede usar en ese bloque
    int promedio = 10;

    public String getProm() {
        if (promedio >= 7 && promedio <= 10) {
            if (promedio == 10) {
                return "Muchas Felicidades";
            } else {
                return "Felicidades";
            }
        } else {
            return "Es necesario repasar bloques";
        }
    }
}
