/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicando;

/**
 *
 * @author Estudiante
 * clase main
 */
public class Practicando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Persona p1=new Persona ("jenny",17, "gerente");
       Club c =new Club("clublibros");
    c.gerente=p1;
    c.imprimir_gerente();    
    }
    }
