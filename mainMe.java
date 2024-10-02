import java.util.Scanner;

class Test_toKin{
  
    void test(){
        System.out.println("Mai hu test");
    }
    
}

class testo_me extends Test_toKin{

    private String name;

    testo_me(String name){
this.name=name;
    }

    void meraHero(){
        System.out.println("mai hu " +name);
    }

    void test(){

        System.out.println("mai hu baccha wala");

    }

}

class mainMe{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Test_toKin a= new Test_toKin();
        // a.test();
        // System.out.println("Enter Kro Kuch");
        // String name=sc.nextLine();
        // System.out.println(name);



        // for(int i=0;i<200;i++){
            
        //     if(i<10){
        //         System.out.println(i);
        //     }
        // }




    //   int []arr=new int[10];

    //   for(int i=0;i<10;i++){
    //     arr[i]=i;

    //   }

    // //   for(int i=0;i<10;i++){
    // //     System.out.println(arr[i]);
    // //   }

    // // for(int i:arr){
    // //     System.out.println(i);
    // // }

    // int i=0;

    // while (i<10){

    //     System.out.println(arr[i]);
    //     i++;

    // }



testo_me a=new testo_me("aditya");

a.meraHero();
a.test();

    }
}