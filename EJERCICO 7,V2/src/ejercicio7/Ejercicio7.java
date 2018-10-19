/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author 1gdaw10
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String cateto1= javax.swing.JOptionPane.showInputDialog("cateto1");
        int cateto1nu = Integer.parseInt(cateto1);
        String cateto2= javax.swing.JOptionPane.showInputDialog("cateto2");
         int cateto2nu = Integer.parseInt(cateto2);
      double hipotenusa = Math.sqrt(Math.pow(cateto1nu,2)+Math.pow(cateto2nu,2));
      System.out.println("la hipotenusa es:" + hipotenusa);
    }
    
}
