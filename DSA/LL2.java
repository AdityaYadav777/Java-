package DSA;

import java.util.Scanner;

class Node{


    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }

}




public class LL2 {


    public static void main(String[] args) {
        

        Node head=new Node(0);
        addData(head);


    }


    public static void addData(Node head){

        Scanner sc=new Scanner(System.in);

        int n;

        Node tem=head;

        System.out.println("How Many Data Want to Store");
        n=sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println("Enter the "+ i +" Number");
            int t=sc.nextInt();
            Node a=new Node(t);
            a.next=tem;
            tem=head;
             
        }
       
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }

    }
    
}
