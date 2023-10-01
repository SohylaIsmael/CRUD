# CRUD
  package com.mycompany.test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Write {
    public static void write(){
        Scanner in= new Scanner(System.in);
        Scanner put= new Scanner(System.in);
        String name, pass;
        System.out.println("set your username: ");
        name= in.nextLine();
        System.out.println("set your password: ");
        pass= put.nextLine();
        try (FileWriter fr = new FileWriter("abc.txt")) {
            fr.write(name);
            fr.write("\n");
            fr.write(pass);
            
        fr.close();
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
         }
}
