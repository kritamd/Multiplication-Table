/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kritam.MultiplicationTable;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(true){
        System.out.println("Enter Multiplication Table");
        int num=input.nextInt();
        for(int i=1;i<=10;i++){
        
            System.out.println(num+"*"+i+"="+(num*i));
        }
      
          System.out.println("Do You want To Continue [y/n]");
          String choice=input.next();
          if (choice.equalsIgnoreCase("n")){
                  
                  System.exit(0);
                  
          }
        }
          
          }
        
        
        
        
        
        
        
        
    }

}