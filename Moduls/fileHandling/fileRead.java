package Moduls.fileHandling;

import java.io.File;
import java.util.Scanner;

public class fileRead {

    public static void main(String[] args) {
        
        try
        {
            

            File file=new File( "Example.text");
            Scanner sc=new Scanner(file);
            while (sc.hasNextLine()) {
                String a=sc.nextLine();
                System.out.println(a);
                

            }
            

        }catch(Exception e){

            

        }
       

    }
    
}
