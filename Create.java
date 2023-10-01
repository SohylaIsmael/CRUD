# CRUD
package com.mycompany.test;

import static com.mycompany.test.Clear.cleardata;
import static com.mycompany.test.Modify.modifyFile;
import static com.mycompany.test.Read.read;
import static com.mycompany.test.Write.write;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws IOException {
       
        // CREATE
       File f= new File("abc.txt");
        f.createNewFile();
        System.out.println("does file exists? "+f.exists());//file created
        if(f.exists()){
            System.out.println("absolute path= "+f.getAbsolutePath());
            System.out.println("could file be excuted? "+f.canExecute());}
        
        //READ & WRITE
        write();
        read();
      
        // UPDATE
        Scanner in= new Scanner(System.in);
        Scanner put= new Scanner(System.in);
        String inp, ut;
        System.out.println("to change your password/username enter your old one:");
        inp= in.nextLine();
        System.out.println("enter the new password/username:");
        ut= in.nextLine();
        modifyFile("abc.txt", inp, ut);
      
        // DELETE
        cleardata();
      
        // to test the UPDATE method, you can comment the DELETE method and check the file after the doing the process of replacement
    }
}
