package DSA;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.BinaryOperator;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=next;
    }
}


public class linkedList {


    public static void main(String[] args) {
               
                    
        Node a=new Node(1);
        Node b=new Node(2);

        Node c=new Node(3);
        Node d=new Node(3);


        a.next=b;
        c.next=d;


        Node curr=a;

        while(curr.next!=null){
            curr=curr.next;
        }

        curr.next=c;

        Node t=a;

        while(t.next!=null){
            if (t.data==a.next.data) {
               t.next=t.next.next;
            }
            t=t.next;
        }



        while (a!=null) {
            System.out.println(a.data);
            a=a.next;
            
        }


           BigDecimal number = new BigDecimal(3.14159/2);
        BigDecimal truncatedNumber = number.setScale(2, RoundingMode.DOWN);
        System.out.println(truncatedNumber); // Out

        System.out.println(Integer.parseInt("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", 3) );

        
        
   
         String f=Integer.toBinaryString( 2);
           
    

    }
    
}
