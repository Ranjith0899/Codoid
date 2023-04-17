package task.one;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class File_Reader {
	public static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		
	System.out.println("Enter a file location. Example: C:\\Users\\ELCOT\\Desktop\\New Text Document.txt ");
	String file_Name = s.nextLine();
    File f = new File(file_Name);
     try {
    	 // using getName Method from File and printing in console
    	 
    	 System.out.println("File Name : "+ f.getName());
    	 
         // FileReader object to read a file
         FileReader file_Reader = new FileReader(f);
        
         // BufferedReader object to read line by line
         BufferedReader buffered_Reader = new BufferedReader(file_Reader);

         String line;
         while ((line = buffered_Reader.readLine()) != null) {
             System.out.println(line); // Print each line to console
         }

         // Closing the BufferedReader and FileReader
         buffered_Reader.close();
         file_Reader.close();
     } catch (IOException e) {
         e.printStackTrace();
     }
}}
