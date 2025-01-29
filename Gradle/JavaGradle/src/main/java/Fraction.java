import java.io.*;
/**
 * Purpose: demonstrate simple Java Fraction class with command line,
 * jdb debugging, and Ant build file.
 *
 * Ser321 Foundations of Distributed Applications
 * see http://pooh.poly.asu.edu/Ser321
 * @author Tim Lindquist Tim.Lindquist@asu.edu
 *         Software Engineering, CIDSE, IAFSE, ASU Poly
 * @version January 2020
 */
public class Fraction {

   private int numerator, denominator;

   public Fraction(){
      numerator = denominator = 0;
   }

   public void print() {
    System.out.print(numerator + "/" + denominator );
   }

   public void setNumerator (int n ){
      numerator = n;
   }

   public void setDenominator (int d) {
      denominator = d;
   }

   public int getDenominator() {
      return denominator;
   }

   public int getNumerator() {
      return numerator;
   }

   public static void main (String args[]) {
      try {
         // create a new instance
         // Fraction *frac = [[Fraction alloc] init];
         Fraction frac = new Fraction();
         int num = 1;
         int denom = 1;

         if (args.length > 0) {
            num = Integer.parseInt(args[0]);
         }

         if (args.length > 1) {
            denom = Integer.parseInt(args[1]);
         }

         if (denom == 0) {
            System.out.println("Denominator cannot be zero! Please input a valid number.");
            return;
         }

         frac.setNumerator(num);
         frac.setDenominator(denom);
         
         // print it
         System.out.print("The fraction is: ");
         frac.print();
         System.out.println("");

      }catch (NumberFormatException e) {
         System.out.println("Please input integers as arguments.");
      }
      catch(Exception e) {
         e.printStackTrace();
      }
   }
}

