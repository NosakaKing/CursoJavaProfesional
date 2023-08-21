/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.ClasesAbstractas;

/**
 *
 * @author Tomas
 */
public abstract class Figura {
    //Metodo que define como hacer pero no como
    private int numeroLados;
    
    public Figura() {     
        this.numeroLados = 0;
    }
   // public void setNumeroLados(int numeroLados){     // Usamos la variable privada 
        //this.numeroLados = numeroLados;
    // } 
    public abstract float area(); // Posee un metodo abstracto 
         
}
