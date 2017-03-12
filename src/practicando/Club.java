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
esta es la clase club
*/
public class Club {
    private String nombre;
    public Persona gerente;
/**
este metodo es el constructor
*/
    public Club(String nombre) {
        this.nombre = nombre;
    }
/**
este metodo es el get,para obtener informacion
*/
    public String getNombre() {
        return nombre;
    }
/**
este metodo es el set,para cambiar informacion
* @param nombre indica el nombre que va a tener el objeto
*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
*este metodo es para imprimir informacion informacion
*/
void imprimir_gerente(){
System.out.println("la gerente es ="+this.gerente.getNombre());
System.out.println("la gerente tiene " +this.gerente.getEdad()+" años");

}
}
