# CRUD
  package com.mycompany.test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Clear {
    public static void cleardata(){
        try{
        FileWriter fw= new FileWriter("abc.txt", false);
        PrintWriter pw= new PrintWriter(fw, false);
        pw.flush();
        pw.close();
        fw.close();
          }catch(IOException e){
            System.out.println(e);
        }
        }
}
