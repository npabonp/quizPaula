
package practicando;

public class Practicando {

   
     
    public static void main(String[] args) {
    Wheels [] rear= new Wheels[2];
    rear [0]=new Wheels("aaaaa");
    rear [1]=new Wheels("bbbbbb");
     Wheels [] front= new Wheels[2];
    front [0]=new Wheels(" cccccc");
    front [1]=new Wheels("dddddd");
      Car c1=new Car(rear, front);
           c1.imprimir();
    
    } 
}
