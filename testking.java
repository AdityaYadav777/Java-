class testking{

    public static void main(String[] args) {
 
        int a[]={1,2,3,2,4,5};
        int h=a.length;
   
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]<a[j]){
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }



        }
          for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
        }
    
        int temp[]=new int[a.length];
        for(int i=0;i<a.length-1;i++){
          
            if(a[i]!=a[i+1]){
                temp[i]=a[i];
            }

            }
for(int i=0;i<temp.length;i++){
    System.out.print(" "+temp[i]);
}

        }

    }

    
