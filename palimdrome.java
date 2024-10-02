public class palimdrome {
    public static void main(String[] args) {

        int a[] = { 1, 2, 5, 55 };

        int k=0;
        int target=6;
        for(int i=0;i<a.length;i++){

            if(i==a.length-1){
                if(target>a[i]){
                    k=i+1;
                }
            }
            if(target==a[i]){
                k=i;
            }
            
            if(target>a[i]){
                k=i+1;
            }
        }

        System.out.println(k);

    }

}
