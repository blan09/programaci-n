/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg18;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw10
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
        static int n1 = 1;
        static int n2 = 1;
        static int n3 = 0;
        static int contador = 2;
        static String serie = n1 + " " + n2 + " ";
    
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
      
        int nroFinal = Integer.parseInt(JOptionPane.showInputDialog(null,"¿Cuántos námeros quieres de la serie Fibonacci?"));
        
        while(contador < nroFinal);
        
        {
            n3 = n1 + n2;
            serie = serie + n3 + " ";
            contador = contador + 1;
            n1 = n2;
            n2 = n3;
            
        }
    
            JOptionPane.showMessageDialog(null,"serie");
    
    }
    
}
