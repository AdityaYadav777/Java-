public class rec {
    
    static int facto(int n){
     
   
        if (n==0) {
            return 1;
        }
  
    

        int data= facto(n-1);

        System.out.println(n);
     return data;


    }


    public static void main(String[] args) {
        
       // System.out.println(facto(10));
 facto(10);
    }


}
