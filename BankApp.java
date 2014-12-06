/**
 * Sample code to demonstrate input and output using Scanner, for loop, if,  if/else statement
 * 
 *	
 * @author Alan Cowap
 * @version 1.0 
 * 
 * 
 * 
 */
 
//package com.alancowap.itt.sample;

import java.util.Scanner;

public class BankApp {
    public static final double DIRT = 0.41;
    
    public static void main(String[] args){
        System.out.println("Welcome to IT Bank");
        Scanner in = new Scanner(System.in);
        
        // Get number of customers
        System.out.println("How many customers?");
        int numCust = in.nextInt();
        
        // Loop through all customers
        for(int i=0; i < numCust; ++i){
            System.out.println("Name:" + i);
            String custName;// = "Joe Doe";
            custName = in.next();
            System.out.println("How many years is " + custName + "investing for?");
            int investPeriod = in.nextInt();
            System.out.println("Investment Amount in Euro");
            int investAmount = in.nextInt();
            
            //determine interest rate
            double interestRate = 0.02;
            if(investPeriod == 2 || investPeriod ==3)
                interestRate = 0.04;
            else if(investPeriod > 3)
                interestRate = 0.06;
            
            //calculate gross interest
            double grossInterest = investAmount * interestRate;
            //calculate DIRT
            double dirtDue = grossInterest * DIRT;
            //calculate net interest 
            double netInterest = grossInterest - dirtDue;
            //check for bonus
            int bonus = 0;
            if (investAmount > 4999)
                bonus = 50;
            //calculate final value of investment
            double finalValue = investAmount + netInterest + bonus;
            //Output values to Console
            System.out.println("Gross interst " + grossInterest);
            System.out.println("DIRT due " + dirtDue);
            System.out.println("Net interest " + netInterest);
            System.out.println("Bonus of " + bonus);
            System.out.println("Investment worth " + finalValue);
            System.out.println("Thank you");            
        }           
    }
}
