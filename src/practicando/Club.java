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
public class Club {
    private String nombre;
    public Persona gerente;

    public Club(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
void imprimir_gerente(){
System.out.println("la gerente es ="+this.gerente.getNombre());
System.out.println("la gerente tiene " +this.gerente.getEdad()+" años");

}
}
