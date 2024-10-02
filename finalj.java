public class finalj {

    public static void main(String[] args) {
        
        alpha ob1=new alpha(1);
        ob1.Print();
        

        alpha b=new alpha(3);
        b.Print();



    }
    
}

class alpha{


    final int a;

    alpha(int data){
        this.a=data;
    }

       public void Print(){
         
        System.err.println(this.a);

       }


}
