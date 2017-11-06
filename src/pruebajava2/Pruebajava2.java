
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 case 7://Caso 1 si el valor es 7
            JOptionPane.showMessageDialog(null,"NOTABLE");
        break;
    
        case 6://Caso 2 si el valor es 6
            JOptionPane.showMessageDialog(null,"BIEN");
        break;* and open the template in the editor.
 */
package pruebajava2;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB08
 */
public class Pruebajava2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
   int letra = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una letra"));
   switch(letra)//Se recibe la letra de los meses del año        
   {
       case 1:// Letra del mes
      JOptionPane.showMessageDialog(null,"ENERO" );   
         break;
         
        case 2://Nombre del mes
        JOptionPane.showMessageDialog(null,"FEBRERO");
        break;
               
       case 3://
           JOptionPane.showMessageDialog(null,"MARZO");
       case 4:
       JOptionPane.showMessageDialog(null,"ABRIL");
        break;
        
        case 5:
            JOptionPane.showMessageDialog(null,"MAYO");
        break;

case 6:
       JOptionPane.showMessageDialog(null,"JUNIO");
        break;
        
      
case 7:
      JOptionPane.showMessageDialog(null,"JULIO");
     break;
      
case 8:
       JOptionPane.showMessageDialog(null,"AGOSTO");
       
                    
case  9:// Letra del mes
      JOptionPane.showMessageDialog(null,"SEPTIEMBRE" );   
         break;
         
        case 10://Nombre del mes
        JOptionPane.showMessageDialog(null,"OCTUBRE");
       break;
                                 
        case 11:
      JOptionPane.showMessageDialog(null,"NOVIEMBRE" );   
         break;
         
        case 12://Nombre del mes
        JOptionPane.showMessageDialog(null,"DICIEMBRE");
       break;
                
     


        default:
   }
    }
}