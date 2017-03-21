/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicando;

import java.util.Arrays;

public class Car {
    private Wheels [] front;
    private Wheels []rear;
    private Engine m;

    public Car(Wheels[] front, Wheels[] rear) {
        this.front = front;
        this.rear = rear;
        this.m=new Engine(rear,"eeeeeee");
       this.m.setAxle(rear);
    }

    public Wheels[] getFront() {
        return front;
    }

    public void setFront(Wheels[] front) {
        this.front = front;
    }

    public Wheels[] getRear() {
        return rear;
    }

    public void setRear(Wheels[] rear) {
        this.rear = rear;
    }

    public Engine getM() {
        return m;
    }

    public void setM(Engine m) {
        this.m = m;
    }
    
    
    public void imprimir(){
    System.out.println("motor "+this.getM().getNombree()+" ");
        System.out.println("primera llanta " +front [0].getNombre()+" segunda llanta "+front[1].getNombre() );
        System.out.println(" tercera  llanta "+rear [0].getNombre()+" cuarta llanta "+rear[1].getNombre());   
    }
    
    
    
}
