# CRUD
  package com.mycompany.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Modify {
    
    static void modifyFile(String filepath, String oldstring, String newstring){
             File filetobeupdated= new File(filepath);
             String oldcontent= "";
             BufferedReader reader= null;
             FileWriter writer= null;
             try{
             reader= new BufferedReader(new FileReader(filetobeupdated));
             String line= reader.readLine();
             while(line != null){
             oldcontent= oldcontent + line + System.lineSeparator();
             line= reader.readLine();
             }
             String newcontent= oldcontent.replaceAll(oldstring, newstring);
             
             writer = new FileWriter(filetobeupdated);
             writer.write(newcontent);
             }catch(IOException e){
                 System.out.println(e);}
             finally{
             try{
             reader.close();
             writer.close();
             }catch(IOException e){
                 System.out.println(e);}
             }
         }
}
