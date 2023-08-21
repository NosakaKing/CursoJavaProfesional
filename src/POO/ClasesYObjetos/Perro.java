/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO.ClasesYObjetos;

/**
 *
 * @author Tomas
 */
public class Perro {
   
    String nombre;
    String raza;
    int edad;
    
    // Parametros con el mismo atributo (Variables ) trabjamos con el this en caso contrario paramero igual a parametro
    void establecerAtributos(String nombre, String raza, int edad){
        this.nombre = nombre;    // Uso del this
        this.raza = raza;
        this.edad = edad;
        // edadPerro = Edad;
    }
    void comer(){    //Metodos   void no retorna nada
        System.out.println("El perro se encuentra comiendo!");
    }
     void dormir(){    //Metodos   void no retorna nada
        System.out.println("El perro se encuentra durmiendo!");
    }
      void ladrar(){    //Metodos   void no retorna nada
        System.out.println("El perro se encuentra ladrando!");
    }
}
