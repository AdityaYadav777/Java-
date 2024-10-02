
class MyRunnable extends Thread{
public void run(){
    
  
    System.out.println("KEla MELA");
       
  }
}



class kolo extends Thread{
    public  void run(){
    System.out.println("Hello Anjali");
    }
}



public class thread {
   public static void main(String[] args) throws InterruptedException {
    kolo b= new kolo();
    MyRunnable a=new MyRunnable();
      Thread.sleep(1000);
    a.start();
    b.start() ;

   } 

}

