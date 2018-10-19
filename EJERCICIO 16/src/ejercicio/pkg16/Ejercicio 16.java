/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg16;

import javax.swing.JOptionPane;

/**
 *
 * @author BLANCA
 */
public class EJERCICIO16 {

    /**
     * @param args the command line arguments
     */
          static int contador = 0;
          static int sumaEdades = 0;
          static String respuesta ="";
        
    public static void main(String[] args) {
        
        // TODO code application logic here
         
        do
        { 
                int edad = Integer.parseInt(JOptionPane.showInputDialog(null,"teclea una edad"));
                contador = contador + 1;
                sumaEdades = sumaEdades + edad;
            
                do
                {
                   respuesta = JOptionPane.showInputDialog(null,"¿Quieres continuar?");
                }
                while (respuesta.equalsIgnoreCase("si") == false && respuesta.equalsIgnoreCase("no") == false);
                
        }
         while (respuesta.equalsIgnoreCase("si"));
         JOptionPane.showMessageDialog(null,"la media de edades es" + sumaEdades/contador);
            
        }
   
    
}
