/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CiclosCondicionales.CiCon;

/**
 *
 * @author Tomas
 */
public class CondicionalElseIf {
    String colorLuz = "Rosa";
    
    public String getElseIf(){
        if (colorLuz.equals("Verde")) {
            return "Puede continuar";   
        }else if (colorLuz.equals("Amarillo")) {
            return "Alto Parcial";
        }else if (colorLuz.equals("Verde")){
            return "Alto Total";
        }else{
            return "Color Incorrecto";
        }
    }
}
