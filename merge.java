public class merge {

    public static void main(String[] args) {

        int a[] = { 1,2,3,0,0,0};
        int b[] = { 2,5,6};

        int m = 3, n = 3;

        int arr[] = new int[n + m];


        int count = 0;
        for (int i = 0; i < m ; i++) {
            arr[i] = a[i];
            count++;
        }

        for (int i = 0; i < n ; i++) {

            arr[count] = b[i];
            count++;
        }

        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr.length;j++){
             if(arr[i]<arr[j]){
                 int t=arr[i];
                 arr[i]=arr[j];
                 arr[j]=t;
             }
            }
         }
 
         for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
