package Moduls.fileHandling;

import java.io.FileWriter;

public class fileTest {

    public static void main(String[] args) {
        
        try{
            FileWriter file=new FileWriter("Example.txt");
            file.write("Hello ,Kela Kha Lo");
            file.close();
        }catch(Exception e){

            System.out.println("I got Expeption");
        }
        

    }
    
}
