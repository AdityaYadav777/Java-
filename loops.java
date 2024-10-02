public class loops {
    public static void main(String[] args) {

        int arr[]=new int[45]; 

        for(int i=0;i<45;i++){
            arr[i]=i;
        }

        for (int i = 0; i < 10; i++) {



            fun(i);
            

        }

       int t=0;
       for (int i : arr) {
       
        if(i>t){
            t=i;

        }

    

       }
       System.err.println(t);

    }

    static void fun(int i) {
        System.err.println("Ka ho" + i);
    }

}


