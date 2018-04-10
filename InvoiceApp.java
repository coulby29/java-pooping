
/**
 * Write a description of class InvoiceApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class InvoiceApp
{
   public static void main(String[] args) {
       System.out.println("Welcome to the Invoice Total Calculator");
       System.out.println(); // print a blank line
       
       Scanner sc = new Scanner(System.in);
       
       // Perform invoice calculations until choice is not equal to Y
       String choice = "y";
       while (choice.equalsIgnoreCase("y")) {
           // Get the invoice subtotal from the user
           System.out.println("Enter subtotal:   ");
           double subtotal = sc.nextDouble();
           
           //Get the discount percent
           double discountPercent;
           if (subtotal >= 200) {
               discountPercent = .2;
            } else if (subtotal >= 100) {
                discountPercent = .1;
            } else {
                discountPercent = 0.0;
            }
            // Calculate the discount amount and total
            double discountAmount = subtotal * discountPercent;
            double total = subtotal - discountAmount;
            // Display the results
            String message = "Discount percent: " + discountPercent + "\n"
                           + "Discount amount:  " + discountAmount  + "\n"
                           + "Invoice total:    " + total + "\n";
            System.out.println(message);
            
            //See if the user wants to continue
            System.out.println("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
           
        }
    }
    }

