/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client_application;
import com.mycompany.interest.*;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 *
 * @author ASUS
 */
public class client {
    public static void main(String args[]){
        PrintStream output =  new PrintStream(new FileOutputStream(FileDescriptor.out));
        output.print("This is interest computation\n");
    com.mycompany.interest.simple_compound_interest.compute_interest();
    output.print("This is estimated cost of house  oomputation\n");
    com.mycompany.interest.simple_compound_interest.compute_construction_cost();
    
    }
}
