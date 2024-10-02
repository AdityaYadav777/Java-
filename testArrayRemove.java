public class testArrayRemove {
    public static void main(String[] args) {
        int a[]={3,2,2,3};
       
    int k=0;
    int target=3;
    for(int i=0;i<a.length;i++){
        if(a[i]!=target){
            a[k]=a[i];
            k++;
        }        
    }

for(int i=0;i<a.length-1;i++){
    System.out.println(a[i]);
}
        
    }
    
}
