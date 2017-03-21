/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUIZPAULA;

/**
 *
 * @author jeisson
 */
public class Local {

    private Venta[] ventas = new Venta[20];
    private int numVentas = 0;

    public void registrarVenta(Venta v) {
        this.ventas[numVentas] = v;
        numVentas++;
    }

    public static void main(String[] args) {
        Local tiaMargarita = new Local();
        Producto[] papitas = new Producto[3];
        papitas[0] = new Producto(123, 1200, "papas de limon");
        papitas[1] = new Producto(222, 1200, "papas de pollo");
        papitas[2] = new Producto(124, 1200, "papas de tomate");
       int [] cantidad=new int [3];
       cantidad [0]=2;
       cantidad [1]=1;
       cantidad [2]=1;

            Venta v1 = new Venta(papitas, "marzo 28", cantidad);

        
        tiaMargarita.registrarVenta(v1);
        v1.ImpFactura();
    }

    public double TVentas() {
        double Tventas = 0;
        for (int i = 0; i < numVentas; i++) {
            Tventas += this.ventas[i].TotalVenta();
        }
        return Tventas;

    }
}
