/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumardosnunmeros;

import javax.swing.JOptionPane;

/**
 *
 * @author libanielvargasjp
 */
public class Sumardosnunmeros {
public static void main( String args[] )
   {
      String strNumero1;
      String strNumero2;
      int intNumero1;   
      int intNumero2;   
      int suma;
      strNumero1 = JOptionPane.showInputDialog( "Ingrese el entero 1" );
      strNumero2 = JOptionPane.showInputDialog( "Ingrese el entero 2" );
      intNumero1 = Integer.parseInt( strNumero1 );
      intNumero2 = Integer.parseInt( strNumero2 );

      suma = intNumero1 + intNumero2;

      JOptionPane.showMessageDialog(
         null, "La suma es " + suma, "Resultado,",
         JOptionPane.PLAIN_MESSAGE );
     System.exit( 0 );  
  } 
    
}



