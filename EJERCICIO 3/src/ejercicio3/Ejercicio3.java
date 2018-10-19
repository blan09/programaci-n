/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author BLANCA
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String diagonal1= javax.swing.JOptionPane.showInputDialog("diagonal1");
        int diagonal1nu = Integer.parseInt(diagonal1);
        String diagonal2= javax.swing.JOptionPane.showInputDialog("diagonal2");
        int diagonal2nu = Integer.parseInt(diagonal2);
        
        int area = ((diagonal1nu*diagonal2nu)/2);
     
        javax.swing.JOptionPane.showMessageDialog(null,area);
     
        
        
    }
    
}
