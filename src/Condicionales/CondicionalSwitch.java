/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionales;

/**
 *
 * @author Tomas
 */
public class CondicionalSwitch {

    String colorLuz = "Rosa";
    String tipoDia = "";
    String diaSemana = "Jueves";

    public String getSwitch() {
        switch (colorLuz) {
            case "Verde":
                return "Puede continuar";
            case "Amarillo":
                return "Alto Parcial";
            case "Rojo":
                return "Alto Total";
            default:
                return "color no valido";
        }
    }

    public String getSwitch2() {
        switch (diaSemana.toLowerCase()) {
            case "lunes":
                tipoDia = "Inicio de Semana";
                break;
            case "martes":
            case "miercoles":
            case "jueves":
                tipoDia = "Mediados de Semana";
                break;
            case "viernes":
                tipoDia = "Inicio de fin de Semana";
                break;
            case "sabado":
            case "domingo":
                tipoDia = "Fin de Semana";
                break;
        }
        return (diaSemana + " es " + tipoDia);
    }
}
