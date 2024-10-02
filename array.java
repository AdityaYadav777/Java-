import java.util.ArrayList;
import java.util.LinkedList;

public class array {

    public static void main(String[] args) {
        
        ArrayList arr=new ArrayList<Integer>();
        arr.add(23);
       LinkedList ll=new LinkedList<Integer>();
       ll.add(3);
       ll.add(10);
       ll.add("090");

 
       ll.add(arr);








       for (int i=0;i<ll.size();i++){
        System.out.println(ll.get(i));
       }
       
        
        


    }

    
}
