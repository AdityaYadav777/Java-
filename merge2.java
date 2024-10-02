public class merge2 {

    public static void main(String[] args) {
        
        
        int a[] = { 0};
        int b[] = {1};

        int m = 0, n = 1;

        int i=m;
        int count=0;
        while(i<a.length){

            a[i]=b[count];
            count++;
            i++;
        }


        for ( i = 0; i < a.length; i++) {
            for(int j=0;j<a.length;j++){
             if(a[i] < a[j]){
                 int t=a[i];
                 a[i]=a[j];
                 a[j]=t;
             }
            }
         }
 

        for( i=0;i<a.length;i++){
            System.out.println(a[i]);
        }






    }
    
}
