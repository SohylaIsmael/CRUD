# CRUD
  package com.mycompany.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Read {
    public static void read() throws FileNotFoundException, IOException {
        System.out.println("your username & password have been set successfully");
        
        String line1, line2;
        BufferedReader reader = new BufferedReader(new FileReader("abc.txt"));
        line1= reader.readLine();
        line2= reader.readLine();

        System.out.println("username= "+line1);
        System.out.println("password= "+line2); //I've printed them to copy/paste name&password
        
        logging(line1, line2);
    }
         public static void logging(String name, String pswrd){
        Scanner in = new Scanner(System.in);
        Scanner put = new Scanner(System.in);
        String a, b;
             System.out.println("now sign in:");
        System.out.println("enter name");
            a= in.next();
        System.out.println("enter password");
            b= put.next();
        if(name.equals(a) && pswrd.equals(b) ) 
            System.out.println("signed in successfully");
        else
            System.out.println("failed");
    }
}
