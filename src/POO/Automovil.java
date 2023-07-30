/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author Tomas
 */
public class Automovil {
    String marca;
    String color;
    String placa;
    
    public Automovil() {
        this.marca = "";
        this.color = "";
        this.placa = "";
    }
    
    public Automovil(String marca, String color, String placa) {
        this.marca = marca;
        this.color = color;
        this.placa = placa;
    }
    
    public String ObtenerInfo() {
        return "Marca: " + marca + ", Color: " + color + ", Placa: " + placa;
    }
}

// Clase Derivada (subclase)
class Carro extends Automovil {
    int acelerar;
    Carro(String marca, String color, String placa, int acelerar) {
        super(marca, color, placa);
        this.acelerar = acelerar;
    }
// Sobrecarga del metodo ObtenerInfo() en la clase Coche
     String ObtenerInfo(boolean incluirAceleracion) {
        if (incluirAceleracion) {
            return "Carro - " + super.ObtenerInfo() + ", Acelerar: " + acelerar;
        } else {
            return "Carro - " + super.ObtenerInfo();
        }
    }
}

