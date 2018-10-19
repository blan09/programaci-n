/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author BLANCA
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      // TODO code application logic here
     String centigrados = javax.swing.JOptionPane.showInputDialog(null, "introduce grados centigrados");
      int centigradosnumero = Integer.parseInt(centigrados);
      
      double gradosF = (1.8*centigradosnumero+32);
      
       
      javax.swing.JOptionPane.showMessageDialog(null,gradosF);
      javax.swing.JOptionPane.showInputDialog(null,centigrados + "ºC son" + gradosF + "grados fahrenheit");
       
        
    }
    
}
