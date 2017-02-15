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
public class Persona {
   private  String nombre; 
   private int Edad;
   private String cargo;

    public Persona(String nombre, int Edad, String cargo) {
        this.nombre = nombre;
        this.Edad = Edad;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public String getCargo() {
        return cargo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
