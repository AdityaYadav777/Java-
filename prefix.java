import java.util.Arrays;

public class prefix {

    public static void main(String[] args) {
     int a[]={1,1,2,2,3,3,5,5,6,6,10,7,7};
     Arrays.sort(a);


     int temp=0;

     for(int i=0;i<a.length;i++){

        int t=a[i];

        for(int j=1;j<a.length;j++){
            if(t!=a[j]){
             temp=t;
            }
        }

     }

System.out.println(a[temp]);

    }

}
