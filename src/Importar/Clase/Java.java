/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Importar.Clase;

/**
 *
 * @author Tomas
 */
public class Java {
    private final String titulo;
    public Java () {
        this.titulo = "Curso profesional de Java";
    }
    // Si esta en otro paquete no se puede usar getTitulo (Protected) igual pasa con default
     public String getTitulo () {
        return this.titulo;
    }
}
