package DSA;

import java.util.LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinedList {

    public static void main(String[] args) {

        Node head;

        Node a1 = new Node(1);
        Node a2 = new Node(2);
        Node a3 = new Node(3);

        a1.next = a2;
        a2.next = a3;
        a3.next = null;

        

        Node b1= new Node(4);
        Node b2= new Node(5);
        Node b3= new Node(6);
             
        b1.next=b2;
        b2.next=b3;
        b3.next=null;
             
        head=a1;
         
        while(head.next!=null){
            head=head.next;
        }
       
        head.next=b1;


        


        Ghomo(a1);
    }

    public static void Ghomo(Node T) {
        while (T != null) {
            System.out.println(T.data);
            T = T.next;
        }
    }
}
