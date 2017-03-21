/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicando;

public class Engine {
   private Wheels [] axle;
   private String nombree; 

    public Engine(Wheels[] axle, String nombree) {
        this.axle = axle;
        this.nombree = nombree;
    }
   
    public Engine(String nombree) {
        this.nombree = nombree;
    }

    public String getNombree() {
        return nombree;
    }

    public void setNombree(String nombree) {
        this.nombree = nombree;
    }
   public void setAxle(Wheels[] rear) {
        this.axle = rear;
         rear[0].setM(this);
         rear[1].setM(this);
    }
}
