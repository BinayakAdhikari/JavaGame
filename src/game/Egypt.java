/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Scanner;

/**
 *
 * @author blaze
 */
public class Egypt {
    
   
    
       public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      Pyramid Luxor = new Pyramid();
      double W, H;
      System.out.println("Enter Luxor's width:");
      W = in.nextDouble();
      System.out.println("Enter Luxor's height:");
      H = in.nextDouble();

      Luxor.SetWidthHeight(W, H);
      System.out.println("Luxor has volume of " + Luxor.GetVolume());
   }

    public static class Pyramid {
        
        double Width, Height;
        

        public Pyramid() {
              
        }

        private void SetWidthHeight(double W, double H) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String GetVolume() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
   

    
}
