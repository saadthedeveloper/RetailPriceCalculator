/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.retailpricecalculator;
import java.util.Scanner;
/**
 *
 * @author MKAY
 */
public class RetailPriceCalculator {

    public static void main(String[] args) {
        double wholesaleCost;
        double markupPercentage;
        double retailPrice;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the wholesale cost: ");
        wholesaleCost = keyboard.nextDouble();
        
        System.out.println("Enter the markeup percentage");
        markupPercentage = keyboard.nextDouble();
        
        retailPrice = calculateRetail(wholesaleCost, markupPercentage);
        
        System.out.printf("Retail cost is: %.2f", retailPrice);
        
        keyboard.close();
    }
    
   public static double calculateRetail(double wholesaleCost, double markeupPercentage)
    {
        double retailPrice = 0;
        
        retailPrice = wholesaleCost + (wholesaleCost * (markeupPercentage/100));
        
        return retailPrice;
    }
}
