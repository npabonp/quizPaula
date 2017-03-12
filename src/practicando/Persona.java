/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicando;

/**
 *
 * @author Estudiante
 */

  /**
esta es la clase persona
*/
public class Persona {
   private  String nombre; 
   private int Edad;
   private String cargo;

   /**
este metodo es el constructor con
* @param nombre jdjd
* @param Edad jhdjiu
* @param cargo jshd
*/
    public Persona(String nombre, int Edad, String cargo) {
        this.nombre = nombre;
        this.Edad = Edad;
        this.cargo = cargo;
    }

    /**
este metodo es el getnombre
*/
    public String getNombre() {
        return nombre;
    }

    /**
este metodo es el getedad
*/
    public int getEdad() {
        return Edad;
    }

      /**
este metodo es el getcargo
*/
    public String getCargo() {
        return cargo;
    }
  /**
este metodo es el setnombre
*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  /**
este metodo es el setedad
*/
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
  /**
este metodo es el setcargo
*/
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
