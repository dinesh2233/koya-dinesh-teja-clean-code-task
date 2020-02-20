
 package com.mycompany.interest;
import java.io.*;
import java.util.*;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.FileDescriptor;
import java.lang.Math;
public class simple_compound_interest {
    public static void compute_interest(){
    PrintStream output =  new PrintStream(new FileOutputStream(FileDescriptor.out));
    Scanner read =new Scanner(System.in);
    output.print("enter time period");
    double time = read.nextFloat();
    output.print("Enter Prinicpal amount:");
    double principal_amount = read.nextFloat();
    output.print("Enter rate of interest:");
    double rate_of_interest = read.nextFloat();
    double simple_interest = time * principal_amount * rate_of_interest / 100;
    double compound_interest = principal_amount * Math.pow(1 + (rate_of_interest / 100) , time) - principal_amount;
    output.print("Simple Interest is "+ simple_interest+"\n");
    output.print("Compound Interest is "+ compound_interest+"\n");
    output.print("---------------------------------------------------------------------------\n");
    }
    public static void compute_construction_cost()
    {
        Scanner read = new Scanner(System.in);
        
        double rate = 0;
        PrintStream output =  new PrintStream(new FileOutputStream(FileDescriptor.out));
        output.print("Options in materials\n1 for standard materials\n2 for above standard materials\n3 for high standard materials\n4 for high standard materials and fully automated home");
        output.print("\nEnter choice from the above options:");
        int material = read.nextInt();
        switch(material)
        {
            case 1: rate = 1200; break;
            case 2: rate = 1500; break;
            case 3: rate = 1800; break;
            case 4: rate = 2500; break;
        }
        output.print("Enter area of the house in square feet:");
         double area = read.nextDouble();
        output.print("\nThe estimated cost of house is "+(rate*area));
        
    }
     
   
    
}
