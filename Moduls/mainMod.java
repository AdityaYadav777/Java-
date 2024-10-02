package Moduls;

import java.util.ArrayList;
import java.util.List;

public class mainMod {

    public static void main(String[] args) {
        
        mod1 v1=new mod1();
        v1.kela();


        ArrayList a=new ArrayList();
        a.add("Kela");
        Boolean f=  a.contains("Kela");
        

        System.out.println(a);
        System.out.println(f);


    }
    
}
